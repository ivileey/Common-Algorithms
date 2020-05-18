package String;
/*
        KMP算法一种无回溯的字符串匹配算法，属于动态规划
* */
public class KMP {

    void getNext(String pattern, int[] next){
        next[0] = -1;
        int j = 0, k = -1;
        int len = pattern.length();
        while(j < len - 1) {
            if (k == -1 || pattern.charAt(j) == pattern.charAt(k)) {

                j++;
                k++;
                if (pattern.charAt(j) != pattern.charAt(k))
                    next[j] = k;
                else next[j] = next[k];
            }else{
                k = next[k];
            }
        }
    }

    int kmp_search(String target,String pattern){
        int next[] = new int[pattern.length()];
        getNext(pattern,next);
        int i = 0, j = 0;
        int target_len = target.length();
        int pattern_len = pattern.length();
        while(i < target_len){
            if(j == -1 || target.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }else{
                j = next[j];
            }

            if(j == pattern.length())
                return i - j;
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println(new KMP().kmp_search("abcdabcabbabcabc","abcabc"));
    }
}

package String;

public class BruteForce {

    public int search(String target, String pattern){
        int target_len = target.length();
        int parttern_len = pattern.length();

       for(int i = 0; i < target_len; i++){
           if(target.substring(i, i + parttern_len).equals(pattern))
           {
               return i;
           }
       }
        return -1;
    }

    public static void main(String[] args){
        BruteForce bf = new BruteForce();
        System.out.println(bf.search("ababadabcd", "abc"));
    }
}

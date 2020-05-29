package Sort.Insertion;
/*
直接插入排序 O(n2) 稳定
希尔排序 O(n(logn)2) 不稳定
* */
public class insertSort {
    public void insertSort(int[] num)
    {
        for(int i = 1; i < num.length; i++){
            int temp = num[i];
            int j;
            for(j = i - 1; j >= 0 && temp < num[j]; j--){
                num[j + 1] = num[j];
            }
            num[j + 1] = temp;
        }
    }

    public void shellSort(int[] num){
        int length = num.length;
        for(int delta = length/2; delta > 0; delta/=2)
        {
            for(int i = delta; i < length; i++)
            {
                int temp = num[i];
                int j;
                for(j = i - delta; j >= 0 && temp < num[j]; j-=delta)
                    num[j + delta] = num[j];
                num[j + delta] = temp;
            }
        }
    }
}

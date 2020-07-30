package Sort.exchange;
/*
* 冒泡排序 O(n2) 稳定
* 快速排序 O(nlogn2) 不稳定
* */
public class Exchange {
    public void bubbleSort(int[] num)
    {
        int length = num.length;
        boolean flag = true;
        for(int i = 1; i < length && flag; i++){
            flag = false;
            for(int j = 0; j < length - i; j++){
                if(num[j] > num[j+1])
                {
                    flag = true;
                    int temp = num[j];
                    num[j] =num[j + 1];
                    num[j+1] = temp;
                }
            }
        }
    }

    public void quickSort(int[] num)
    {
        quickSort(num,0,num.length - 1);
    }

    public void quickSort(int[] num, int start, int end){

        int len = num.length;
        if(start < end)
        {
            int i = start, j = end;
            int vot = num[i];
            while(i != j){
                while(i < j && num[j]>=vot)
                    j--;
                if(i < j){
                    num[i++] = num[j];
                }
                while(i < j && num[i]<= vot)
                    i++;
                if(i < j){
                    num[j--] = num[i];
                }
            }
            num[i] = vot;
            quickSort(num,i+1,end);
            quickSort(num,start,i-1);
        }
    }

}

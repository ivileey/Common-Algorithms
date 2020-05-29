package Sort.Select;

public class Select {

    public void selectSort(int[] num)
    {
        int length = num.length;
        for(int i = 0; i < length; i++)
        {
            int min = i;
            for(int j = i+1; j < length; j++)
            {
                if(num[j] < num[min])
                    min = j;
            }
            if(min != i)
            {
                int temp = num[i];
                num[i] = num[min];
                num[min] = temp;
            }
        }
    }

    private void sift_minheap(int[] num, int begin, int end){

        int parent = begin, child = 2*parent + 1;
        int value = num[parent];
        while(child <= end){
            if(child < end && num[child] > num[child + 1])
                child++;
            if(value > num[child]){
                num[parent] = num[child];
                parent = child;
                child = 2*parent + 1;
            }else
                break;
        }
        num[parent] = value;
    }
    public void heapSort(int[] num){

        int length = num.length;
        for(int i = length/2-1; i >= 0; i--)
            sift_minheap(num, i, length-1);
        for(int i = length - 1; i > 0; i--){
            int temp = num[0];
            num[0] = num[i];
            num[i] = temp;
            sift_minheap(num, 0, i-1);
        }
    }
}

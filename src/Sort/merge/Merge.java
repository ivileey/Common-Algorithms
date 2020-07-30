package Sort.merge;

public class Merge {

    void merge(int[] X, int[] Y, int begin1, int begin2, int n){

        int i = begin1, j = begin2, k = begin1;
        int len = X.length;
        while(i < begin1 + n && j < begin2 + n && j < len) {
            if(X[i] < Y[j])
                Y[k++] = X[i++];
            else
                Y[k++] = X[j++];
        }
        while(i < begin1 + n && i < len)
            Y[k++]=X[i++];
        while(j < begin2 + n && j < len)
            Y[k++]=X[j++];
    }

    void mergepass(int[] X, int[] Y, int n){

        int len = X.length;
        for(int i = 0; i < len; i+=2*n)
            merge(X,Y,i, i+n, n);
    }

    public void mergeSort(int[] X)
    {
        int len = X.length;
        int[] Y = new int[len];
        int n = 1;
        while(n<len){
            mergepass(X,Y,n);
            n*=2;
            if(n < len)
            {
                mergepass(Y, X, n);
                n*=2;
            }
        }
    }
}

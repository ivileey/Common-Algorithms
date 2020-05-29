package Test;

import Sort.Insertion.insertSort;
import Sort.Select.Select;
import Sort.exchange.Exchange;

import java.util.Arrays;

public class test {
    public static void main(String[] args){
        int[] num = {35, 5, 36, 65, 3};
        insertSort is = new insertSort();
//        is.insertSort(num);
        is.shellSort(num);

        Exchange exchange = new Exchange();
//        exchange.bubbleSort(num);
        exchange.quickSort(num);

        Select select = new Select();
//        select.selectSort(num);
        select.heapSort(num);
        System.out.println(Arrays.toString(num));
    }
}

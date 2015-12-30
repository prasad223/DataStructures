package GeeksForGeeks.Arrays;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by prasad223 on 12/24/15.
 */
public class ArrayFindPair {

    public static void main(String[] args){
        int[] arr = new int[]{4, 5, 2, 8, 9, 3, 9, 12, 8 , 10, 15, 10};
        int num = 20;

        quickSort(arr, 0, arr.length);

    }

    public static void quickSort(int[] arr, int low , int high){
        if(low >= high){
            return;
        }
        int pivotIndex = ThreadLocalRandom.current().nextInt(low, high);
        int pivot = arr[pivotIndex];


        return;
    }

    public static int findPivot(int[] arr, int low, int high){
        int pivot = 0;
        int pivotIndex = ThreadLocalRandom.current().nextInt(low,high);

        return pivot;
    }
}

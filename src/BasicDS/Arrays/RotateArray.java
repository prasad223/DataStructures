package BasicDS.Arrays;

import java.util.Arrays;

/**
 * Created by prasad223 on 1/23/16.
 *  Does not work when array size is grater than n/2 , as numbers are replaced incorrectly and values are not updated properly
 *  Need to reverse different parts and swap them.
 */

public class RotateArray {

    public static void main(String[] args) throws Exception{
        int[] arr ;
        for(int i = 1; i <= 6; i++){
            arr = new int[]{1,2,3,4,5,6};
            rotateArray(arr,i);
            System.out.println(Arrays.toString(arr));
        }

    }

    static void rotateArray(int[] nums, int k){
        int n = nums.length;
        int numRotations =(int) ((k > n/2) ? Math.ceil((double)n/k) : n/k);
        int curI, newI, prev, temp;
        temp = nums[0];
        curI = 0;
        for(int i = 0; i < k; i++){
            for(int j=0; j < numRotations;j++){
                prev = temp;
                newI = (curI + k )% n;
                temp = nums[newI];
                nums[newI] = prev;
                curI = newI;
            }
        }
    }
}

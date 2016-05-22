package InterviewBit.Arrays;

/**
 * Created by prasad on 5/20/16.
 */
public class MaxSumContArray {

    public  int getMaxSumSubArray(int[] array){
        if(array == null || array.length == 0){
            return 0;
        }
        int maxSum = 0;
        int sum = 0;
        for(int i = 0;i < array.length; i++){
            sum += array[i];
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        MaxSumContArray maxSumContArray = new MaxSumContArray();

    }
}

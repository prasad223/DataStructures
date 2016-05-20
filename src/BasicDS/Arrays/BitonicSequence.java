package BasicDS.Arrays;

/**
 * Created by prasad223 on 4/5/16.
 */
public class BitonicSequence {

    int findPivotElement(int[] sequence){
        if(sequence == null || sequence.length == 0){
            return -1;
        } else if(sequence.length == 1){
            return sequence[0];
        }else if(sequence.length == 2){
            return Math.max(sequence[0],sequence[1]);
        }

        int start = 0;
        int end = sequence.length-1;
        int mid;
        while(end > start){
            mid = (start + end) / 2;
            if(sequence[mid] > sequence[mid+1] && sequence[mid] > sequence[mid-1]){
                return sequence[mid];
            }
            if(sequence[mid] > sequence[mid-1] && sequence[mid] < sequence[mid+1]){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }

        return 0;
    }
}

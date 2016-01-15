package LeetCode;

/**
 * Created by prasad223 on 1/12/16.
 */
public class ArrayDuplicateoN {

    static int findArrayDuplicate(int[] nums){
        int l = 1 , h = nums.length-1;
        int mid, count, i;
        while(l <= h){
            count = 0;
            mid = (l+h)/2;
            for(i = 0; i < nums.length;i++){
                if(nums[i] <= mid){
                    count++;
                }
            }
            if(count > mid){
                h = mid-1;
            }else{
                l = mid +1;
            }
        }
        return l;
    }
    public static void main(String[] args){
        int[] array = new int[]{1,1,2,4,3};
        System.out.println(findArrayDuplicate(array));
    }
}

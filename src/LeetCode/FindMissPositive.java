package LeetCode;

import java.util.Arrays;

/**
 * Created by prasad223 on 1/4/16.
 */
public class FindMissPositive {

  public static void main(String[] args) {
    FindMissPositive f = new FindMissPositive();
        /*System.out.println(f.firstMissingPositive(new int[]{-1,1000}));
        System.out.println(f.firstMissingPositive(new int[]{-1}));
        System.out.println(f.firstMissingPositive(new int[]{1}));
        System.out.println(f.firstMissingPositive(new int[]{2}));*/
    System.out.println(f.firstMissingPositive(new int[]{2, 1, 1, 0, -1, -4}));
  }

  public int segregate(int[] nums) {
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] <= 0) {
        nums[j] = nums[j] ^ nums[i];
        nums[i] = nums[j] ^ nums[i];
        nums[j] = nums[j] ^ nums[i];
        j++;
      }
    }
    return j;
  }

  public int firstMissingPositive(int[] nums) {
    int shift = segregate(nums), t;
    int[] temp = Arrays.copyOfRange(nums, shift, nums.length);
    for (int i = 0; i < temp.length; i++) {
      t = Math.abs(temp[i]);
      if (t - 1 < temp.length && temp[t - 1] > 0) {
        temp[t - 1] = -temp[t - 1];
      }
    }
    for (int i = 0; i < temp.length; i++) {
      if (temp[i] > 0) {
        return i + 1;
      }
    }
    return temp.length + 1;
  }
}

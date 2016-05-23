package InterviewBit.Arrays;

import java.util.List;

/**
 * Created by prasad on 5/21/16.
 */
public class FirstMissingPositive {

  /*
   * This is incomplete code, assumes the list to be sorted , need to modify it to use unsorted array
   */
  public int findFirstMissingPositive(List<Integer> a) {
    int num = 1;
    for (int n : a) {
      if (n > 0 && n == num) {
        num++;
      }
    }
    return num;
  }
}

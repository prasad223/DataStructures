package InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prasad on 5/22/16.
 */
public class MaxNonNegSubArray {

  /**
   * Always use long when trying to sum up a lot of integers
   *
   * @param a : list of integers
   * @return sub array
   */
  public List<Integer> maxNonNegArray(ArrayList<Integer> a) {
    if (a == null || a.size() == 0) {
      return a;
    }
    long maxSum = 0;
    long sum = 0;
    int startIndex = -1;
    int maxStartIndex = 0;
    int len = 0;
    int maxLen = 0;
    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) < 0) {
        startIndex = -1;
        len = 0;
        sum = 0;
        continue;
      }
      if (startIndex == -1) {
        startIndex = i;
      }
      len++;
      sum += a.get(i);
      if (sum > maxSum || (sum == maxSum && ((len > maxLen) || (len == maxLen && startIndex < maxStartIndex)))) {
        maxSum = sum;
        maxStartIndex = startIndex;
        maxLen = len;
      }
    }
    return new ArrayList<>(a.subList(maxStartIndex, maxStartIndex + maxLen));
  }

}

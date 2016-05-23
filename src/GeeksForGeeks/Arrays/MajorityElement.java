package GeeksForGeeks.Arrays;

/**
 * Created by prasad223 on 2/4/16.
 * <p>
 * <p>
 * This returns the majority element of an array, occuring most number of times
 * This uses moore's voting algorithm
 */
public class MajorityElement {

  public int getMajorityElement(int[] array) {
    int majorIndex = findCandidateIndex(array);
    int count = 0;
    for (int num : array) {
      if (num == array[majorIndex]) {
        count++;
        // you can remove this check and add a check below for actual majority element
        if (count >= array.length / 2) {
          break;
        }
      }
    }
    return array[majorIndex];
  }

  private int findCandidateIndex(int[] array) {
    int majorIndex = 0;
    int count = 1;
    for (int i = 1; i < array.length; i++) {
      if (array[i] == array[majorIndex]) {
        count++;
      } else {
        count--;
        if (count == 0) {
          count = 1;
          majorIndex = i;
        }
      }
    }
    return majorIndex;
  }
}

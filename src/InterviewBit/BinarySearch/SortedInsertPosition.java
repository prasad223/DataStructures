package InterviewBit.BinarySearch;

import java.util.ArrayList;

/**
 * Created by prasad on 5/27/16.
 */
public class SortedInsertPosition {

  public int findIndexOfElement(ArrayList<Integer> a, int b) {
    if (a == null || a.size() == 0 || b < a.get(0)) {
      return 0;
    }
    if (b > a.get(a.size() - 1)) {
      return a.size();
    }
    int l = 0;
    int h = a.size() - 1;
    int mid;
    while (l <= h) {
      mid = l + (h - l) / 2;
      if (b == a.get(mid) || (b < a.get(mid) && b > a.get(mid - 1))) {
        return mid;
      }
      if (b > a.get(mid) && b < a.get(mid + 1)) {
        return mid + 1;
      }
      if (b < a.get(mid)) {
        h = mid - 1;
      } else {
        l = mid + 1;
      }
    }
    return h + 1;
  }

}

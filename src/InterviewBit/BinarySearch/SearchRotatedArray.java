package InterviewBit.BinarySearch;

import java.util.ArrayList;

/**
 * Created by prasad on 5/27/16.
 */
public class SearchRotatedArray {

  public int srcRotatedArray(ArrayList<Integer> a, int b) {
    if (a == null || a.size() == 0) {
      return -1;
    }
    int l = 0;
    int h = a.size() - 1;
    int mid;
    while (l <= h) {
      mid = l + (h - l) / 2;
      if (a.get(mid) == b) {
        return mid;
      }
      if (a.get(l) <= a.get(mid)) {
        if (a.get(l) <= b && b < a.get(mid)) {
          h = mid - 1;
        } else {
          l = mid + 1;
        }
      } else {
        if (a.get(mid) < b && b <= a.get(h)) {
          l = mid + 1;
        } else {
          h = mid - 1;
        }
      }
    }
    return -1;
  }
}

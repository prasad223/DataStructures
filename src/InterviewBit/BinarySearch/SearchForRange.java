package InterviewBit.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by prasad on 5/26/16.
 */
public class SearchForRange {

  public ArrayList<Integer> findRange(ArrayList<Integer> a, int b) {
    ArrayList<Integer> result = new ArrayList<>(Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE));
    int l = 0;
    int h = a.size() - 1;
    int mid;
    while (l <= h) {
      mid = l + (h - l) / 2;
      if (a.get(mid) == b) {
        int sl = l;
        int sh = mid - 1;
        int sMid;
        result.set(0, mid);
        result.set(1, mid);
        while (sl <= sh) {
          sMid = sl + (sh - sl) / 2;
          if (a.get(sMid) == b && (sMid == 0 || a.get(sMid - 1) < b)) {
            result.set(0, Math.min(sMid, result.get(1)));
          }
          if (a.get(sMid) < b) {
            sl = sMid + 1;
          } else {
            sh = sMid - 1;
          }
        }
        int el = mid + 1;
        int eh = h;
        int eMid;
        while (el <= eh) {
          eMid = el + (eh - el) / 2;
          if (a.get(eMid) == b && (eMid == h || a.get(eMid + 1) > b)) {
            result.set(1, Math.max(eMid, result.get(1)));
          }
          if (a.get(eMid) > b) {
            eh = eMid - 1;
          } else {
            el = eMid + 1;
          }
        }
        return result;
      }
      if (b < a.get(mid)) {
        h = mid - 1;
      } else {
        l = mid + 1;
      }
    }
    return new ArrayList<>(Arrays.asList(-1, -1));
  }
}

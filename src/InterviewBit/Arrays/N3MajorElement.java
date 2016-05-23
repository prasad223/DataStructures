package InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by prasad on 5/22/16.
 */
public class N3MajorElement {

  public int n3MajorElement(ArrayList<Integer> a) {
    if (a == null || a.size() == 0) {
      return -1;
    }
    if (a.size() <= 2) {
      return a.get(0);
    }
    HashMap<Integer, Integer> count = new HashMap<>();
    for (int i : a) {
      if (count.containsKey(i)) {
        int c = count.get(i);
        c++;
        if (c > a.size() / 3) {
          return i;
        }
        count.put(i, c);
      } else {
        count.put(i, 1);
      }
    }
    for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
      if (entry.getValue() > a.size() / 3) {
        return entry.getKey();
      }
    }
    return -1;
  }

}

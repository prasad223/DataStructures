package InterviewBit.Math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by prasad on 5/24/16.
 */
public class FactorsNumber {

  public ArrayList<Integer> findFactorsOfNum(int a) {
    if (a == 0) {
      return new ArrayList<Integer>() {{
        add(a);
      }};
    }
    HashSet<Integer> result = new HashSet<Integer>() {{
      add(1);
      add(a);
    }};
    int n = (int) Math.ceil(Math.sqrt(a));
    for (int i = 2; i <= n; i++) {
      if (a % i == 0) {
        result.add(i);
        result.add(a / i);
      }
    }
    ArrayList<Integer> res = new ArrayList<>(result);
    Collections.sort(res);
    return res;
  }

}

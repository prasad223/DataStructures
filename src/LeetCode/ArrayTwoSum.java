package LeetCode;

import java.util.*;

/**
 * Created by prasad223 on 1/2/16.
 */
public class ArrayTwoSum {

  public static void main(String[] args) {
    int[] nums = new int[]{5, 75, 25};
    int num = 100;
    int i1, i2;
    Map<Integer, Set<Integer>> vals = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (vals.containsKey(nums[i])) {
        vals.get(nums[i]).add(i);
      } else {
        Set<Integer> t = new HashSet<Integer>();
        t.add(i);
        vals.put(nums[i], t);
      }
    }
    int a, b;
    for (Map.Entry<Integer, Set<Integer>> entry : vals.entrySet()) {
      a = entry.getKey();
      b = num - a;
      if (a != b) {
        if (vals.containsKey(b)) {
          i1 = vals.get(a).iterator().next();
          i2 = vals.get(b).iterator().next();
          int[] res = new int[]{i1 + 1, i2 + 1};
          Arrays.sort(res);
          System.out.println(Arrays.toString(res));
          return;
        }
      } else {
        Iterator<Integer> temp = vals.get(a).iterator();
        i1 = temp.next();
        if (temp.hasNext()) {
          i2 = temp.next();
          System.out.println(i1 + " , " + i2);
          return;
        }

      }
    }
  }
}

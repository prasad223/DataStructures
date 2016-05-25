package InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by prasad on 5/23/16.
 */
public class PascalTraingle {

  public ArrayList<ArrayList<Integer>> genNPascalTriangle(int a) {
    if (a == 0) {
      return null;
    }
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    result.add(new ArrayList<Integer>() {{
      add(1);
    }});
    int c1, c2;
    int row;
    int col;
    for (row = 1; row < a; row++) {
      result.add(row, new ArrayList<Integer>());
      result.get(row).add(1);
      for (col = 1; col < row; col++) {
        c1 = result.get(row - 1).get(col - 1);
        c2 = 0;
        if (col < result.get(row - 1).size()) {
          c2 = result.get(row - 1).get(col);
        }
        result.get(row).add(c1 + c2);
      }
      result.get(row).add(1);
    }
    return result;
  }

  public ArrayList<Integer> genNthRowPascalTraingle(int a) {
    ArrayList<Integer> result = new ArrayList<Integer>(Collections.nCopies(a + 1, 0));
    result.set(0, 1);
    int c1;
    int c2 = 0;
    for (int row = 1; row <= a; row++) {
      int col = 1;
      c2 = result.get(0);
      for (col = 1; col < row; col++) {
        c1 = c2;
        c2 = result.get(col);
        result.set(col, c1 + c2);
      }
      result.set(col, 1);
    }
    return result;
  }

}

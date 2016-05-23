package InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prasad on 5/20/16.
 */
public class MatrixSpiral {

  public static void main(String[] args) {
    MatrixSpiral matrixSpiral = new MatrixSpiral();
    List<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
    a.add(new ArrayList<Integer>() {{
      add(1);
      add(2);
      add(3);
    }});
    a.add(new ArrayList<Integer>() {{
      add(4);
      add(5);
      add(6);
    }});
    a.add(new ArrayList<Integer>() {{
      add(7);
      add(8);
      add(9);
    }});
    System.out.println(matrixSpiral.spiralOrder(a));
  }

  public ArrayList<Integer> getSpiralI(final List<ArrayList<Integer>> a, int r, int c, int row, int col) {
    ArrayList<Integer> result = new ArrayList<>();
    int i = r;
    int j = c;
    while (j <= col) {
      result.add(a.get(i).get(j));
      j++;
    }
    i++;
    while (i <= row) {
      result.add(a.get(i).get(col));
      i++;
    }
    i--;
    j--;
    if (i > r && j > c) {
      j = col - 1;
      while (j >= c) {
        result.add(a.get(i).get(j));
        j--;
      }
      i = row - 1;
      if (i > r) {
        j = c;
        while (i > r) {
          result.add(a.get(i).get(j));
          i--;
        }
      }

    }
    return result;
  }

  // DO NOT MODIFY THE LIST
  public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    // Populate result;
    int r = 0;
    int c = 0;
    int R = a.size() - 1;
    int C = a.get(0).size() - 1;

    while (r <= R && c <= C) {
      result.addAll(getSpiralI(a, r, c, R, C));
      r++;
      c++;
      R--;
      C--;
    }
    return result;
  }
}

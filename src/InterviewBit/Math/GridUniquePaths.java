package InterviewBit.Math;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by prasad on 5/25/16.
 */
public class GridUniquePaths {

  public static void rearrangeArray(ArrayList<Integer> a) {
    int n = a.size();
    if (n == 1) {
      return;
    }
    for (int i = 0; i < n; i++) {
      a.set(i, a.get(i) * n);
    }
    for (int i = 0; i < n; i++) {
      int t = a.get(i) + a.get(a.get(i) / n) / n;
      a.set(i, t);
    }
    for (int i = 0; i < n; i++) {
      a.set(i, a.get(i) % n);
    }
  }

  public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 0));
    System.out.println(array);
    rearrangeArray(array);
    System.out.println(array);
  }

  public int pathsMNGrid(int a, int b) {
    int count[][] = new int[a][b];

    for (int i = 0; i < a; i++) {
      count[i][0] = 1;
    }
    for (int i = 0; i < b; i++) {
      count[0][i] = 1;
    }
    for (int i = 1; i < a; i++) {
      for (int j = 1; j < b; j++) {
        count[i][j] = count[i - 1][j] + count[i][j - 1];
      }
    }
    return count[a - 1][b - 1];
  }
}

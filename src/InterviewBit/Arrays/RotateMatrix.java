package InterviewBit.Arrays;

import java.util.ArrayList;

/**
 * Created by prasad on 5/23/16.
 * TODO: Incomplete code, doesn't work for matrix 4x4 and above, need to do it later.
 */
public class RotateMatrix {

  public ArrayList<ArrayList<Integer>> rotateMatrix(ArrayList<ArrayList<Integer>> a) {
    int n = a.size();
    for (int i = 0; i <= n / 2; i++) {
      for (int j = 0; j <= n / 2; j++) {
        int temp = a.get(i).get(j);
        a.get(i).set(j, a.get(n - 1 - j).get(i));
        a.get(n - 1 - j).set(i, a.get(n - 1 - j).get(n - 1 - j));
        a.get(n - 1 - j).set(n - 1 - j, a.get(j).get(n - 1 - i));
        a.get(j).set(n - 1 - i, temp);
      }
    }
    return a;
  }
}

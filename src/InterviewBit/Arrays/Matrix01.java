package InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by prasad on 5/22/16.
 */
public class Matrix01 {

  public ArrayList<ArrayList<Integer>> matrix01(ArrayList<ArrayList<Integer>> a) {
    int m = a.size();
    int n = a.get(0).size();
    HashSet<Integer> rows = new HashSet<>();
    HashSet<Integer> columns = new HashSet<>();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (a.get(i).get(j) == 0) {
          rows.add(i);
          columns.add(j);
        }
      }
    }

    for (int r : rows) {
      for (int i = 0; i < n; i++) {
        a.get(r).set(i, 0);
      }
    }
    for (int c : columns) {
      for (int i = 0; i < m; i++) {
        a.get(i).set(c, 0);
      }
    }
    return a;
  }

/*
  public ArrayList<ArrayList<Integer>> nullRowColumn(ArrayList<ArrayList<Integer>> matrix, int row, int col){
    matrix.get(row).set(col,0);
    for(int i = 0; i < matrix.size(); i++){
      matrix.get(i).set(col,0);
    }
    for(int i = 0; i < matrix.get(row).size(); i++){
      matrix.get(row).set(i,0);
    }
    return matrix;
  }
*/

}

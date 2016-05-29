package InterviewBit.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by prasad on 5/26/16.
 */
public class SearchMatrix {

  public static boolean searchInMatrix(ArrayList<ArrayList<Integer>> a, int b) {
    if (a.size() == 0 || a.get(0).size() == 0) {
      return false;
    }
    int ml = 0;
    int mh = a.size() - 1;
    int nl = 0;
    int nh = a.get(0).size() - 1;
    int mMid, nMid;
    while (ml <= mh) {
      mMid = ml + (mh - ml) / 2;
      if (b >= a.get(mMid).get(0) && b <= a.get(mMid).get(nh)) {
        while (nl <= nh) {
          nMid = nl + (nh - nl) / 2;
          if (b == a.get(mMid).get(nMid)) {
            return true;
          }
          if (b < a.get(mMid).get(nMid)) {
            nh = nMid - 1;
          } else {
            nl = nMid + 1;
          }
        }
      }
      if (b < a.get(mMid).get(0)) {
        mh = mMid - 1;
      } else {
        ml = mMid + 1;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> input = new ArrayList<>();
    input.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
    input.add(new ArrayList<>(Arrays.asList(3, 5, 7)));
    input.add(new ArrayList<>(Arrays.asList(7, 8, 9)));
    System.out.println(searchInMatrix(input, 5));
    System.out.println(searchInMatrix(input, 6));
    System.out.println(searchInMatrix(input, 4));
    input = new ArrayList<>();
    input.add(new ArrayList<>(Arrays.asList(1)));
    input.add(new ArrayList<>(Arrays.asList(1)));
    input.add(new ArrayList<>(Arrays.asList(1)));
    System.out.println(searchInMatrix(input, 1));
    System.out.println(searchInMatrix(input, 5));
    System.out.println(searchInMatrix(new ArrayList<>(), 4));
    input = new ArrayList<>();
    input.add(new ArrayList<>(Arrays.asList(1)));
    System.out.println(searchInMatrix(input, 1));
  }

}

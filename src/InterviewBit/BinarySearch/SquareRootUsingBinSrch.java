package InterviewBit.BinarySearch;

/**
 * Created by prasad on 5/26/16.
 */
public class SquareRootUsingBinSrch {

  public static boolean canOverflow(int n) {
    int x = n * n;
    if (n != 0 && x / n != n) {
      return true;
    }
    return false;
  }

  /**
   * if (x == 0) return 0;
   * int start = 1, end = x, ans;
   * while (start <= end) {
   * int mid = (start + end) / 2;
   * if (mid <= x / mid) {
   * start = mid + 1;
   * ans = mid;
   * } else {
   * end = mid - 1;
   * }
   * }
   * return ans;
   * }
   */

  public static int findSquareRoot(int a) {
    int h = a >> 1;
    int l = 1;
    int mid;
    while (l <= h) {
      if (canOverflow(h)) {
        h = 46340;
        continue;
      }
      mid = l + (h - l) / 2;
      if (mid * mid == a || (mid * mid < a && ((mid + 1) * (mid + 1) > a || canOverflow(mid + 1)))) {
        return mid;
      }
      if (mid * mid < a) {
        l = mid + 1;
      } else {
        h = mid - 1;
      }
    }
    return 1;
  }

  public static void main(String[] args) {
    System.out.println(findSquareRoot(145));
    System.out.println(findSquareRoot(4));
    System.out.println(findSquareRoot(1));
    System.out.println(findSquareRoot(0));
    System.out.println(findSquareRoot(Integer.MAX_VALUE));
  }

}

package InterviewBit.BinarySearch;

/**
 * Created by prasad on 5/27/16.
 */
public class PowerFunctionBinSrc {

  /**
   * Most optimised solution by Barry
   *
   * @param x
   * @param n
   * @param d
   * @return
   */
  public int power(int x, int n, int d) {
    long result = binPower(x, n, d);
    if (result < 0) {
      result = d + result;
    }
    return (int) result;
  }

  public long binPower(int x, int n, int d) {
    long result;
    if (n == 0) {
      return 1 % d;
    } else if (n == 1) {
      return x % d;
    } else {
      long x1 = binPower(x, n / 2, d);
      result = ((x1 % d) * (x1 % d)) % d;
      if (n % 2 == 1) {
        result = (result * (x % d)) % d;
      }
    }
    return result;
  }
}

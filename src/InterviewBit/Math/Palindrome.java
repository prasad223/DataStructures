package InterviewBit.Math;

/**
 * Created by prasad on 5/24/16.
 */
public class Palindrome {

  /*
   * In palindrome, errors
   * 1) Integer overflow
   * 2) odd even lengths
   * 3) numbers containing 0s in between
   * 4) negative numbers
   */
  public static boolean isPalindrome(int a) {
    int c = getCount(a);
    int i = 1;
    while (c >= i) {
      int t1 = (a / (int) Math.pow(10, c)) % 10;
      int t2 = (a % (int) Math.pow(10, i)) / (int) Math.pow(10, i - 1);
      i++;
      c--;
      if (t1 != t2) {
        return false;
      }
    }
    return true;
  }

  public static int getCount(int t) {
    int c = 0;
    while ((t = t / 10) > 0) {
      c++;
    }
    return c;
  }

  public static int reverseInteger(int a) {
    boolean isNeg = (a < 0);
    long rev = 0;
    a = Math.abs(a);
    while (a > 0) {
      rev = (rev * 10) + (a % 10);
      if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
        return 0;
      }
      a /= 10;
    }
    if (isNeg) {
      rev = -rev;
    }
    return (int) rev;
  }

  public static int factorialZero(int a) {
    int nZero = 0;
    int p = 1;
    while (a >= (int) Math.pow(5, p)) {
      nZero += a / (int) Math.pow(5, p);
      p++;
    }
    return nZero;
  }

  public static void main(String[] args) {

    System.out.println(factorialZero(1));
    System.out.println("1 = " + factorialZero(5));
    System.out.println("2 = " + factorialZero(10));
    System.out.println("6 = " + factorialZero(25));
    System.out.println("18 = " + factorialZero(75));
    System.out.println("31 = " + factorialZero(125));
    System.out.println("24 = " + factorialZero(100));

    /*System.out.println(isPalindrome(1000021));
    System.out.println(isPalindrome(12121));
    System.out.println(isPalindrome(121));
    System.out.println(isPalindrome(12));
    System.out.println(isPalindrome(1));
    System.out.println("1001, " + isPalindrome(1001));
    System.out.println("1010101, " + isPalindrome(1010101));
    System.out.println(isPalindrome(121212121));
    System.out.println(isPalindrome(2147447412));
    System.out.println("123 = " + reverseInteger(123));
    System.out.println("-123 = " + reverseInteger(-123));
    System.out.println(Integer.MAX_VALUE + " = " + reverseInteger(Integer.MAX_VALUE));
    System.out.println(Integer.MIN_VALUE + " = " + reverseInteger(Integer.MIN_VALUE));
    System.out.println("2143847412= " + reverseInteger(2143847412));
    System.out.println("-2143847412= " + reverseInteger(-2143847412));
    System.out.println("0 = " + reverseInteger(0));
    System.out.println("2147447412 = " + reverseInteger(2147447412));
    System.out.println("121212121 = " + reverseInteger(121212121));
    System.out.println("-1001 = " + reverseInteger(-1001));
    System.out.println("1010101 = " + reverseInteger(1010101));*/

  }

  public int gcd(int m, int n) {
    while (n != 0) {
      int temp = n;
      n = m % n;
      m = temp;
    }
    return m;
  }

}

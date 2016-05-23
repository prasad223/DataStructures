package ProjectEuler;

import java.util.Scanner;

/**
 * Created by prasad223 on 1/17/16.
 */
public class EvenFibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testCount = sc.nextInt();
    long[] evenFib = new long[30];
    long max = (long) (4 * Math.pow(10, 16));
    evenFib[0] = 2;
    evenFib[1] = 8;
    for (int i = 2; i < 30; i++) {
      evenFib[i] = (evenFib[i - 1] << 2) + evenFib[i - 2];
    }
    long n;
    long sum;
    int j;
    for (int i = 0; i < testCount; i++) {
      n = sc.nextLong();
      j = 0;
      sum = 0;
      while (evenFib[j] < n) {
        sum += evenFib[j];
        j++;
      }
      System.out.println(sum);
    }
  }
}

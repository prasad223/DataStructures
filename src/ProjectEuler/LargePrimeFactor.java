package ProjectEuler;

import java.util.Scanner;

/**
 * Created by prasad223 on 1/17/16.
 */
public class LargePrimeFactor {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testCount = sc.nextInt();
    long n, nHalf, j;
    long rem;

    for (int i = 0; i < testCount; i++) {
      n = sc.nextLong();
      nHalf = (long) Math.sqrt(n);
      j = 2;
      while (j <= nHalf || n > 1) {
        rem = n % j;
        if (rem == 0) {
          n = n / j;
        } else {
          if (j == 2) {
            j++;
          } else {
            j += 2;
          }
        }
      }
      if (n == 1) {
        System.out.println(j);
      } else {
        System.out.println(n);
      }
    }
  }

}

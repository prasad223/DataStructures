package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by prasad223 on 1/15/16.
 */
public class DecimalToBinary {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testCount = sc.nextInt();
    int num;
    int rem;
    List<Integer> binNum = new ArrayList<>();
    for (int i = 0; i < testCount; i++) {
      num = sc.nextInt();
      binNum.clear();
      while (num > 1) {
        rem = num % 2;
        num = num / 2;
        binNum.add(rem);
      }
      if (num == 1 || binNum.size() == 0) {
        binNum.add(num);
      }
      for (int j = binNum.size() - 1; j >= 0; j--) {
        System.out.print(binNum.get(j));
      }
      System.out.println();
    }
  }
}

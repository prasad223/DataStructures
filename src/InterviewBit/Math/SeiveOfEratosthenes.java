package InterviewBit.Math;

import java.util.ArrayList;

/**
 * Created by prasad on 5/24/16.
 */
public class SeiveOfEratosthenes {

  public static ArrayList<Integer> genSeiveEratosthenes(int a) {
    ArrayList<Integer> result = new ArrayList<>(a + 1);
    for (int i = 0; i <= a; i++) {
      result.add(i);
    }
    int n = (int) Math.ceil(Math.sqrt(a));
    for (int i = 2; i <= n; i++) {
      int j = 2;
      while (i * j <= a) {
        result.set(i * j, 0);
        j++;
      }
    }
    ArrayList<Integer> resp = new ArrayList<>();
    for (int i = 2; i <= a; i++) {
      if (result.get(i) != 0) {
        resp.add(i);
      }
    }
    return resp;
  }

  public static void main(String[] args) {
    System.out.println("Seive: " + genSeiveEratosthenes(100));
    System.out.println(genSeiveEratosthenes(100).size());
  }
}

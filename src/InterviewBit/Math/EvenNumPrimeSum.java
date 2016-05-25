package InterviewBit.Math;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by prasad on 5/24/16.
 */
public class EvenNumPrimeSum {

  public ArrayList<Integer> genSeiveEratosthenes(int a) {
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


  public ArrayList<Integer> genPrimeSum(int a) {
    ArrayList<Integer> result = new ArrayList<>(2);
    int p1, p2, fp1 = a, fp2 = a;
    HashSet<Integer> primes = new HashSet<>(genSeiveEratosthenes(a));
    for (int i : primes) {
      p1 = i;
      p2 = a - i;
      if (primes.contains(p2)) {
        if (p1 < fp1 || (p1 == fp1 && p2 < fp2)) {
          fp1 = p1;
          fp2 = p2;
        }
      }
    }
    result.add(fp1);
    result.add(fp2);
    return result;
  }
}

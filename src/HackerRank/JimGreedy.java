package HackerRank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by prasad223 on 1/28/16.
 */
public class JimGreedy {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final int A = 65;
    final int a = 97;
    int n = Integer.parseInt(br.readLine());
    String str = br.readLine();
    int k = Integer.parseInt(br.readLine());
    char[] chars = new char[n];
    int t;
    int diff;
    System.out.println(new String(chars));
    for (int i = 0; i < n; i++) {
      if (Character.isLetter(str.charAt(i))) {
        t = (int) str.charAt(i);
        diff = (t >= a) ? a : A;
        t = (t - diff + k) % 26;
        t += diff;
        System.out.println(t + " " + (char) t + " " + str.charAt(i));
        chars[i] = (char) t;
        System.out.println(t + " " + (char) t + " " + str.charAt(i));
      } else {
        chars[i] = str.charAt(i);
      }
    }
    System.out.println(new String(chars));
  }
}

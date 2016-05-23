package ProjectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * Created by prasad223 on 1/1/16.
 */
public class Sum35 {

  static Map<Long, Long> sum3;
  static Map<Long, Long> sum5;

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int testCasesCount = Integer.parseInt(bufferedReader.readLine());
    long cap;

    for (int i = 0; i < testCasesCount; i++) {
      cap = Long.parseLong(bufferedReader.readLine());
      System.out.println();
    }
  }
}

package LeetCode;

import java.util.Arrays;

/**
 * Created by prasad223 on 1/2/16.
 */
public class MultiplyStrings {

  public static String multiplyStrings(String num1, String num2) {
    char[] res = new char[num1.length() + num2.length()];
    int sum = 0, carry = 0, k = 0, m = 0;
    for (k = 0; k < res.length; k++) {
      res[k] = '0';
    }
    k = 1;
    int n1, n2, n3;
    for (int i = num1.length() - 1; i >= 0; i--) {
      m = res.length - k;
      n1 = Character.getNumericValue(num1.charAt(i));
      for (int j = num2.length() - 1; j >= 0; j--) {
        n2 = Character.getNumericValue(num2.charAt(j));
        n3 = Character.getNumericValue(res[m]);
        sum = n1 * n2 + n3 + carry;
        carry = sum / 10;
        sum = sum % 10;
        res[m--] = (char) (sum + '0');
      }
      if (carry != 0) {
        while (carry > 0) {
          res[m] = (char) (carry % 10 + '0');
          carry = carry / 10;
          m = Math.max(m - 1, 0);
        }
      }
      k++;
    }
    for (k = 0; k < res.length; k++) {
      if (res[k] != '0') {
        break;
      }
    }
    k = Math.min(k, res.length - 1);
    return new String(Arrays.copyOfRange(res, k, res.length));
  }

  public static void main(String[] args) {
    String s1 = new String("123");
    String s2 = new String("456");
    System.out.println(multiplyStrings(s1, s2));
  }
}

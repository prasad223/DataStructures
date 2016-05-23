package LeetCode;

/**
 * Created by prasad223 on 1/3/16.
 */
public class AddBinary {

  public static String addBinary(String a, String b) {
    char[] result = new char[a.length() + b.length()];
    for (int i = 0; i < result.length; i++) {
      result[i] = '0';
    }
    int i = a.length() - 1, j = b.length() - 1, k = result.length - 1;
    int n, m, sum, carry = 0;
    while (i >= 0 && j >= 0) {
      n = (a.charAt(i--) == '0') ? 0 : 1;
      m = (b.charAt(j--) == '0') ? 0 : 1;
      sum = (n + m + carry) % 2;
      carry = (n + m + carry) / 2;
      result[k--] = (sum == 0) ? '0' : '1';
    }
    if (i == -1) {
      while (j >= 0) {
        m = (b.charAt(j--) == '0') ? 0 : 1;
        sum = (m + carry) % 2;
        carry = (m + carry) / 2;
        result[k--] = (sum == 0) ? '0' : '1';
      }
    } else if (j == -1) {
      while (i >= 0) {
        m = (a.charAt(i--) == '0') ? 0 : 1;
        sum = (m + carry) % 2;
        carry = (m + carry) / 2;
        result[k--] = (sum == 0) ? '0' : '1';
      }
    }
    if (carry != 0) {
      result[k] = (carry == 0) ? '0' : '1';
    }
    k = 0;
    for (; k < result.length; k++) {
      if (result[k] != '0') {
        break;
      }
    }
    k = Math.min(k, result.length - 1);
    return new String(result).substring(k);
  }

  public static void main(String[] args) {
    System.out.println(addBinary("11", "1"));
  }
}

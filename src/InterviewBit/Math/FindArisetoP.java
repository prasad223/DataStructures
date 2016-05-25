package InterviewBit.Math;

import java.util.ArrayList;

/**
 * Created by prasad on 5/24/16.
 */
public class FindArisetoP {

  public static int excelTitle(String a) {
    int response = 0;
    int p = 0;
    for (int i = a.length() - 1; i >= 0; i--) {
      int num = ((int) a.charAt(i)) - ((int) 'A') + 1;
      response += num * Math.pow(26, p);
      p++;
    }
    return response;
  }


  public static String excelNumber(int a) {
    StringBuffer sb = new StringBuffer();
    int num = 0;
    while (a > 0) {
      if (a % 26 == 0) {
        num = 26;
        a = (a / 26) - 1;
      } else {
        num = a % 26;
        a = a / 26;
      }
      char ch = (char) ('A' + (num - 1));
      sb.insert(0, ch);
    }
    return sb.toString();
  }

  public static ArrayList<Integer> findAPNum(int a) {
    int p = 1;
    ArrayList<Integer> result = new ArrayList<>();
    boolean found = false;
    int n = (int) Math.ceil(Math.sqrt(a));
    for (int i = 2; i <= n; i++) {
      if (a % i == 0) {
        int num = (int) Math.pow(i, p);
        while (num <= a) {
          p++;
          num = (int) Math.pow(i, p);
          if (num == a) {
            found = true;
            result.add(i);
            result.add(p);
            break;
          }
        }
        if (found == true) {
          break;
        } else {
          p = 1;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    /*System.out.println(findAPNum(4));
    System.out.println(excelTitle("A"));
    System.out.println(excelTitle("Z"));
    System.out.println(excelTitle("AA"));
    System.out.println(excelTitle("AB"));*/
    System.out.println(excelNumber(1));
    System.out.println(excelNumber(26));
    System.out.println(excelNumber(27));
    System.out.println(excelNumber(28));
  }
}

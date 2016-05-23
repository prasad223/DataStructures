package LeetCode;

import java.util.Stack;

/**
 * Created by prasad223 on 2/29/16.
 */
public class NumberEnglish {

  static String[] units = new String[]{"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
          "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
  static String[] tens = new String[]{"", "", "Twenty", "Thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
  static String hundred = "hundred";
  static String thousand = "thousand";
  static String million = "million";
  static String billion = "billion";

  public static void main(String[] args) {
        /*int[] num = new int[]{0,101,50868,123,12345,100,99,11,19,999,1000,128344,10128344,10000000,1000000000,1000345000};
        for(int n: num){
            System.out.println(intToEnglish(n).trim().replace("  "," "));
        }*/
    System.out.println(intToEnglish(1000000001));
  }

  public static String convert3Digits(int num) {
    StringBuilder stringBuilder = new StringBuilder();
    Stack<String> stack = new Stack<>();
    int digits2 = num % 100;
    num = num / 100;
    if (digits2 < 20) {
      stack.push(units[digits2]);
    } else {
      stack.push(units[digits2 % 10]);
      stack.push(tens[digits2 / 10]);
    }
    if (num != 0) {
      stack.push(hundred);
      stack.push(units[num]);
    }
    while (!stack.empty()) {
      String nums = stack.pop();
      if (!nums.isEmpty()) {
        stringBuilder.append(nums);
        stringBuilder.append(" ");
      }
    }
    return stringBuilder.toString().trim().replace("  ", " ");
  }

  public static String intToEnglish(int num) {
    StringBuffer stringBuffer = new StringBuffer();
    Stack<String> stack = new Stack<>();
    int place = 0;
    if (num == 0)
      return "Zero";
    while (num > 0) {
      int digits3 = num % 1000;
      num = num / 1000;
      switch (place) {
        case 0:
          break;
        case 1:
          if (digits3 != 0)
            stack.push(thousand);
          break;
        case 2:
          if (digits3 != 0)
            stack.push(million);
          break;
        case 3:
          if (digits3 != 0)
            stack.push(billion);
          break;
      }
      stack.push(convert3Digits(digits3));
      place++;
    }
    while (!stack.empty()) {
      String nums = stack.pop();
      if (!nums.isEmpty()) {
        stringBuffer.append(nums);
        stringBuffer.append(" ");
      }
    }
    return stringBuffer.toString().trim();
  }
}

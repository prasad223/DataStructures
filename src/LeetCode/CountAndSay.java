package LeetCode;

/**
 * Created by prasad223 on 2/10/16.
 */
public class CountAndSay {

  public static void main(String... args) {
    CountAndSay countAndSay = new CountAndSay();
    for (int i = 1; i < 8; i++) {
      System.out.println(countAndSay.countSay(i));
    }

    System.out.println("\n\n\n\n\n");
    System.out.println(countAndSay.countSay(5));
  }

  public String countSay(int a) {
    String response = "1";
    int count;
    char ch;
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 1; i < a; i++) {
      ch = response.charAt(0);
      count = 1;
      for (int k = 1; k < response.length(); k++) {
        if (response.charAt(k) == ch) {
          count++;
        } else {
          stringBuilder.append(count);
          stringBuilder.append(ch);
          ch = response.charAt(k);
          count = 1;
        }
      }
      stringBuilder.append(count);
      stringBuilder.append(ch);
      response = stringBuilder.toString();
      stringBuilder = new StringBuilder();
    }
    return response;
  }
}

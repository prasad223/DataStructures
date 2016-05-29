package InterviewBit.Strings;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by prasad on 5/28/16.
 */
public class LongCommPrefix {

  public String findLongCommPrefix(ArrayList<String> a) {

    String[] a1 = "1.2.3".split("\\.");
    System.out.println(Arrays.toString(a1));
    if (a.size() == 0) {
      return "";
    }
    int minStringIndex = 0;
    for (int i = 1; i < a.size(); i++) {
      if (a.get(i).length() < a.get(minStringIndex).length()) {
        minStringIndex = i;
      }
    }
    char[] chars = a.get(minStringIndex).toCharArray();
    for (String s : a) {
      for (int i = 0; i < chars.length; i++) {
        if (chars[i] != s.charAt(i)) {
          chars = Arrays.copyOfRange(chars, 0, i);
          break;
        }
      }
    }
    return new String(chars);
  }
}

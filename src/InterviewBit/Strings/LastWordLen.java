package InterviewBit.Strings;

/**
 * Created by prasad on 5/29/16.
 */
public class LastWordLen {

  public static int getLastWordLength(String a) {
    int count = 0;
    int prevCount = 0;
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) == ' ') {
        if (count != 0) {
          prevCount = count;
        }
        count = 0;
      } else {
        count++;
      }
    }
    if (count == 0) {
      return prevCount;
    }
    return count;
  }


  public static String reverseStringByWords(String a) {
//    a = a.trim();
    StringBuffer sb = new StringBuffer();
    StringBuffer temp = null;
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) == ' ') {
        if (temp != null) {
          if (sb.length() != 0) {
            temp.append(' ');
          }
          sb.insert(0, temp.toString());
        }
        temp = null;
      } else {
        if (temp == null) {
          temp = new StringBuffer();
        }
        temp.append(a.charAt(i));
      }
    }
    if (temp != null) {
      if (sb.length() != 0) {
        temp.append(' ');
      }
      sb.append(temp);
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    /*System.out.println(getLastWordLength("Hello World"));
    System.out.println(getLastWordLength("Hell"));
    System.out.println(getLastWordLength("   "));
    System.out.println(getLastWordLength("  hello  "));*/

    System.out.println(reverseStringByWords("  the   earth   is    round    "));
    System.out.println(reverseStringByWords("   the    "));
    System.out.println(reverseStringByWords("   "));
    System.out.println(reverseStringByWords("j"));
  }
}

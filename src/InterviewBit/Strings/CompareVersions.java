package InterviewBit.Strings;

/**
 * Created by prasad on 5/28/16.
 */
public class CompareVersions {

  public int compTwoStrNum(String a, String b) {
    if (a.length() == 0 && b.length() == 0) {
      return 0;
    }
    StringBuffer s1 = new StringBuffer(a);
    StringBuffer s2 = new StringBuffer(b);
    if (s1.length() < s2.length()) {
      while (s1.length() != s2.length()) {
        s1.insert(0, "0");
      }
    }
    if (s1.length() > s2.length()) {
      while (s1.length() != s2.length()) {
        s2.insert(0, "0");
      }
    }
    for (int i = 0; i < s1.length(); i++) {
      int num = Character.compare(s1.charAt(i), s2.charAt(i));
      if (num != 0) {
        return num;
      }
    }
    return 0;
  }

  public boolean isNonZero(String a) {
    if (a == null || a.length() == 0) {
      return false;
    }
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) > '0') {
        return true;
      }
    }
    return false;
  }

  public int compareVersions(String a, String b) {
    String[] n1 = a.split("\\.");
    String[] n2 = b.split("\\.");
    int minLen = Math.min(n1.length, n2.length);
    for (int i = 0; i < minLen; i++) {
      int num = compTwoStrNum(n1[i], n2[i]);
      if (num != 0) {
        return (num < 0) ? -1 : 1;
      }
    }
    if (n1.length == n2.length) {
      return 0;
    }
    if (n1.length == minLen) {
      int i = minLen;
      while (i < n2.length) {
        if (isNonZero(n2[i])) {
          return 1;
        }
        i++;
      }
    }
    if (n2.length == minLen) {
      int i = minLen;
      while (i < n1.length) {
        if (isNonZero(n1[i])) {
          return -1;
        }
        i++;
      }
    }
    return 0;
  }
}

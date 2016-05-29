package InterviewBit.Strings;

/**
 * Created by prasad on 5/28/16.
 */
public class Palindrome {

  public int isPalindrome(String a) {
    a = a.trim();
    char ch1, ch2;
    boolean error = false;
    int l = 0;
    int h = a.length() - 1;
    while (l <= h) {
      while (!Character.isLetterOrDigit(a.charAt(l))) {
        l++;
        if (l > h) {
//          break;
          return 1;
        }
      }
      while (!Character.isLetterOrDigit(a.charAt(h))) {
        h--;
        if (h < l) {
          return 1;
        }
      }
      ch1 = a.charAt(l);
      ch2 = a.charAt(h);
      if (Character.isAlphabetic(ch1)) {
        ch1 = Character.toLowerCase(ch1);
      }
      if (Character.isAlphabetic(ch2)) {
        ch2 = Character.toLowerCase(ch2);
      }
      if (ch1 != ch2) {
        return 0;
      }
      l++;
      h--;
    }
    return 1;
  }

}

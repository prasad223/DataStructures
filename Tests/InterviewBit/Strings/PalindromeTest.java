package InterviewBit.Strings;

import junit.framework.TestCase;

/**
 * Created by prasad on 5/28/16.
 */
public class PalindromeTest extends TestCase {
  public void testIsPalindrome() throws Exception {
    Palindrome palindrome = new Palindrome();
    assertEquals(1, palindrome.isPalindrome("aca"));
    assertEquals(1, palindrome.isPalindrome("  ac A"));
    assertEquals(1, palindrome.isPalindrome("  1 e 4 E 1 "));
    assertEquals(0, palindrome.isPalindrome(" asjnfdj "));
    assertEquals(1, palindrome.isPalindrome("    "));
    assertEquals(1, palindrome.isPalindrome("A man, a plan, a canal: Panama"));
    assertEquals(0, palindrome.isPalindrome("race a car"));
    assertEquals(1, palindrome.isPalindrome(" : 1 e E 1 "));
    assertEquals(1, palindrome.isPalindrome(" \" "));
  }

}
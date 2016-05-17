package BasicDS.Strings;

import junit.framework.TestCase;

/**
 * Created by prasad223 on 2/6/16.
 */
public class LongestPalindromeSubsequenceTest extends TestCase {

    LongestPalindromeSubsequence longPalSubseq;
    public void setUp() throws Exception {
        super.setUp();
        longPalSubseq = new LongestPalindromeSubsequence();

    }

    public void tearDown() throws Exception {
        longPalSubseq = null;
    }

    public void testLongPalindromeSubsequence() throws Exception {
        assertEquals(longPalSubseq.longPalindromeSubsequence("agbdba"),5);
        assertEquals(longPalSubseq.longPalindromeSubsequence("abcde"),1);
    }
}
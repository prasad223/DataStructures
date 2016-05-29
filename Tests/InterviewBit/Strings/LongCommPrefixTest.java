package InterviewBit.Strings;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created by prasad on 5/28/16.
 */
public class LongCommPrefixTest extends TestCase {

  public void testFindLongCommPrefix() throws Exception {
    LongCommPrefix longCommPrefix = new LongCommPrefix();
    ArrayList<String> strings = new ArrayList<>();
    assertEquals("", longCommPrefix.findLongCommPrefix(strings));
    strings.add("abcdefg");
    assertEquals("abcdefg", longCommPrefix.findLongCommPrefix(strings));
    strings.add("aefghijk");
    assertEquals("a", longCommPrefix.findLongCommPrefix(strings));
    strings.add("");
    assertEquals("", longCommPrefix.findLongCommPrefix(strings));
  }

}
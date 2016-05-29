package InterviewBit.Strings;

import junit.framework.TestCase;

/**
 * Created by prasad on 5/28/16.
 */
public class CompareVersionsTest extends TestCase {

  public void testCompareVersions() throws Exception {
    CompareVersions compareVersions = new CompareVersions();
    assertEquals(0, compareVersions.compareVersions("0", "0"));
    assertEquals(1, compareVersions.compareVersions("13.0", "13.0.8"));
    assertEquals(1, compareVersions.compareVersions("1.222", "1.22"));
    assertEquals(-1, compareVersions.compareVersions("222222222222", "2222222222222"));
  }

}
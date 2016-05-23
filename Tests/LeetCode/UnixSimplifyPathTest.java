package LeetCode;

import junit.framework.TestCase;

/**
 * Created by prasad223 on 2/10/16.
 */
public class UnixSimplifyPathTest extends TestCase {

  public void testSimplifyPath() throws Exception {
    UnixSimplifyPath unixSimplifyPath = new UnixSimplifyPath();
    assertEquals(unixSimplifyPath.simplifyPath("/../"), "/");
    assertEquals(unixSimplifyPath.simplifyPath("/home/doc/../"), "/home");
    assertEquals(unixSimplifyPath.simplifyPath("/home/"), "/home");
    assertEquals(unixSimplifyPath.simplifyPath("/a/./b/../../c/"), "/c");
  }
}
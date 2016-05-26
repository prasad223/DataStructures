package InterviewBit.Math;

import junit.framework.TestCase;

/**
 * Created by prasad on 5/25/16.
 */
public class SortPermuteRankTest extends TestCase {

  SortPermuteRank sortPermuteRank = null;

  @Override
  public void setUp() throws Exception {
    super.setUp();
    sortPermuteRank = new SortPermuteRank();
  }

  @Override
  public void tearDown() throws Exception {
    super.tearDown();
    sortPermuteRank = null;
  }

  public void testFindFactorial() throws Exception {
    int mod = 1000003;
    assertEquals(1, sortPermuteRank.findFactorial(0, mod));
    assertEquals(1, sortPermuteRank.findFactorial(1, mod));
    assertEquals(2, sortPermuteRank.findFactorial(2, mod));
    assertEquals(120, sortPermuteRank.findFactorial(5, mod));
  }

  public void testFindSortPermuteRank() throws Exception {
    assertEquals(6, sortPermuteRank.findSortPermuteRank("cba"));
    assertEquals(1, sortPermuteRank.findSortPermuteRank("abc"));
    assertEquals(2, sortPermuteRank.findSortPermuteRank("acb"));
    assertEquals(4, sortPermuteRank.findSortPermuteRank("bca"));
    assertEquals(3, sortPermuteRank.findSortPermuteRank("bac"));
    assertEquals(5, sortPermuteRank.findSortPermuteRank("cab"));
    assertEquals(676383, sortPermuteRank.findSortPermuteRank("qwertyuiopasdfghjklzxcvbnm"));
  }

  public void testFindSortPermuteRankRepeat() throws Exception {
    assertEquals(6, sortPermuteRank.findSortPermuteRankRepeat("cba"));
    assertEquals(1, sortPermuteRank.findSortPermuteRankRepeat("abc"));
    assertEquals(2, sortPermuteRank.findSortPermuteRankRepeat("acb"));
    assertEquals(4, sortPermuteRank.findSortPermuteRankRepeat("bca"));
    assertEquals(3, sortPermuteRank.findSortPermuteRankRepeat("bac"));
    assertEquals(5, sortPermuteRank.findSortPermuteRankRepeat("cab"));
    assertEquals(676383, sortPermuteRank.findSortPermuteRank("qwertyuiopasdfghjklzxcvbnm"));
    assertEquals(2, sortPermuteRank.findSortPermuteRankRepeat("aba"));
    assertEquals(1, sortPermuteRank.findSortPermuteRankRepeat("aab"));
    assertEquals(3, sortPermuteRank.findSortPermuteRankRepeat("baa"));
    assertEquals(181, sortPermuteRank.findSortPermuteRankRepeat("caabccd"));
    assertEquals(982346, sortPermuteRank.findSortPermuteRankRepeat("czjxshgslsdkjfklnfbakszxnasfdhdhsgdsd"));
  }

}
package InterviewBit.BinarySearch;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by prasad on 5/26/16.
 */
public class SearchForRangeTest extends TestCase {

  public void testFindRange() throws Exception {
    SearchForRange searchForRange = new SearchForRange();
    ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 4, 4, 7, 8));
    assertEquals(new ArrayList<>(Arrays.asList(3, 6)), searchForRange.findRange(input, 4));
    assertEquals(new ArrayList<>(Arrays.asList(-1, -1)), searchForRange.findRange(input, 5));
    input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    assertEquals(new ArrayList<>(Arrays.asList(4, 4)), searchForRange.findRange(input, 5));
    input = new ArrayList<>(Arrays.asList(5, 5, 5, 5, 5, 5));
    assertEquals(new ArrayList<>(Arrays.asList(0, 5)), searchForRange.findRange(input, 5));
    input = new ArrayList<>(Arrays.asList(5, 5, 5, 5, 6, 7, 9));
    assertEquals(new ArrayList<>(Arrays.asList(0, 3)), searchForRange.findRange(input, 5));
    input = new ArrayList<>(Arrays.asList(6, 7, 9, 9, 9, 9, 9));
    assertEquals(new ArrayList<>(Arrays.asList(2, 6)), searchForRange.findRange(input, 9));
  }

}
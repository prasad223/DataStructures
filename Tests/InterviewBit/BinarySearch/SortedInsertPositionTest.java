package InterviewBit.BinarySearch;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by prasad on 5/27/16.
 */
public class SortedInsertPositionTest extends TestCase {

  public void testFindIndexOfElement() throws Exception {
    SortedInsertPosition object = new SortedInsertPosition();
    ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 3, 5, 8));
    assertEquals(2, object.findIndexOfElement(input, 5));
    assertEquals(0, object.findIndexOfElement(input, 0));
    assertEquals(4, object.findIndexOfElement(input, 9));
    assertEquals(2, object.findIndexOfElement(input, 4));
    assertEquals(1, object.findIndexOfElement(input, 2));
    assertEquals(3, object.findIndexOfElement(input, 7));
    input = new ArrayList<>();
    assertEquals(0, object.findIndexOfElement(input, 2));
    input.add(1);
    assertEquals(1, object.findIndexOfElement(input, 2));
  }

}
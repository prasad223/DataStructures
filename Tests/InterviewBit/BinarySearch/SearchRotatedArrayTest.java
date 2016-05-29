package InterviewBit.BinarySearch;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by prasad on 5/27/16.
 */
public class SearchRotatedArrayTest extends TestCase {

  public void testSrcRotatedArray() throws Exception {
    SearchRotatedArray object = new SearchRotatedArray();
    ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4, 5, 6, 8, 0, 1, 2));
    assertEquals(0, object.srcRotatedArray(input, 4));
    assertEquals(-1, object.srcRotatedArray(input, 9));
    assertEquals(5, object.srcRotatedArray(input, 1));
    assertEquals(6, object.srcRotatedArray(input, 2));
    assertEquals(3, object.srcRotatedArray(input, 8));
    assertEquals(-1, object.srcRotatedArray(input, 7));
    input = new ArrayList<>(Arrays.asList(180, 181, 182, 183, 184, 187, 188, 189, 191, 192, 193, 194, 195, 196, 201, 202, 203, 204, 3, 4, 5, 6, 7, 8, 9, 10, 14, 16, 17, 18, 19, 23, 26, 27, 28, 29, 32, 33, 36, 37, 38, 39, 41, 42, 43, 45, 48, 51, 52, 53, 54, 56, 62, 63, 64, 67, 69, 72, 73, 75, 77, 78, 79, 83, 85, 87, 90, 91, 92, 93, 96, 98, 99, 101, 102, 104, 105, 106, 107, 108, 109, 111, 113, 115, 116, 118, 119, 120, 122, 123, 124, 126, 127, 129, 130, 135, 137, 138, 139, 143, 144, 145, 147, 149, 152, 155, 156, 160, 162, 163, 164, 166, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177));
    assertEquals(43, object.srcRotatedArray(input, 42));
  }

}
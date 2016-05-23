package InterviewBit.Arrays;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by prasad on 5/22/16.
 */
public class LargestNumberTest extends TestCase {

  LargestNumber largestNumber = null;
  ArrayList<Integer> input = null;

  public void setUp() throws Exception {
    super.setUp();
    largestNumber = new LargestNumber();
    input = new ArrayList<>();
  }

  public void tearDown() throws Exception {
    largestNumber = null;
    input = null;
  }

  public void testFormLargeNumber() throws Exception {
    input = new ArrayList<>(Arrays.asList(9, 34, 3, 30, 5));
    assertEquals("9534330", largestNumber.formLargeNumber(input));
    input = new ArrayList<>(Arrays.asList(9, 5, 34, 3, 33));
    assertEquals("9534333", largestNumber.formLargeNumber(input));
    input = new ArrayList<>(Arrays.asList(9, 34, 3, 31, 5));
    assertEquals("9534331", largestNumber.formLargeNumber(input));
    input = new ArrayList<>(Arrays.asList(1, 2, 3));
    assertEquals("321", largestNumber.formLargeNumber(input));
    input = new ArrayList<>(Arrays.asList(1, 10, 100));
    assertEquals("110100", largestNumber.formLargeNumber(input));
    input = new ArrayList<>(Arrays.asList(9, 99, 999, 9999, 9998));
    assertEquals("99999999999998", largestNumber.formLargeNumber(input));
    input = new ArrayList<>(Arrays.asList(0, 0, 0, 0));
    assertEquals("0", largestNumber.formLargeNumber(input));
    input = new ArrayList<>(Arrays.asList(246, 249, 24611));
    assertEquals("24924624611", largestNumber.formLargeNumber(input));
    input = new ArrayList<>(Arrays.asList(27, 271));
    assertEquals("27271", largestNumber.formLargeNumber(input));
    input = new ArrayList<>(Arrays.asList(12, 121));
    assertEquals("12121", largestNumber.formLargeNumber(input));
    input = new ArrayList<>(Arrays.asList(949, 94));
    assertEquals("94994", largestNumber.formLargeNumber(input));
    input = new ArrayList<>(Arrays.asList(999, 989, 975, 954, 949, 94, 931));
    assertEquals("99998997595494994931", largestNumber.formLargeNumber(input));
    input = new ArrayList<>(Arrays.asList(931, 94, 209, 448, 716, 903, 124, 372, 462, 196, 715, 802, 103, 740, 389, 872, 615, 638, 771, 829, 899, 999, 29, 163, 342, 902, 922, 312, 326, 817, 288, 75, 37, 286, 708, 589, 975, 747, 743, 699, 743, 954, 523, 989, 114, 402, 236, 855, 323, 79, 949, 176, 663, 587, 322));
    assertEquals("9999899759549499493192290390289987285582981780279771757477437437407167157086996636386155895875234624484023893737234232632332231229288286236209196176163124114103", largestNumber.formLargeNumber(input));
  }

}
package InterviewBit.Arrays;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created by prasad on 5/21/16.
 */
public class FlipBitsTest extends TestCase {

  FlipBits flipBits;
  String input = null;

  public void setUp() throws Exception {
    super.setUp();
    flipBits = new FlipBits();
  }

  public void tearDown() throws Exception {
    flipBits = null;
    input = null;
  }

  public void testFlipBits() throws Exception {
    input = "1";
    assertEquals(0, flipBits.flipBits(input).size());
    input = "";
    assertEquals(0, flipBits.flipBits(input).size());
    input = "1111";
    assertEquals(0, flipBits.flipBits(input).size());
    input = "00";
    ArrayList<Integer> result = flipBits.flipBits(input);
    assertEquals(1, (int) result.get(0));
    assertEquals(2, (int) result.get(1));
    input = "0010";
    result = flipBits.flipBits(input);
    assertEquals(1, (int) result.get(0));
    assertEquals(2, (int) result.get(1));
    input = "100101101";
    result = flipBits.flipBits(input);
    assertEquals(2, (int) result.get(0));
    assertEquals(3, (int) result.get(1));
    input = "1101010001";
    result = flipBits.flipBits(input);
    assertEquals(3, (int) result.get(0));
    assertEquals(9, (int) result.get(1));
    input = "0111000100010";
    result = flipBits.flipBits(input);
    assertEquals(5, (int) result.get(0));
    assertEquals(11, (int) result.get(1));
    input = "00101011100100110111101100011101111011111000011";
    result = flipBits.flipBits(input);
    assertEquals(42, (int) result.get(0));
    assertEquals(45, (int) result.get(1));
  }

}
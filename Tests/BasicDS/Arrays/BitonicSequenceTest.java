package BasicDS.Arrays;

import junit.framework.TestCase;

/**
 * Created by prasad223 on 4/5/16.
 */
public class BitonicSequenceTest extends TestCase {

  int[] input;
  BitonicSequence bitonicSequence;

  public void setUp() throws Exception {
    super.setUp();
    bitonicSequence = new BitonicSequence();
  }

  public void tearDown() throws Exception {
    super.tearDown();
    input = null;
    bitonicSequence = null;
  }

  public void testFindPivotElement() throws Exception {
    input = null;
    assertEquals(bitonicSequence.findPivotElement(input), -1);
    input = new int[0];
    assertEquals(bitonicSequence.findPivotElement(input), -1);
    input = new int[]{1};
    assertEquals(bitonicSequence.findPivotElement(input), 1);
    input = new int[]{1, 2};
    assertEquals(bitonicSequence.findPivotElement(input), 2);
    input = new int[]{1, 3, 2};
    assertEquals(bitonicSequence.findPivotElement(input), 3);
    input = new int[]{1, 3, 5, 7, 9, 1};
    assertEquals(bitonicSequence.findPivotElement(input), 9);
  }
}
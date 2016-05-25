package InterviewBit.Math;

import junit.framework.TestCase;

/**
 * Created by prasad on 5/24/16.
 */
public class FactorsNumberTest extends TestCase {

  FactorsNumber factorsNumber = null;

  public void setUp() throws Exception {
    super.setUp();
    factorsNumber = new FactorsNumber();
  }

  public void tearDown() throws Exception {
    factorsNumber = null;
  }

  public void testFindFactorsOfNum() throws Exception {
    for (int i = 0; i < 50; i++) {
      System.out.println("i: " + i + " , result: " + factorsNumber.findFactorsOfNum(i));
    }
    for (int i = -1; i > -10; i--) {
      System.out.println("i: " + i + " , result: " + factorsNumber.findFactorsOfNum(i));
    }
  }

}
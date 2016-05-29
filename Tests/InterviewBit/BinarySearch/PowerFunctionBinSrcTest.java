package InterviewBit.BinarySearch;

import junit.framework.TestCase;

/**
 * Created by prasad on 5/27/16.
 */
public class PowerFunctionBinSrcTest extends TestCase {

  public void testPower() throws Exception {
    PowerFunctionBinSrc object = new PowerFunctionBinSrc();
    assertEquals(2, object.power(2, 3, 3));
    assertEquals(1, object.power(10, 0, 5));
    assertEquals(3, object.power(8, 1, 5));
    assertEquals(1, object.power(-2, 3, 3));
    assertEquals(7, object.power(Integer.MAX_VALUE, 1, 10));
    assertEquals(1, object.power(Integer.MAX_VALUE, 2, 31));
    assertEquals(25, object.power(Integer.MAX_VALUE, 2, Integer.MAX_VALUE - 5));
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.MAX_VALUE);
    assertEquals(2147483646, object.power(Integer.MIN_VALUE, 3, Integer.MAX_VALUE));
//    assertEquals(1, object.power(Integer.MIN_VALUE,3,Integer.MIN_VALUE+1));
    assertEquals(0, object.power(Integer.MIN_VALUE, 3, Integer.MIN_VALUE));
    assertEquals(3235401, object.power(66796977, 78775956, 59481060));
  }

}
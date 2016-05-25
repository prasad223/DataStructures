package InterviewBit.Math;

import junit.framework.TestCase;

/**
 * Created by prasad on 5/24/16.
 */
public class EvenNumPrimeSumTest extends TestCase {

  public void testGenPrimeSum() throws Exception {
    EvenNumPrimeSum evenNumPrimeSum = new EvenNumPrimeSum();
    for (int i = 4; i <= 100; i += 2) {
      System.out.println("i= " + i + " ,res= " + evenNumPrimeSum.genPrimeSum(i));
    }
  }

}
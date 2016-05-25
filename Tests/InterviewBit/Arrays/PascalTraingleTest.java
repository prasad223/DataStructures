package InterviewBit.Arrays;

import junit.framework.TestCase;

/**
 * Created by prasad on 5/23/16.
 */
public class PascalTraingleTest extends TestCase {

  PascalTraingle pascalTraingle = null;

  public void setUp() throws Exception {
    super.setUp();
    pascalTraingle = new PascalTraingle();
  }

  public void tearDown() throws Exception {
    pascalTraingle = null;
  }

  public void testGenNPascalTriangle() throws Exception {
    for (int i = 0; i < 10; i++) {
      System.out.println("n: " + i + ", out: " + pascalTraingle.genNPascalTriangle(i));
    }
  }

  public void testGenNthRowPascalTraingle() throws Exception {
    for (int i = 0; i <= 10; i++) {
      System.out.println("n: " + i + ", out: " + pascalTraingle.genNthRowPascalTraingle(i));
    }
    System.out.println("n: " + 25 + ", out: " + pascalTraingle.genNthRowPascalTraingle(25));
  }

}
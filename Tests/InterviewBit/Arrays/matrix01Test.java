package InterviewBit.Arrays;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created by prasad on 5/22/16.
 */
public class matrix01Test extends TestCase {

  Matrix01 matrix_01 = null;
  ArrayList<ArrayList<Integer>> input = null;

  @Override
  public void setUp() throws Exception {
    super.setUp();
    matrix_01 = new Matrix01();
    input = new ArrayList<ArrayList<Integer>>();
  }

  @Override
  public void tearDown() throws Exception {
    super.tearDown();
    matrix_01 = null;
    input = null;
  }

  public void testMatrix01() throws Exception {
    input.add(new ArrayList<Integer>() {{
      add(0);
    }});
    System.out.println("input: " + input + " ,out: " + matrix_01.matrix01(input));
    input.add(new ArrayList<Integer>() {{
      add(1);
    }});
    System.out.println("input: " + input + " ,out: " + matrix_01.matrix01(input));
  }

}
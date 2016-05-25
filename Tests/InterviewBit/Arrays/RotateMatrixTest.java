package InterviewBit.Arrays;

import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created by prasad on 5/23/16.
 */
public class RotateMatrixTest extends TestCase {

  RotateMatrix object = null;
  ArrayList<ArrayList<Integer>> input = null;

  public void setUp() throws Exception {
    super.setUp();
    object = new RotateMatrix();
    input = new ArrayList<ArrayList<Integer>>();
  }

  public void tearDown() throws Exception {
    object = null;
    input = null;
  }

  public void testRotateMatrix() throws Exception {
    int num;
    for (int i = 0; i < 5; i++) {
      input = new ArrayList<>();
      num = 1;
      for (int m = 0; m < i; m++) {
        input.add(new ArrayList<>());
        for (int n = 0; n < i; n++) {
          input.get(m).add(num);
          num++;
        }
        System.out.println(input.get(m));
      }
      // TODO: Need to fix the code and logic
//      input = object.rotateMatrix(input);
      for (int m = 0; m < i; m++) {
        System.out.println(input.get(m));
      }
    }
  }

}
package InterviewBit.Arrays;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by prasad on 5/22/16.
 */
public class MaxNonNegSubArrayTest extends TestCase {

  MaxNonNegSubArray object = null;
  ArrayList<Integer> input = null;

  public void setUp() throws Exception {
    super.setUp();
    object = new MaxNonNegSubArray();
    input = new ArrayList<>();
  }

  public void tearDown() throws Exception {
    object = null;
    input = null;
  }

  public void testMaxNonNegArray() throws Exception {
    input = new ArrayList<>(Arrays.asList(1, 2, 5, -2, 2, 3));
    System.out.println("input: " + input + " ,out: " + object.maxNonNegArray(input));
    input = new ArrayList<>(Arrays.asList(1, 2, 5, -2, 2, 2, 2, 2));
    System.out.println("input: " + input + " ,out: " + object.maxNonNegArray(input));
    input = new ArrayList<>(Arrays.asList(1, 2, 5, -2, 1, 2, 0, 5));
    System.out.println("input: " + input + " ,out: " + object.maxNonNegArray(input));
    input = new ArrayList<>(Arrays.asList(1, 2, 5, 0, 0, 3, 3, 2));
    System.out.println("input: " + input + " ,out: " + object.maxNonNegArray(input));
    input = new ArrayList<>(Arrays.asList(0, 1, 2, 0, -1, 0, 3, 0, 0));
    System.out.println("input: " + input + " ,out: " + object.maxNonNegArray(input));
    input = new ArrayList<>(Arrays.asList(0, 0, 0, -1, 0, 0));
    System.out.println("input: " + input + " ,out: " + object.maxNonNegArray(input));
    input = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
    System.out.println("input: " + input + " ,out: " + object.maxNonNegArray(input));
    input = new ArrayList<>(Arrays.asList(-1, -2));
    System.out.println("input: " + input + " ,out: " + object.maxNonNegArray(input));
    input = new ArrayList<>(Arrays.asList());
    System.out.println("input: " + input + " ,out: " + object.maxNonNegArray(input));
    //Pass null input
    input = null;
    System.out.println("input: " + input + " ,out: " + object.maxNonNegArray(input));
    input = new ArrayList<>(Arrays.asList(1967513926, 1540383426, -1303455736, -521595368));
    System.out.println("input: " + input + " ,out: " + object.maxNonNegArray(input));

  }

}
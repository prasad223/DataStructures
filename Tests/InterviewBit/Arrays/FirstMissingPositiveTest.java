package InterviewBit.Arrays;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by prasad on 5/21/16.
 */
public class FirstMissingPositiveTest extends TestCase {

  FirstMissingPositive firstMissingPositive = null;
  List<Integer> numbers = null;

  public void setUp() throws Exception {
    super.setUp();
    firstMissingPositive = new FirstMissingPositive();
    numbers = new ArrayList<>();
  }

  public void tearDown() throws Exception {
    firstMissingPositive = null;
    numbers = null;
  }

  public void testFindFirstMissingPositive() throws Exception {
    numbers.add(-1);
    assertEquals(1,firstMissingPositive.findFirstMissingPositive(numbers));
    numbers.add(0);
    assertEquals(1,firstMissingPositive.findFirstMissingPositive(numbers));
    numbers.add(2);
    assertEquals(1,firstMissingPositive.findFirstMissingPositive(numbers));
    numbers.add(3);
    assertEquals(1,firstMissingPositive.findFirstMissingPositive(numbers));
    numbers = Arrays.asList(-4,3,-3,2,1,5);
    Collections.sort(numbers);
    assertEquals(4,firstMissingPositive.findFirstMissingPositive(numbers));
  }

}
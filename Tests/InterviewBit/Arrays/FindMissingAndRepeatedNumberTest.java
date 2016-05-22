package InterviewBit.Arrays;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prasad on 5/21/16.
 */
public class FindMissingAndRepeatedNumberTest extends TestCase {
  FindMissingAndRepeatedNumber findMissingAndRepeatedNumber = null;
  List<Integer> integerList = null;
  public void setUp() throws Exception {
    super.setUp();
    findMissingAndRepeatedNumber = new FindMissingAndRepeatedNumber();
    integerList = new ArrayList<>();
  }

  public void tearDown() throws Exception {
    findMissingAndRepeatedNumber = null;
    integerList = null;
  }

  public void testRepeatedNumber() throws Exception {
    integerList.add(1);
    integerList.add(2);
    integerList.add(3);
    integerList.add(5);
    integerList.add(5);
    System.out.println(findMissingAndRepeatedNumber.repeatedNumber(integerList));
  }

}
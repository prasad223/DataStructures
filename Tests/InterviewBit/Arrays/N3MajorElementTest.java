package InterviewBit.Arrays;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by prasad on 5/22/16.
 */
public class N3MajorElementTest extends TestCase {

  N3MajorElement object = null;
  ArrayList<Integer> input = null;

  public void setUp() throws Exception {
    super.setUp();
    object = new N3MajorElement();
  }

  public void tearDown() throws Exception {
    object = null;
    input = null;
  }

  public void testN3MajorElement() throws Exception {
    int num = 0;
    /*input = new ArrayList<>(Arrays.asList(1,2,3,1,1));
    num = object.n3MajorElement(input);
    assertEquals(1 == num,true);
    input = new ArrayList<>(Arrays.asList(1,2,3,2,1));
    num = object.n3MajorElement(input);
    assertEquals((1 == num || 2 == num),true);
    input = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    num = object.n3MajorElement(input);
//    assertEquals((-1 == num),true);
    input = new ArrayList<>(Arrays.asList(1,2,3));
    num = object.n3MajorElement(input);
    assertEquals((0 < num && num <= 3),true);
    input = new ArrayList<>(Arrays.asList(1,1,3));
    num = object.n3MajorElement(input);
    assertEquals((1 == num),true);
    input = new ArrayList<>(Arrays.asList( 1, 1, 1, 2, 3, 5, 7 ));
    num = object.n3MajorElement(input);
    assertEquals((1 == num),true);*/
    input = new ArrayList<>(Arrays.asList(1000697, 1000110, 1000110, 1000671, 1000941, 1000304, 1000110, 1000742, 1000160, 1000558, 1000110, 1000110, 1000110, 1000650, 1000200, 1000110, 1000133, 1000110, 1000548, 1000002, 1000397, 1000110, 1000533, 1000724, 1000110, 1000882, 1000110, 1000515, 1000110, 1000110, 1000110, 1000181, 1000051, 1000110, 1000110, 1000644, 1000110, 1000301, 1000110, 1000040, 1000424, 1000336, 1000426, 1000244, 1000485, 1000439, 1000554, 1000110, 1000110, 1000497, 1000836, 1000760, 1000110, 1000135, 1000872, 1000110, 1000739, 1000242, 1000790, 1000110, 1000384, 1000110, 1000384, 1000110, 1000713, 1000110, 1000110, 1000048, 1000110, 1000172, 1000727, 1000502, 1000649, 1000830, 1000387, 1000953, 1000110, 1000640, 1000291, 1000612, 1000389, 1000110, 1000698, 1000462, 1000054, 1000110, 1000110, 1000181, 1000221, 1000408, 1000110, 1000905, 1000110, 1000532, 1000939, 1000110, 1000817, 1000388, 1000069, 1000110, 1000163, 1000453, 1000847, 1000908, 1000395, 1000574, 1000127, 1000132, 1000110, 1000110, 1000201, 1000689));
    num = object.n3MajorElement(input);
    System.out.println(num);
//    assertEquals((1 == num),true);
  }

}
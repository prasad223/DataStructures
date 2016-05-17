package GeeksForGeeks.Arrays;

import junit.framework.TestCase;

/**
 * Created by prasad223 on 2/4/16.
 */
public class MajorityElementTest extends TestCase {


    public void testGetMajorityElement() throws Exception {
        MajorityElement majorityElement = new MajorityElement();
        int[] arr = {1,2,3,4,4};
        assertEquals(majorityElement.getMajorityElement(arr),4);
    }
}
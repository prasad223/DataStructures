package BasicDS.LinkedLists;

import junit.framework.TestCase;

/**
 * Created by prasad223 on 12/23/15.
 */
public class LinkedListTest extends TestCase {

    LinkedList linkedList;
    public void setUp() throws Exception {
        super.setUp();
        linkedList = new LinkedList();

    }

    public void tearDown() throws Exception {
        linkedList = null;
    }

    public void testInsertFront() throws Exception {
        linkedList.insertFront(5);
        assertEquals(linkedList.getHead(), 5);
        linkedList.insertFront(7);
        assertEquals(linkedList.getHead(),7);
    }

    public void testInsertRear() throws Exception {
        linkedList.insertRear(4);
        assertEquals(linkedList.getTail(), 4);
        assertEquals(linkedList.getHead(), 4);
        linkedList.insertRear(6);
        assertEquals(linkedList.getTail(), 6);
    }

    public void testGetHead() throws Exception {
        try{
            linkedList.getHead();
        }catch (Exception e){
            if(e instanceof NullPointerException){
                assertEquals(true, true);
            }
        }
        linkedList.insertFront(5);
        assertEquals(linkedList.getHead(), 5);
    }

    public void testSearch() throws Exception {
        assertEquals(linkedList.search(5), -1);
        linkedList.insertFront(6);
        assertEquals(linkedList.search(6), 0);
        linkedList.insertRear(4);
        linkedList.insertFront(5);
        assertEquals(linkedList.search(6),1);
        assertEquals(linkedList.search(10), -1);
    }


}
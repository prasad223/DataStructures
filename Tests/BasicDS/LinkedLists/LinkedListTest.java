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
    assertEquals(linkedList.getHead(), 7);
  }

  public void testInsertRear() throws Exception {
    linkedList.insertRear(4);
    assertEquals(linkedList.getHead(), 4);
    linkedList.insertRear(6);
  }

  public void testGetHead() throws Exception {
    try {
      linkedList.getHead();
    } catch (Exception e) {
      if (e instanceof NullPointerException) {
        assertEquals(true, true);
      }
    }
    linkedList.insertFront(5);
    assertEquals(linkedList.getHead(), 5);
  }

  public void testSearch() throws Exception {
    assertEquals(linkedList.search(5), null);
    linkedList.insertFront(6);
    LLNode node = linkedList.search(6);
    assertEquals(node.data, 6);
    linkedList.insertRear(4);
    linkedList.insertFront(5);
    node = linkedList.search(5);
    assertEquals(node.data, 5);

  }

  public void testSort() throws Exception {
    linkedList.insertFront(10);
    linkedList.insertFront(9);
    linkedList.insertFront(7);
    linkedList.sort();
    linkedList.display();
    assertEquals(true, true);
  }


  public void testSearch1() throws Exception {
    linkedList.insertFront(3);
    LLNode node = linkedList.search(3);
    assertEquals(node.data, 3);
    node = linkedList.search(5);
    assertEquals(node == null, true);
  }

  public void testReverse() throws Exception {
    linkedList.insertFront(7);
    linkedList.insertFront(4);
    linkedList.insertFront(3);
    linkedList.display();
    linkedList.reverse();
    linkedList.display();
    linkedList.head = linkedList.reverseRecursive(linkedList.head);
    linkedList.display();

  }

  public void testReverseK() throws Exception {
    linkedList.insertFront(4);
    linkedList.insertFront(3);
    linkedList.insertFront(2);
    linkedList.insertFront(1);
    linkedList.head = linkedList.reverseK(linkedList.head, 0);
    linkedList.display();
  }

  public void testReverseKRecursive() throws Exception {

  }
}
package BasicDS.Queues;

import junit.framework.TestCase;

/**
 * Created by prasad223 on 2/7/16.
 */
public class ArrayCircularQueueTest extends TestCase {

    ArrayCircularQueue<Integer> queue;

    public void setUp() throws Exception {
        super.setUp();
        queue = new ArrayCircularQueue<>();
    }

    public void tearDown() throws Exception {
        queue = null;
    }

    public void testGetSize() throws Exception {
        assertEquals(queue.getSize(),0);
        queue.enqueue(5);
        assertEquals(queue.getSize(),1);
    }

    public void testGetCapacity() throws Exception {
        queue = new ArrayCircularQueue<>(9);
        assertEquals(queue.getCapacity(),9);
        queue = new ArrayCircularQueue<>(10000);
        assertEquals(queue.getCapacity(),queue.MAX_CAPACITY);
        queue = new ArrayCircularQueue<>(-10);
        assertEquals(queue.getCapacity(),1);
    }

    public void testIsEmpty() throws Exception {
        assertEquals(queue.isEmpty(),true);
        queue.enqueue(45);
        assertEquals(queue.isEmpty(),false);
    }

    public void testIsFull() throws Exception {
        queue = new ArrayCircularQueue<>(2);
        assertEquals(queue.isFull(),false);
        queue.enqueue(43);
        queue.enqueue(34);
        assertEquals(queue.isFull(),true);
    }


    public void testEnqueue() throws Exception {
        Integer num = new Integer(34);
        queue.enqueue(num);
        assertEquals(queue.getSize(),1);
        assertEquals(queue.dequeue(),num);
    }

    public void testDequeue() throws Exception {
        Integer num = new Integer(45);
        queue.enqueue(num);
        queue.enqueue(349);
        queue.enqueue(8788);
        assertEquals(queue.dequeue(),num);
    }
}
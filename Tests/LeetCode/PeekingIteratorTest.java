package LeetCode;

import junit.framework.TestCase;

import java.util.*;

/**
 * Created by prasad223 on 2/10/16.
 */
public class PeekingIteratorTest extends TestCase {

    PeekingIterator peekingIterator;
    List<Integer> list;

    public void setUp() throws Exception {
        super.setUp();
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        peekingIterator  = new PeekingIterator(list.iterator());

    }

    public void tearDown() throws Exception {
        list = null;
        peekingIterator = null;
    }

    public void testPeek() throws Exception {
        assertEquals(peekingIterator.peek().intValue(), 1 );
        assertEquals(peekingIterator.peek().intValue(), 1 );
        peekingIterator.next();
        assertEquals(peekingIterator.peek().intValue(), 2 );
        assertEquals(peekingIterator.hasNext(), true);
    }

    public void testNext() throws Exception {
        assertEquals(peekingIterator.next().intValue(), 1 );
        assertEquals(peekingIterator.next().intValue(), 2 );
        assertEquals(peekingIterator.next(), null );
    }

    public void testHasNext() throws Exception {
        assertEquals(peekingIterator.hasNext(),true);
        peekingIterator.next();
        peekingIterator.next();
        assertEquals(peekingIterator.hasNext(), false);
    }
}
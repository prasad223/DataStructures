package LeetCode;

import java.util.Iterator;

/**
 * Created by prasad223 on 2/10/16.
 */
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
public class PeekingIterator implements Iterator<Integer> {

  private Integer next;
  private Iterator<Integer> iterator;

  public PeekingIterator(Iterator<Integer> iterator) {
    // initialize any member here.
    this.iterator = iterator;
    this.next = null;
  }

  // Returns the next element in the iteration without advancing the iterator.
  public Integer peek() {
    if (iterator.hasNext() && next == null) {
      next = iterator.next();
    }
    return next;
  }

  // hasNext() and next() should behave the same as in the Iterator interface.
  // Override them if needed.
  @Override
  public Integer next() {
    if (next != null) {
      Integer res = next;
      next = null;
      return res;
    } else if (iterator.hasNext()) {
      return iterator.next();
    } else {
      return null;
    }
  }

  @Override
  public boolean hasNext() {
    return next != null || iterator.hasNext();
  }
}
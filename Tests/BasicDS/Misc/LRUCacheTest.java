package BasicDS.Misc;

import junit.framework.TestCase;

/**
 * Created by prasad223 on 2/9/16.
 */
public class LRUCacheTest extends TestCase {

  LRUCache lruCache;

  public void setUp() throws Exception {
    super.setUp();
    lruCache = new LRUCache(2);
  }

  public void tearDown() throws Exception {
    lruCache = null;
  }

  public void testGet() throws Exception {
    assertEquals(lruCache.get(5), -1);
    lruCache.set(5, 10);
    assertEquals(lruCache.get(5), 10);
    lruCache.set(5, 15);
    assertEquals(lruCache.get(5), 15);

  }

  public void testSet() throws Exception {
    lruCache.set(5, 10);
    lruCache.set(2, 4);
    assertEquals(lruCache.get(5), 10);
    lruCache.set(3, 6);
    assertEquals(lruCache.get(2), -1);
    assertEquals(lruCache.get(3), 6);
  }
}
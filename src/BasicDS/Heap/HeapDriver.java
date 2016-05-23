package BasicDS.Heap;

import java.io.IOException;

/**
 * Created by prasad223 on 1/19/16.
 */

class Heap {

  final int MAX_CHILD_PER_NODE = 2;
  int[] heap;
  int heapSize;
  int childCount;
  //final int DEFAULT_CAPACITY = 10;

  Heap(int size) {
    heap = new int[size + 1];
    heapSize = 0;
    childCount = MAX_CHILD_PER_NODE;
  }


}

public class HeapDriver {

  public static void main(String[] args) throws IOException {
    System.out.println("heap");
  }
}

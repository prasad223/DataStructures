package BasicDS.Queues;

/**
 * Created by prasad223 on 2/7/16.
 */
public interface Queue<T> {

  static String QUEUE_FULL = "Queue is Full";
  static String QUEUE_EMPTY = "Queue is Empty";
  static int MAX_CAPACITY = 100;

  public int getCapacity();

  public int getSize();

  public boolean isEmpty();

  public boolean isFull();

  public void enqueue(T element);

  public T dequeue();
}

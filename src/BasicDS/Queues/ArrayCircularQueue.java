package BasicDS.Queues;

import java.util.NoSuchElementException;

/**
 * Created by prasad223 on 2/7/16.
 */
public class ArrayCircularQueue<T> implements Queue {

    Object[] values;
    private int size;
    private final int capacity;
    final static int MAX_CAPACITY = 100;
    private int head;
    private int tail;

    ArrayCircularQueue(int capacity){
        this.capacity = Math.min(Math.max(1,capacity), MAX_CAPACITY);
        this.values = new Object[this.capacity];
        this.size = 0;
        this.head = 0;
        this.tail = 0;
    }

    ArrayCircularQueue(){
        this(MAX_CAPACITY);
    }

    @Override
    public int getSize(){
        return this.size;
    }

    @Override
    public  int getCapacity(){
        return this.capacity;
    }

    @Override
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public boolean isFull(){
        return size == capacity;
    }


    private int getNextIndex(int index){
        return (index + 1) % capacity;
    }

    @Override
    public void enqueue(Object element) {
        if(isFull()){
            throw new IllegalStateException(QUEUE_FULL);
        }
        values[head] = element;
        head =getNextIndex(head);
        size++;
    }

    @Override
    public T dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException(QUEUE_EMPTY);
        }
        T element = (T) values[tail];
        values[tail] = null;
        tail = getNextIndex(tail);
        size--;
        return element;
    }

}

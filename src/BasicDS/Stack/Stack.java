package BasicDS.Stack;

/**
 * Created by prasad223 on 2/9/16.
 */
public interface Stack<T> {

    public int getSize();
    public boolean isEmpty();
    public boolean isFull();
    public boolean push(T element);
    public T pop();

}

package scratch;

import java.io.Serializable;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by prasad223 on 3/14/16.
 */
public class ThreadPoolExec {

  public static void main(String[] args) {
    PriorityBlockingQueue<Message> queue = new PriorityBlockingQueue<>(10, new Comp());
    AtomicInteger reqId = new AtomicInteger(0);
    Message m1 = new Message(MessageType.AllDelete, 100);
    m1.reqId = reqId.incrementAndGet();
    queue.add(m1);
    System.out.println(queue);
    Message m2 = new Message(MessageType.Sync, 2);
    m2.reqId = Integer.MAX_VALUE;
    queue.add(m2);
    System.out.println(queue);
    Message m3 = new Message(MessageType.AllQuery, 3);
    m3.reqId = reqId.incrementAndGet();
    queue.add(m3);
    System.out.println(queue);
    Message m4 = new Message(MessageType.SyncResponse, 4);
    m4.reqId = Integer.MAX_VALUE;
    queue.add(m4);
    System.out.println(queue);
    Message m5 = new Message(MessageType.Sync, 5);
    m5.reqId = Integer.MAX_VALUE;
    queue.add(m5);
    System.out.println(queue);
    System.out.println("\n\n\n");
    while (!queue.isEmpty()) {
      try {
        System.out.println(queue.take());
      } catch (Exception e) {

      }
    }
  }

  enum MessageType {
    Sync(0),
    SyncResponse(0),
    AllDelete(1),
    AllQuery(1);

    private final int value;

    MessageType(int val) {
      value = val;
    }
  }

  static class Message implements Serializable, Comparable {

    final int messageId;
    final String senderId;
    MessageType mType;
    String receiverId;
    Object data;
    int reqId;

    Message(int messageId, String senderId, MessageType mType) {
      this.messageId = messageId;
      this.senderId = senderId;
      this.mType = mType;
      this.receiverId = null;
      this.data = null;
      this.reqId = 0;
    }

    public Message(MessageType mType, int messageId) {
      this.messageId = messageId;
      this.mType = mType;
      this.senderId = "a";
      this.receiverId = "x";
      this.data = "";
    }

    public Message(Message message) {
      this.messageId = message.messageId;
      this.senderId = message.senderId;
      this.mType = message.mType;
      this.receiverId = message.receiverId;
      this.data = message.data;
    }

    @Override
    public int compareTo(Object another) {
      if (another == null || !(another instanceof Message)) {
        return -1;
      }
      switch (this.mType) {
        case Sync:
        case SyncResponse:
          return -1;
      }
      switch (((Message) another).mType) {
        case Sync:
        case SyncResponse:
          return 1;
      }
      return Integer.compare(this.reqId, ((Message) another).reqId);
    }

    @Override
    public String toString() {
      return "M{" +
              "Id=" + messageId +
              ", Ty=" + mType +
              '}';
    }

  }

  static class Comp implements Comparator<Message> {

    @Override
    public int compare(Message o1, Message o2) {
      if (o2 == null || !(o2 instanceof Message)) {
        return -1;
      }
      if (o1 == null || !(o1 instanceof Message)) {
        return -1;
      }
      switch (o1.mType) {
        case Sync:
        case SyncResponse:
          return -1;
      }
      switch (o2.mType) {
        case Sync:
        case SyncResponse:
          return 1;
      }
      return Integer.compare(o1.reqId, o2.reqId);
    }
  }


}

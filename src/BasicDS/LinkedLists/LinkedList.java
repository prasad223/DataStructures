package BasicDS.LinkedLists;

/**
 * Created by prasad223 on 12/23/15.
 */

/**
 * This is the basic node class for Linked List data structure
 */
class LLNode implements Comparable<LLNode> {

  public int data;
  public LLNode next;

  public LLNode(int data, LLNode next) {
    this.data = data;
    this.next = next;
  }

  public LLNode() {
    new LLNode(-1, null);
  }

  public LLNode(int data) {
    this.data = data;
    this.next = null;
    //new LLNode(data, null);
  }


  @Override
  public int compareTo(LLNode llNode) {
    if (this.data == llNode.data)
      return 0;
    else if (this.data < llNode.data)
      return -1;
    else
      return 1;
  }
}

/**
 * Basic LinkedList data structure class
 */
public class LinkedList {

  public LLNode head;

  public LinkedList() {
    this.head = null;
  }

  public void insertFront(int data) {
    LLNode newNode = new LLNode(data, this.head);
    this.head = newNode;
  }

  public LLNode search(int data) {
    if (this.head == null) {
      return null;
    }
    LLNode cur = this.head;
    while (cur != null) {
      if (cur.data == data) {
        break;
      }
      cur = cur.next;
    }
    return cur;
  }

  public void insertRear(int data) {
    LLNode node = new LLNode(data);
    if (this.head == null) {
      this.head = node;
      return;
    }

    LLNode cur = this.head;
    while (cur.next != null) {
      cur = cur.next;
    }
    cur.next = node;
  }

  public int popFront() {
    int response = -1;
    if (this.head != null) {
      response = this.head.data;
      this.head = this.head.next;
    }
    return response;
  }

  public void delete(LLNode node) {
    if (node == null) {
      return;
    }
    LLNode temp = node;
    node = node.next;
    if (temp == this.head) {
      this.head = node;
    }
  }

  public void reverse() {
    if (this.head == null || this.head.next == null) {
      return;
    }
    LLNode cur = this.head;
    LLNode next, prev = null;
    while (cur != null) {
      next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
    }
    this.head = prev;
  }

  public LLNode reverseK(LLNode head, int k) {
    if (head == null || head.next == null || k == 0) {
      return head;
    }
    LLNode cur = head;
    LLNode next = null, prev = null;
    int count = 0;
    while (cur != null && count < k) {
      next = cur.next;
      cur.next = prev;
      prev = cur;
      cur = next;
      count++;
    }
    if (next != null) {
      head.next = reverseK(next, k);
    }
    return prev;
  }

  public LLNode reverseKRecursive(LLNode head, int k) {

    return null;
  }

  public LLNode reverseRecursive(LLNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    LLNode temp = reverseRecursive(head.next);
    head.next = null;
    LLNode cur = temp;
    while (cur.next != null) {
      cur = cur.next;
    }
    cur.next = head;
    return temp;
  }

  public int getHead() {

    if (this.head != null) {
      return this.head.data;
    }
    throw new NullPointerException("Empty list");
  }

  /*    public int search(int data){
          int position = -1, count = 0;
          if(this.head == null){
              return position;
          }
          LLNode node = this.head;
          while(node != null){
              if(node.data == data){
                  position = count;
                  break;
              }
              count++;
              node = node.next;
          }
          return position;
      }
  */
  private LLNode sortedInsert(LLNode node, int data) {
    LLNode newNode = new LLNode(data);
    if (node == null) {
      node = newNode;
      return node;
    }
    LLNode current = node;
    LLNode previous = null;
    while (current != null) {
      if (data <= current.data) {
        break;
      }
      previous = current;
      current = current.next;
    }
    if (previous == null) {
      newNode.next = current;
      node = newNode;
    } else {
      newNode.next = previous.next;
      previous.next = newNode;
    }
    return node;
  }

  public void display() {
    if (this.head == null) {
      return;
    }
    LLNode temp = this.head;
    while (temp != null) {
      System.out.print(temp.data + "\t");
      temp = temp.next;
    }
    System.out.println();
  }

  public void sort() {
    if (this.head == null) {
      return;
    }
    LLNode temp = this.head;
    LLNode sortedHead = null;
    while (temp != null) {
      sortedHead = this.sortedInsert(sortedHead, temp.data);
      temp = temp.next;
    }
    this.head = sortedHead;
    temp = sortedHead;
    while (temp.next != null) {
      temp = temp.next;
    }
  }
}

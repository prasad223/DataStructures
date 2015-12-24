package BasicDS.LinkedLists;

/**
 * Created by prasad223 on 12/23/15.
 */

import java.lang.NullPointerException;

/**
 * This is the basic node class for Linked List data structure
 */
class LLNode{

    public int data;
    public LLNode next;

    public LLNode(int data, LLNode next){
        this.data = data;
        this.next = next;
    }

    public LLNode(){
        new LLNode(-1,null);
    }

    public LLNode(int data){
        this.data = data;
        this.next = null;
        //new LLNode(data, null);
    }
}

/**
 * Basic LinkedList data structure class
 */
public class LinkedList {

    private LLNode head, tail;

    public  LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public LinkedList(int data){
        this.head = new LLNode(data);
        this.tail = this.head;
    }

    public void insertFront(int data){
        LLNode newNode = new LLNode(data, this.head);
        this.head = newNode;
        if(this.tail == null){
            this.tail = newNode;
        }
    }

    public void insertRear(int data){
        LLNode node = new LLNode(data);
        if(this.head == null && this.tail == null){
            this.head = this.tail = node;
            return;
        }
        if(this.tail != null){
            this.tail.next = node;
            this.tail = node;
        }
    }

    public  int getTail(){
        if(this.tail != null){
            return tail.data;
        }
        throw new NullPointerException("Empty tail");
    }

    public int getHead(){

        if(this.head != null){
            return this.head.data;
        }
        throw new NullPointerException("Empty list");
    }

    public int search(int data){
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

    public void sort(){
        if(this.head == null){
            return;
        }

    }
}

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

    private LLNode sortedInsert(LLNode node, int data){
        LLNode newNode = new LLNode(data);
        if(node == null){
            node = newNode;
            return node;
        }
        LLNode current = node;
        LLNode previous = null;
        while (current != null){
            if(data <= current.data){
                break;
            }
            previous = current;
            current = current.next;
        }
        if(previous == null ){
            newNode.next = current;
            node = newNode;
        }
        else if(previous != null ){
            newNode.next = previous.next;
            previous.next = newNode;
        }
        return  node;
    }

    public void display(){
        if(this.head == null){
            return;
        }
        LLNode temp = this.head;
        while (temp != null){
            System.out.print(temp.data +"\t");
            temp = temp.next;
        }
        System.out.println();
    }
    public void sort(){
        if(this.head == null){
            return;
        }
        LLNode temp = this.head;
        LLNode sortedHead = null;
        while (temp != null){
            sortedHead = this.sortedInsert(sortedHead, temp.data);
            temp = temp.next;
        }
        this.head = sortedHead;
        temp = sortedHead;
        while(temp.next != null){
            temp = temp.next;
        }
        this.tail = temp;
    }
}

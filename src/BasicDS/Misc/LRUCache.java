package BasicDS.Misc;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by prasad223 on 2/9/16.
 */
public class LRUCache {

    class Node extends Object{
        int key;
        int value;
        Node next;
        Node prev;
        public Node(int key, int value){
            this.key = key;
            this.value = value;
            this.prev  = this.next = null;
        }
        public Node(){
            this(-1,-1);
        }
        public boolean equals(Node node){
            return (node.key == this.key  && node.value == this.value);
        }
    }
    Node head;
    Node tail;
    Map<Integer, Node> keyNodeMap;
    int size;
    final int capacity;

    public LRUCache(int capacity){
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
        keyNodeMap = new HashMap<>(capacity + (int)(capacity * 0.5));
        this.capacity = capacity;
        size = 0;
    }

    public int get(int key){
        Node node = keyNodeMap.get(key);
        if(node == null){
            return -1;
        }
        this.moveToHead(node);
        return node.value;
    }

    public void moveToHead(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
        //node.prev = node.next = null;

        node.prev = head;
        node.next = head.next;

        head.next = node;
        node.next.prev = node;
    }

    public Node popTail(){
        Node node = tail.prev;
        node.prev.next = tail;

        tail.prev = node.prev;
        node.prev = node.next = null;
        return node;
    }

    public void addNode(Node node){
        node.prev = head;
        node.next = head.next;

        head.next = node;
        node.next.prev = node;

    }

    public void set(int key, int value){
        Node node = keyNodeMap.get(key);
        if(node != null){
            node.value = value;
            this.moveToHead(node);
        }else if(size == capacity){
            node = this.popTail();
            keyNodeMap.remove(node.key);
            node.key = key;
            node.value = value;
            this.addNode(node);
            this.keyNodeMap.put(key,node);
        }else{
            node = new Node(key, value);
            this.addNode(node);
            keyNodeMap.put(key, node);
            size++;
        }
    }
}


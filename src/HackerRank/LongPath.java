package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by prasad223 on 1/20/16.
 */

class Node {
  int key;
  int color;
  Node parent;
  List<Node> children;

  Node(int key, int color) {
    this.key = key;
    this.color = color;
    this.parent = null;
    children = new ArrayList<Node>();
  }

  Node(int key) {
    this(key, -1);
  }

}

class Tree {
  Node root;

  Tree() {
    root = null;
  }

  Tree(int key) {
    root = new Node(key);
  }

  Tree(int key, int color) {
    this.root = new Node(key, color);
  }

  void insert(int parent, int key, int color) {
    Node cur = search(root, parent);
    if (cur != null) {
      boolean isChildPresent = false;
      for (Node child : cur.children) {
        if (child.key == key) {
          child.color = color;
          isChildPresent = true;
          break;
        }
      }
      if (!isChildPresent) {
        Node node = new Node(key, color);
        node.parent = cur;
        cur.children.add(node);
      }
    }
  }

  Node search(Node root, int key) {
    Node response = null;
    if (root.key == key)
      return root;
    for (Node child : root.children) {
      response = search(child, key);
      if (response != null) {
        return response;
      }
    }
    return null;
  }

  int getBlackPath(int count) {
    boolean[] discovered = new boolean[count + 1];
    int blackCount = 0;
    int tCount = 0;
    Node cur = root;
    StackElement element = null;
    Stack<StackElement> stack = new Stack<>();

    stack.add(new StackElement(cur, 0));
    while (!stack.isEmpty()) {
      element = stack.pop();
      cur = element.node;
      tCount = element.count;
      if (!discovered[cur.key]) {
        discovered[cur.key] = true;
        if (cur.color == 1) {
          tCount++;
          blackCount = Math.max(blackCount, tCount);
        } else {
          tCount = 0;
        }
      }
      for (Node child : cur.children) {
        tCount = (child.color == 1) ? tCount : 0;
        stack.push(new StackElement(child, tCount));
      }
    }
    return blackCount;
  }

  class StackElement {
    Node node;
    int count;

    StackElement(Node node, int count) {
      this.node = node;
      this.count = count;
    }
  }
}

public class LongPath {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine().trim());
    int key, parent;
    int[] color = new int[n];
    Tree tree = new Tree(1);

    String[] colors = br.readLine().split("\\s+");
    for (int i = 0; i < n; i++) {
      color[i] = Integer.parseInt(colors[i]);
      if (i == 0) {
        tree = new Tree(1, color[i]);
      }
    }

    String[] nodes = br.readLine().split("\\s+");
    for (int i = 0; i < n - 1; i++) {
      parent = Integer.parseInt(nodes[i].trim());
      key = parent + 1;
      tree.insert(parent, key, color[parent]);
    }

    System.out.println(tree.getBlackPath(n));

  }
}

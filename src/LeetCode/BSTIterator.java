package LeetCode;

import java.util.Stack;

/**
 * Created by prasad223 on 2/10/16.
 */
public class BSTIterator {

  private Stack<TreeNode> stack;

  public BSTIterator(TreeNode root) {
    stack = new Stack<>();
    TreeNode current = root;
    while (current != null) {
      stack.push(current);
      current = current.left;
    }
  }

  public boolean hasNext() {
    return !stack.isEmpty();
  }

  public int next() {
    int resp = -1;
    if (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      resp = node.val;
      node = node.right;
      while (node != null) {
        stack.push(node);
        node = node.left;
      }
    }
    return resp;
  }

  class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}

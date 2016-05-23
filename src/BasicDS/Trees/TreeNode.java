package BasicDS.Trees;

/**
 * Created by prasad223 on 1/14/16.
 */
public class TreeNode {
  int data;
  TreeNode left;
  TreeNode right;

  TreeNode(int data) {
    this.data = data;
    this.left = this.right = null;
  }

  TreeNode() {
    this(-1);
  }

}

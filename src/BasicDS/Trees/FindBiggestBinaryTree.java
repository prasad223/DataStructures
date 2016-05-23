package BasicDS.Trees;


/**
 * Created by prasad223 on 4/24/16.
 */
public class FindBiggestBinaryTree {

  static TreeNode maxBinaryTreeNode = null;
  static int maxBinaryHeight = 0;

  public static int findCompleteBinaryTree(TreeNode root) {
    if (root == null) {
      //System.out.println("root is null : return 0");
      return 0;
    }

    if (root.left == null || root.right == null) {
      //System.out.println("root at " + root.data + " has only one child: return 0");
      return 0;
    }

    int rightHieght = findCompleteBinaryTree(root.right);
    int leftHeight = findCompleteBinaryTree(root.left);
    int myHeight = Math.min(leftHeight, rightHieght) + 1;
    //System.out.println("root: " + root.data + ", lh: " + leftHeight + ", rh: " + rightHieght + ", ret: " + myHeight);
    if (myHeight > maxBinaryHeight) {
      maxBinaryHeight = myHeight;
      maxBinaryTreeNode = root;
    }
    return maxBinaryHeight;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(3);
    root.right.right = new TreeNode(10);

    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.left.left = new TreeNode(6);
    root.left.left.right = new TreeNode(7);

    root.left.right = new TreeNode(5);
    root.left.right.left = new TreeNode(8);
    root.left.right.right = new TreeNode(9);
    root.left.right.left.left = new TreeNode(11);
    root.left.right.left.right = new TreeNode(12);

    System.out.println("max bt with height: " + findCompleteBinaryTree(root) + " at node: " + maxBinaryTreeNode.data);
  }
}

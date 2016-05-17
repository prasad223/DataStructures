package BasicDS.Trees;

import junit.framework.TestCase;

/**
 * Created by prasad223 on 1/24/16.
 */
public class BinaryTreeTest extends TestCase {

    BinaryTree binaryTree;
    public void setUp() throws Exception {
        super.setUp();
        binaryTree = new BinaryTree();
    }

    public void tearDown() throws Exception {
        binaryTree = null;
    }

    public void testInsert() throws Exception {
        binaryTree.insert(3);
        binaryTree.insert(1);
        binaryTree.insert(5);
    }

    public void testSearch() throws Exception{
        binaryTree.insert(3);
        binaryTree.insert(1);
        binaryTree.insert(5);
        binaryTree.insert(2);
        binaryTree.insert(4);
        TreeNode node = binaryTree.search(5);
        assertEquals(node.data, 5);
        node = binaryTree.search(89);
        assertEquals(node, null);
    }

    public void testPreorder() throws Exception {
        binaryTree.insert(3);
        binaryTree.insert(1);
        binaryTree.insert(5);
        binaryTree.insert(2);
        binaryTree.insert(4);

        System.out.println("Preorder: ");
        binaryTree.preorder(binaryTree.root);
        System.out.println("\nPreorder Iterative: ");
        binaryTree.preorderIterative(binaryTree.root);

        System.out.println("\nInorder: ");
        binaryTree.inorder(binaryTree.root);
        System.out.println("\nMorris Inorder: ");
        //binaryTree.morrisInorder(binaryTree.root);
        System.out.println("\nPost order: ");
        binaryTree.postOrder(binaryTree.root);
        System.out.println();
        binaryTree.preorderIterative(binaryTree.root);
        System.out.println("\nlevel order");
        binaryTree.levelOrder(binaryTree.root);

    }
}
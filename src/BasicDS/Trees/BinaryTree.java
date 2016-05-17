package BasicDS.Trees;

import HackerRank.Pal1;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by prasad223 on 1/14/16.
 */
public class BinaryTree {

    TreeNode root;

    BinaryTree(){
        root = null;
    }

    void insert(int data){
        TreeNode node = new TreeNode(data);
        if(this.root == null){
            this.root = node;
            return;
        }
        TreeNode cur = this.root;
        while(cur != null){
            if(data <= cur.data){
                if(cur.left == null){
                    cur.left = node;
                    break;
                }else{
                    cur = cur.left;
                }
            }else{
                if(cur.right == null){
                    cur.right = node;
                    break;
                }else{
                    cur = cur.right;
                }
            }
        }
    }

    void preorder(TreeNode root){
        if(root != null){
            System.out.print(root.data +" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void inorder(TreeNode node){
        if(node != null){
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    void preorderIterative(TreeNode root){
        TreeNode current;
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> nums = new ArrayList<>();
        if(root!= null){
            stack.push(root);
        }
        while(!stack.isEmpty()){
            current = stack.pop();
            nums.add(current.data);
            //System.out.print(current.data + " ");
            if(current.right != null){
                stack.push(current.right);
            }
            if(current.left != null){
                stack.push(current.left);
            }
        }
        System.out.println(Arrays.toString(nums.toArray()));
    }

    void postOrder(TreeNode node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data+ " ");
        }
    }

    void levelOrder(TreeNode node){
        if(node == null){
            return;
        }
        TreeNode cur = node;
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(node);
        while(!queue.isEmpty()){
            cur = queue.remove();
            System.out.print(cur.data+ " ");
            if(cur.left != null){
                queue.add(cur.left);
            }
            if(cur.right != null){
                queue.add(cur.right);
            }

        }
        System.out.println();
    }

    void morrisInorder(TreeNode node){
        TreeNode cur = node;
        while(cur != null){
            if(cur.left == null){
                System.out.print(cur.data +" ");
                cur = cur.right;
            }else{
                TreeNode temp = cur.left;
                while(temp.right != null){
                    temp = temp.right;
                }
                temp.right = cur;
                temp = cur.left;
                cur.left = null;
                cur = temp;

            }
        }
    }

    TreeNode search(int data){
        TreeNode cur = this.root;
        while(cur != null){
            if(data == cur.data){
                break;
            }else if(data < cur.data){
                cur = cur.left;
            }else{
                cur = cur.right;
            }
        }
        return cur;
    }

    TreeNode min(){
        if(this.root == null){
            return null;
        }
        TreeNode node = this.root;
        while(node.left != null){
            node = node.left;
        }
        return node;
    }

    TreeNode max(){
        if(this.root == null){
            return null;
        }
        TreeNode node = this.root;
        while(node.right != null){
            node = node.right;
        }
        return node;
    }

    int nodeCount(TreeNode root){
        int count = 0;
        TreeNode node = root;
        if(node != null){
            count = nodeCount(node.left) + nodeCount(node.right) + 1;
        }
        return count;
    }

    int height(TreeNode node){
        int height = 0;
        if(node != null){
            height = Math.max(height(node.left), height(node.right));
            height++;
        }
        return height;
    }

    int diameter(TreeNode node){
        int diameter = 0;
        if(node != null){
            int lh = height(node.left);
            int rh = height(node.right);
            diameter = rh + lh + 1;
        }
        return diameter;
    }

    TreeNode predecessor(int data){
        TreeNode node = search(data);
        TreeNode min = min();
        if(node == null || node == min)
            return null;

        return null;
    }

    TreeNode successor(int data){
        TreeNode node = search(data);
        TreeNode max = max();
        if(node == null || max == node)
            return null;

        return null;
    }

    void delete(int data){
        TreeNode cur = root;
    }
}

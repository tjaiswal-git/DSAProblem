package btree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeImpl {
    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree() {
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(4);
        TreeNode third = new TreeNode(2);
        TreeNode forth = new TreeNode(3);
        root = first;
        first.left = second;
        first.right = third;
        second.left = forth;
    }

    private void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private void inOrderByIterative(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.println(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    private void postOrder(TreeNode root) {
        if (root == null) {
            return; //base case
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    private void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
    }

    public static void main(String args[]) {

        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        binaryTree.createBinaryTree();
        // binaryTree.preOrder(binaryTree.root);
        // binaryTree.inOrderByIterative(binaryTree.root);
        //binaryTree.postOrder(binaryTree.root);
        binaryTree.levelOrder(binaryTree.root);
    }
}

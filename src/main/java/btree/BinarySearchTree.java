package btree;

public class BinarySearchTree {

    TreeNode root;

    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }

    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

    public String search(int key) {
        int data = 0;
        String msg = "";
        if (search(root, key) != null) {
            data = search(root, key).data;
            if (data == key) {
                msg = "Key Found!!";
            }
        } else {
            msg = "Key not Found!!";
        }
        return msg;
    }

    public TreeNode search(TreeNode root, int key) {
        if (root == null || root.data == key)  //base case for to execute recursive call stack
        {
            return root;
        }

        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void main(String... args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(9);
        binarySearchTree.insert(5);
        binarySearchTree.insert(6);
        binarySearchTree.insert(10);
        binarySearchTree.inOrder();
        System.out.println(binarySearchTree.search(5));
    }
}

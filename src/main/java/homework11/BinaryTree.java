package homework11;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Artur Tomeyan.
 */
public class BinaryTree {

    private final Node root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(int value) {
        this.root = new Node(value);
    }

    public Node getRoot() {
        return root;
    }

    public List<Object> inorderTraversal(Node node) {
        if (node == null) {
            return new LinkedList<>();
        }

        List<Object> list = new LinkedList<>();

        list.addAll(inorderTraversal(node.left));
        list.add(node.value);
        list.addAll(inorderTraversal(node.right));

        return list;
    }

    public List<Object> preorderTraversal(Node node) {
        if (node == null) {
            return new LinkedList<>();
        }

        List<Object> list = new LinkedList<>();

        list.add(node.value);
        list.addAll(preorderTraversal(node.left));
        list.addAll(preorderTraversal(node.right));

        return list;
    }

    public List<Object> postOrderTraversal(Node node) {
        if (node == null) {
            return new LinkedList<>();
        }

        List<Object> list = new LinkedList<>();

        list.addAll(postOrderTraversal(node.left));
        list.addAll(postOrderTraversal(node.right));
        list.add(node.value);

        return list;
    }

    public int treeDepth(Node node) {

        if (root == null) {
            System.out.print("This tree is empty");
            return 0;
        } else {
            int left = 0;
            int right = 0;

            if (node.left != null) {
                left = treeDepth(node.left);
            }

            if (node.right != null) {
                right = treeDepth(node.right);
            }

            int depth = Math.max(left, right);

            return depth + 1;
        }
    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
}
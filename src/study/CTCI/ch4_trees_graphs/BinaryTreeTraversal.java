package study.CTCI.ch4_trees_graphs;

public class BinaryTreeTraversal {


    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            //do something with node
            inOrderTraversal(node.right);
        }
    }

    public void preOrderTraversal(Node node) {
        if (node != null) {
            //do something with node
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            //do something with node
        }
    }

    private class Node {
        public Node left;
        public Node right;
    }
}

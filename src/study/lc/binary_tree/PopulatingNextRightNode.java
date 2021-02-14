package study.lc.binary_tree;

import java.util.ArrayList;
import java.util.List;

public class PopulatingNextRightNode {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public Node connect(Node root) {

        List<List<Node>> results = new ArrayList<>();
        helper(root, 0, results);
        return root;
    }

    private void helper(Node root, int index, List<List<Node>> results) {
        if (root == null) {
            return;
        }

        if (results.size() < index+1) {
            results.add(new ArrayList<>());
        }


        helper(root.left, index + 1, results);

        List<Node> result = results.get(index);
        if (result.size() > 0) {
            Node lastNode = result.get(result.size()-1);
            lastNode.next = root;
        }
        result.add(root);

        helper(root.right, index + 1, results);
    }
}

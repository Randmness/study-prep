package study.lc.nary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {

    public List<Integer> preorder(Node root) {
        List<Integer> results = new ArrayList<>();
        helper(root, results);
        return results;
    }

    private void helper(Node root, List<Integer> results) {
        if (root != null) {

            results.add(root.val);
            for (Node child: root.children) {
                helper(child, results);
            }
        }
    }

    //O(N) for both
    private void helperIter(Node root, List<Integer> results) {
        if (root == null) return;

        Stack<Node> nodes = new Stack<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            Node node = nodes.pop();
            results.add(node.val);
            Collections.reverse(node.children);
            for (Node item : node.children) {
                nodes.add(item);
            }
        }
    }
}

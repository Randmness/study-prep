package study.lc.nary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {

    public List<Integer> preorder(Node root) {
        List<Integer> results = new ArrayList<>();
        helper(root, results);
        return results;
    }

    private void helper(Node root, List<Integer> results) {
        if (root != null) {

            for (Node child: root.children) {
                helper(child, results);
            }
            results.add(root.val);
        }
    }

    //O(N) for both
    private void helperIter(Node root, List<Integer> results) {
        if (root == null) return;

        Stack<Node> nodes = new Stack<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            Node node = nodes.pop();
            results.add(0,node.val);
            for (Node item : node.children) {
                nodes.add(item);
            }
        }
    }
}

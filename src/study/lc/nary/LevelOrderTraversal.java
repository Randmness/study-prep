package study.lc.nary;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LevelOrderTraversal {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> results = new ArrayList<>();
        helper(root, 0, results);
        return  results;
    }

    private void helper(Node root, int level, List<List<Integer>> results) {
        if (root != null) {
            if (results.size() < level+1) {
                results.add(new ArrayList<>());
            }

            List<Integer> result = results.get(level);
            result.add(root.val);

            for (Node child : root.children) {
                helper(child, level+1, results);
            }
        }
    }
}

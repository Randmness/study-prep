package study.lc.recursion;

import study.lc.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        helper(root, results, 0);
        return results;
    }

    private void helper(TreeNode root, List<List<Integer>> results, int level) {
        if (root != null) {
            if (results.size() < level + 1) {
                results.add(new ArrayList<>());
            }

            List<Integer> levelResult = results.get(level);
            levelResult.add(root.val);

            if (root.left != null) helper(root.left, results, level+1);
            if (root.right != null) helper(root.right, results, level+1);
        }
    }
}

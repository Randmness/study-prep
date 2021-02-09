package study.lc.recursion;

import study.lc.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        helper(root, results);

        return results;
    }

    private void helper(TreeNode root, List<Integer> results) {
        if (root == null)  return;

        if (root.left != null) helper(root.left, results);
        results.add(root.val);
        if (root.right != null) helper(root.right, results);
    }
}

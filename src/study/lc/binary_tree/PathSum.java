package study.lc.binary_tree;

import study.lc.support.TreeNode;

public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        //leaf node
        if (root.left == null && root.right==null) {
            return root.val == targetSum;
        }

        return (hasPathSum(root.left, targetSum-root.val) ||
                hasPathSum(root.right, targetSum-root.val));
    }
}

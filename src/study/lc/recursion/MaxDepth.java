package study.lc.recursion;

import study.lc.support.TreeNode;

public class MaxDepth {

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }
}
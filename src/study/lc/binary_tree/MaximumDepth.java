package study.lc.binary_tree;

import study.lc.support.TreeNode;

public class MaximumDepth {

    int answer = 0;
    public int findMaximumDepth(TreeNode node) {
       helper(node, 0);
       return answer;
    }

    //top down
    private void helper(TreeNode node, int depth) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                Math.max(depth, answer);
            }

            helper(node.left, depth+1);
            helper(node.right, depth+1);
        }
    }

    //bottom up
    private int helper(TreeNode node) {
        if (node == null) return 0;

        return Math.max(helper(node.left), helper(node.right)) + 1;
    }
}

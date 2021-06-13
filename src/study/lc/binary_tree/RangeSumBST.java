package study.lc.binary_tree;

import study.lc.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class RangeSumBST {

    //https://leetcode.com/problems/range-sum-of-bst/
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        public int rangeSumBST(TreeNode root, int low, int high) {
            List<TreeNode> matching = new ArrayList<>();
            traversal(root, low, high, matching);

            int sum = 0;
            for (TreeNode node: matching) {
                sum+= node.val;
            }
            return sum;
        }

        private void traversal(TreeNode root, int low, int high, List<TreeNode> matching) {
            if (root == null) return;

            if (root.val >= low && root.val <= high) matching.add(root);
            traversal(root.left, low, high, matching);
            traversal(root.right, low, high, matching);
        }
    }
}

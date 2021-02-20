package study.lc.binary_tree;

import study.lc.support.TreeNode;

public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {

        return helper(nums, 0, nums.length-1);
    }

    private TreeNode helper(int[] nums, int left, int right) {
        if (left > right) return null;

        int middle = left + (right - left)/2;
        TreeNode parent = new TreeNode(nums[middle]);
        parent.left = helper(nums, left, middle-1);
        parent.right = helper(nums, middle+1, right);
        return parent;
    }
}

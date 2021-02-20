package study.lc.binary_tree;

import study.lc.support.TreeNode;

public class ValidateBST {

    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }


    /***
     *
     *           4 (4, null, null)
     *        3     6 [4, null]
     *      1      5   7
      *
     */
    private boolean validate(TreeNode root, Integer low, Integer high) {
        if (root == null) return true;

        if (low != null && root.val <= low) return false;
        if (high != null && root.val >= high) return false;

        return validate(root.right, root.val, high) && validate(root.left, low, root.val);
    }
}

package study.lc.binary_tree;

import study.lc.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class KthSmallest {

    class Solution {
        public int kthSmallest(TreeNode root, int k) {
            List<Integer> results = new ArrayList<>();
            helper(root, results);

            return results.get(k-1);
        }

        private void helper (TreeNode root, List<Integer> results) {
            if (root == null) return;

            helper(root.left, results);
            results.add(root.val);
            helper(root.right, results);
        }
    }
}

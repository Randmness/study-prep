package study.lc.binary_tree;

import study.lc.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal {

    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> results = new ArrayList<>();
            preorderTraversal(root, results);
            return results;
        }

        public void preorderTraversal(TreeNode root, List<Integer> results) {
            if (root == null) {
                return;
            }

            results.add(root.val);
            preorderTraversal(root.left, results);
            preorderTraversal(root.right, results);
        }
    }
}

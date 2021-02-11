package study.lc.binary_tree;

import study.lc.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {

    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> results = new ArrayList<>();
            inorderTraversal(root, results);
            return results;
        }

        public void inorderTraversal(TreeNode root, List<Integer> results) {
            if (root == null) {
                return;
            }

            inorderTraversal(root.left, results);
            results.add(root.val);
            inorderTraversal(root.right, results);
        }
    }
}

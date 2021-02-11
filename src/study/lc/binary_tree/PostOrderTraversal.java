package study.lc.binary_tree;

import study.lc.support.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {

    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> results = new ArrayList<>();
            postorderTraversal(root, results);
            return results;
        }

        public void postorderTraversal(TreeNode root, List<Integer> results) {
            if (root == null) {
                return;
            }

            postorderTraversal(root.left, results);
            postorderTraversal(root.right, results);
            results.add(root.val);
        }
    }
}

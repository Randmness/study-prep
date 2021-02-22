package study.lc.binary_tree;

import study.lc.support.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

        public void inOrderIter(TreeNode root, List<Integer> results) {
            Stack<TreeNode> nodes = new Stack<>();
            TreeNode current = root;
            while (current != null || !nodes.isEmpty()) {
                while (current != null) {
                    nodes.push(current);
                    current = current.left;
                }

                current = nodes.pop();
                results.add(current.val);
                current = current.right;
            }
        }
    }
}

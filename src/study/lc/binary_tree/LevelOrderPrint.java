package study.lc.binary_tree;

import study.lc.support.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderPrint {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        helper(root, results, 0);
        return results;
    }

    private void helper(TreeNode root, List<List<Integer>> results, int level) {
        if (root != null) {
            if (results.size() < level + 1) {
                results.add(new ArrayList<>());
            }

            List<Integer> levelResult = results.get(level);
            levelResult.add(root.val);

            if (root.left != null) helper(root.left, results, level+1);
            if (root.right != null) helper(root.right, results, level+1);
        }
    }

    public List<List<Integer>> levelOrderIter(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<List<Integer>> results = new ArrayList<>();
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        int resultIndex = 0;
        while (!nodes.isEmpty()) {
            //new level
            results.add(new ArrayList<>());
            int nodesCount = nodes.size();
            while (nodesCount > 0) {
                TreeNode node = nodes.remove();
                results.get(resultIndex).add(node.val);
                if (node.left != null) nodes.add(node.left);
                if (node.right != null) nodes.add(node.right);
                nodesCount--;
            }

            resultIndex++;
        }

        return results;
    }


}

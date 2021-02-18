package study.lc.binary_tree;

import study.lc.support.TreeNode;

import java.util.ArrayList;

public class MaximumDepth {

    int answer = 0;
    public int findMaximumDepth(TreeNode node) {
        if (node == null) return 0;

        return Math.max(findMaximumDepth(node.left), findMaximumDepth(node.right)) + 1;
    }

    public int findMaximumDepthIter(TreeNode node) {
        if (node == null) return 0;
        ArrayList<TreeNode> current = new ArrayList<>();
        ArrayList<TreeNode> children = new ArrayList<>();
        int result = 1;
        current.add(node);

        while(true) {
            while(current.size() != 0) {
                TreeNode tmp = current.remove(0);
                if (tmp.left != null) children.add(tmp.left);
                if (tmp.right != null) children.add(tmp.right);
            }

            if (children.size() == 0) break;
            current = children;
            children = new ArrayList<>();
            result++;
        }


        return result;
    }

}

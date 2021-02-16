package study.lc.binary_search;

import com.sun.source.tree.Tree;
import study.lc.support.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Insertion {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode current = root;

        while (current != null) {
            if (current.val > val) {
                if (current.left == null) {
                    current.left = new TreeNode(val);
                    return root;
                } else current = current.left;
            } else {
                if (current.right == null) {
                    current.right = new TreeNode(val);
                    return root;
                } else current = current.right;
            }
        }

        return new TreeNode(val);
    }
}

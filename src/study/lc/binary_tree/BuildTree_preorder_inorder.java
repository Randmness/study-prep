package study.lc.binary_tree;

import study.lc.support.TreeNode;

import java.util.Arrays;

public class BuildTree_preorder_inorder {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder);
    }

    private TreeNode helper(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }

        TreeNode node = new TreeNode(preorder[0]);
        if (preorder.length ==1) return node;

        int count = 0;
        //find elements before root val
        while (inorder[count] != node.val) {
            count++;
        }

        int[] leftInOder = Arrays.copyOfRange(inorder, 0, count);
        int[] leftPreOrder = Arrays.copyOfRange(preorder, 1, 1 + count);

        node.left = helper(leftPreOrder, leftInOder);

        //remaining preOrderElements (right)
        int[] rightPreOrder = Arrays.copyOfRange(preorder, count+1, preorder.length);
        //remaining inOrderElements (right)
        int[] rightInOrder = Arrays.copyOfRange(leftInOder, count+1, inorder.length);
        node.right = helper(rightPreOrder, rightInOrder);

        return node;
    }
}

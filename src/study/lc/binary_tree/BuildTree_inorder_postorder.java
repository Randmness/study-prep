package study.lc.binary_tree;

import study.lc.support.TreeNode;

import java.util.Arrays;

public class BuildTree_inorder_postorder {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) {
            return null;
        }

        TreeNode node = new TreeNode(postorder[postorder.length-1]);
        int count = 0;
        while (inorder[count] != node.val) {
            count++;
        }

        int[] leftInorder = Arrays.copyOfRange(inorder, 0, count);
        int[] leftPostorder = Arrays.copyOfRange(postorder, 0, count);
        node.left = buildTree(leftInorder, leftPostorder);

        int[] rightInorder = Arrays.copyOfRange(inorder, count+1, inorder.length);
        int[] rightPostorder = Arrays.copyOfRange(postorder, count, postorder.length-1);
        node.right = buildTree(rightInorder, rightPostorder);

        return node;
    }

}

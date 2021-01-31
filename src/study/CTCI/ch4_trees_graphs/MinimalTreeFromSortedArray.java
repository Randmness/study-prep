package study.CTCI.ch4_trees_graphs;

public class MinimalTreeFromSortedArray {

    TreeNode createMinimalBST(int[] sortedArray) {
        return createMinimalBST(sortedArray, 0, sortedArray.length-1);
    }

    public  TreeNode createMinimalBST(int[] sortedArray, int start, int end) {
        if (end < start) {
            return null;
        }

        int middle = (start + end) / 2;
        TreeNode node = new TreeNode(sortedArray[middle]);
        node.left = createMinimalBST(sortedArray, start, middle -1);
        node.right = createMinimalBST(sortedArray, middle + 1, end);
        return node;
    }

    private class TreeNode {
        int data;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }
}

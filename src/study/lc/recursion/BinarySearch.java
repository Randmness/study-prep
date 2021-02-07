package study.lc.recursion;

import study.lc.support.TreeNode;

public class BinarySearch {

    public static TreeNode searchBSTRecur(TreeNode head, int value) {
        if (head == null || head.val == value) return head;

        return value < head.val ? searchBSTRecur(head.left, value) : searchBSTRecur(head.right, value);
    }

    public static TreeNode searchBSTRIter(TreeNode head, int value) {
        while (head != null && head.val != value) {
            head = (value < head.val) ? head.left : head.right;
        }

        return head;
    }
}

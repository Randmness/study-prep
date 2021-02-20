package study.lc.linked_lists;

import study.lc.support.ListNode;

public class DeleteNode {

    //node is one to be deleted.
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

public class _082_RemoveDuplicatesfromSortedListII {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode n0 = new ListNode(0);
        n0.next = head;
        ListNode pre = n0, cur = head;
        while (cur != null) {
            while (cur.next != null && cur.next.val == cur.val) {
                cur = cur.next;
            }
            if (pre.next == cur) {
                pre = cur;
            } else {
                pre.next = cur.next;
            }
            cur = cur.next;
        }
        return n0.next;
    }

    public static void main(String[] args) {
        ListNode head = Util.createListNode(new int[]{1, 2, 3, 3, 4, 4, 5});
        ListNode node = new _082_RemoveDuplicatesfromSortedListII().deleteDuplicates(head);
        Util.printNode(node);
    }
}

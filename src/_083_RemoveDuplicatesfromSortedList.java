public class _083_RemoveDuplicatesfromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode n0 = new ListNode(0);
        n0.next = head;
        ListNode pre = n0, cur = head;
        while (cur != null) {
            while (cur.next != null && cur.next.val == cur.val) {
                cur = cur.next;
            }
            pre.next = cur;
            cur = cur.next;
            pre = pre.next;
        }
        return n0.next;
    }

    public static void main(String[] args) {
        ListNode head = Util.createListNode(new int[]{1, 2, 3, 3, 4, 4, 4, 5});
        ListNode node = new _083_RemoveDuplicatesfromSortedList().deleteDuplicates(head);
        Util.printNode(node);
    }
}

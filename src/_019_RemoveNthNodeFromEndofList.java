public class _019_RemoveNthNodeFromEndofList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode n0 = new ListNode(0);
        n0.next = head;
        ListNode slow = n0, fast = n0;
        while (n-- >= 0) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return n0.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        /**
         * 0-1-2-3-4-5-null(n=2)
         * s     f
         *       s     f
         *
         * 0-1-2-null(n=2)
         * s     f
         */
        ListNode node = new _019_RemoveNthNodeFromEndofList().removeNthFromEnd(l1, 2);
        Util.printNode(node);
    }
}

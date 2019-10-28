public class _086_PartitionList {

    public ListNode partition(ListNode head, int x) {
        ListNode n1 = new ListNode(0);
        ListNode n2 = new ListNode(0);
        n1.next = head;
        n2.next = head;
        ListNode p1 = n1, p2 = n2;
        while (head != null) {
            if (head.val < x) {
                p1.next = head;
                p1 = p1.next;
            } else {
                p2.next = head;
                p2 = p2.next;
            }
            head = head.next;
        }
        p2.next = null;
        p1.next = n2.next;
        return n1.next;
    }

    public static void main(String[] args) {
        ListNode head = Util.createListNode(new int[]{1, 4, 3, 2, 5, 2});
        ListNode node = new _086_PartitionList().partition(head, 2);
        Util.printNode(node);
    }
}

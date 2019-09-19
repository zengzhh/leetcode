public class _023_SwapNodesinPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode n = head.next;
        head.next = swapPairs(n.next);
        n.next = head;
        return n;
    }

    public static void main(String[] args) {
        ListNode head = Util.createListNode(new int[]{1, 2, 3, 4, 5});
        ListNode res = new _023_SwapNodesinPairs().swapPairs(head);
        Util.printNode(res);
    }
}

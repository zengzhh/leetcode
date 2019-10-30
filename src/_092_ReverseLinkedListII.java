public class _092_ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode fake = new ListNode(0);
        fake.next = head;
        ListNode pos = fake;
        ListNode pre = null; // node before head
        for (int i = 1; head != null && i <= n; i++) {
            if (i == m - 1) {
                pos = head;
            }
            ListNode post = head.next; // node after head
            if (i >= m) {
                head.next = pre;
                pre = head;
            }
            head = post;
        }
        // 0->1->2->3<-4<-5  6 : pos=2, pre=5, head=6
        pos.next.next = head;
        pos.next = pre;
        return fake.next;
    }

    public static void main(String[] args) {
        ListNode head = Util.createListNode(new int[]{1, 2, 3, 4, 5, 6});
        ListNode res = new _092_ReverseLinkedListII().reverseBetween(head, 3, 5);
        Util.printNode(res);
    }
}

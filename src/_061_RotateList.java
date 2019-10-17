public class _061_RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;
        ListNode fast = head;
        ListNode slow = head;
        int size = 1;
        while (fast.next != null) {
            fast = fast.next;
            size++;
        }
        System.out.println(size);
        int step = size - k % size;
        while (--step > 0) {
            slow = slow.next;
        }
        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = Util.createListNode(new int[]{1, 2, 3, 4, 5});
        ListNode res = new _061_RotateList().rotateRight(head, 2);
        Util.printNode(res);
    }
}

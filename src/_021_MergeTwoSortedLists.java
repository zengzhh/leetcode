public class _021_MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode n0 = new ListNode(0);
        ListNode p = n0;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) {
            p.next = l1;
        } else {
            p.next = l2;
        }
        return n0.next;
    }

    public static void main(String[] args) {
        int[] nodes1 = new int[]{2, 5, 6};
        int[] nodes2 = new int[]{3, 4};
        ListNode l1 = Util.createListNode(nodes1);
        ListNode l2 = Util.createListNode(nodes2);
        ListNode l3 = new _021_MergeTwoSortedLists().mergeTwoLists2(l1, l2);
        Util.printNode(l3);
    }
}

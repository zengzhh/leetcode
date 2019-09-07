public class _002_AddTwoNumbers {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        int carry = 0;
        ListNode dummy = new ListNode(-1), curr = dummy;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            curr.next = new ListNode(carry % 10);
            curr = curr.next;
            carry = carry / 10;
        }
        if (carry == 1) {
            curr.next = new ListNode(1);
        }
        return dummy.next;
    }

    private static void printNode(ListNode node) {
        if (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print("->");
                printNode(node.next);
            } else {
                System.out.print("\n");
            }
        }
    }

    public static void main(String[] args) {
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        ListNode l13 = new ListNode(3);
        l11.next = l12;
        l12.next = l13;
        printNode(l11);

        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(6);
        ListNode l23 = new ListNode(4);
        l21.next = l22;
        l22.next = l23;
        printNode(l21);

        ListNode sum = new _002_AddTwoNumbers().addTwoNumbers(l11, l21);
        printNode(sum);
    }
}

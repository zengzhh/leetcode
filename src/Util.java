public class Util {

    public static ListNode createListNode(int[] nodes) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        for (int i = 0; i < nodes.length; i++) {
            p.next = new ListNode(nodes[i]);
            p = p.next;
        }
        return head.next;
    }

    public static void printNode(ListNode node) {
        if (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print("->");
                printNode(node.next);
            } else {
                System.out.print("\n");
            }
        } else {
            System.out.println("\"null\"");
        }
    }
}

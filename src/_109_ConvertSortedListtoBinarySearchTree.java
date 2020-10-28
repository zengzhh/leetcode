public class _109_ConvertSortedListtoBinarySearchTree {

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        return toBST(head, null);
    }

    private TreeNode toBST(ListNode head, ListNode tail) {
        if (head == tail) return null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != tail && fast.next != tail) {
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode mid = new TreeNode(slow.val);
        mid.left = toBST(head, slow);
        mid.right = toBST(slow.next, tail);
        return mid;
    }

    public static void main(String[] args) {
        int[] nodes = new int[]{-10, -3, 0, 5, 9};
        ListNode head = Util.createListNode(nodes);
        TreeNode node = new _109_ConvertSortedListtoBinarySearchTree().sortedListToBST(head);
        Util.printTreeNodePreorder(node);
    }
}

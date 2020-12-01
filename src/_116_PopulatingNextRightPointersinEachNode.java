public class _116_PopulatingNextRightPointersinEachNode {

    public Node connect(Node root) {
        Node ori = root;
        while (root != null && root.left != null) {
            Node cur = root;
            while (cur != null) {
                cur.left.next = cur.right;
                cur.right.next = cur.next == null ? null : cur.next.left;
                cur = cur.next;
            }
            root = root.left;
        }
        return ori;
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 5, 3, 4, null, 6};
        Node root = Util.createNode(array);
        new _116_PopulatingNextRightPointersinEachNode().connect(root);
    }
}

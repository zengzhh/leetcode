public class _114_FlattenBinaryTreetoLinkedList {

    public void flatten(TreeNode root) {
        flatten(root, null);
    }

    private TreeNode flatten(TreeNode root, TreeNode pre) {
        if (root == null) return pre;
        pre = flatten(root.right, pre);
        pre = flatten(root.left, pre);
        root.right = pre;
        root.left = null;
        return root;
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 5, 3, 4, null, 6};
        TreeNode root = Util.createTreeNode(array);
        new _114_FlattenBinaryTreetoLinkedList().flatten(root);
        Util.printTreeNodePostorder(root);
    }
}

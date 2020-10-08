public class _104_MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{3, 9, 20, null, null, 15, 7};
        TreeNode root = Util.createTreeNode(array);
        int maxDepth = new _104_MaximumDepthofBinaryTree().maxDepth(root);
        System.out.println(maxDepth);
    }
}

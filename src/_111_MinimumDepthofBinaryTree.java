public class _111_MinimumDepthofBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left == 0 || right == 0) ? (left + right + 1) : Math.min(left, right) + 1;
    }

    public static void main(String[] args) {
        Integer[] root = new Integer[]{3, 9, 20, null, null, 15, 7};
        TreeNode treeNode = Util.createTreeNode(root);
        System.out.println(new _111_MinimumDepthofBinaryTree().minDepth(treeNode));
    }
}

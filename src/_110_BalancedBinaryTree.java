public class _110_BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(depth(root.left) - depth(root.right)) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int depth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }

    public static void main(String[] args) {
        Integer[] rootArray = new Integer[]{3, 9, 20, null, null, 15, 7};
        TreeNode root = Util.createTreeNode(rootArray);
        System.out.println(new _110_BalancedBinaryTree().isBalanced(root));
    }
}

public class _110_BalancedBinaryTree {

/*    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return (Math.abs(depth(root.left) - depth(root.right)) <= 1) && isBalanced(root.left) && isBalanced(root.right);
    }

    private int depth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }*/

    public boolean isBalanced(TreeNode root) {
        return depth(root) >= 0;
    }

    private int depth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        if (leftDepth == -1 || rightDepth == -1 || Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        }
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        Integer[] rootArray = new Integer[]{3, 9, 20, null, null, 15, 7};
        TreeNode root = Util.createTreeNode(rootArray);
        System.out.println(new _110_BalancedBinaryTree().isBalanced(root));
    }
}

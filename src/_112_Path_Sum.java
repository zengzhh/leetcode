public class _112_Path_Sum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if ((root.left == null && root.right == null))
            return sum == root.val;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1};
        TreeNode treeNode = Util.createTreeNode(array);
        boolean b = new _112_Path_Sum().hasPathSum(treeNode, 22);
        System.out.printf("return " + b);
    }
}

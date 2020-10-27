public class _108_ConvertSortedArraytoBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        TreeNode node = helper(nums, 0, nums.length - 1);
        return node;
    }

    public TreeNode helper(int[] num, int low, int high) {
        if (low > high) { // Done
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(num, low, mid - 1);
        node.right = helper(num, mid + 1, high);
        return node;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-10, -3, 0, 5, 9};
        TreeNode treeNode = new _108_ConvertSortedArraytoBinarySearchTree().sortedArrayToBST(array);
        Util.printTreeNodePreorder(treeNode);
    }
}

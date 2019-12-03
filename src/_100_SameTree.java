public class _100_SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val == q.val && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(new _100_SameTree().isSameTree(null, null));
    }
}

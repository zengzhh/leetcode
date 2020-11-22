import java.util.ArrayList;
import java.util.List;

public class _113_PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        dfs(root, sum, cur, res);
        return res;
    }

    private void dfs(TreeNode root, int sum, List<Integer> cur, List<List<Integer>> res) {
        if (root == null) return;
        cur.add(root.val);
        if (root.left == null && root.right == null && root.val == sum) {
            res.add(new ArrayList<>(cur));
        } else {
            dfs(root.left, sum - root.val, cur, res);
            dfs(root.right, sum - root.val, cur, res);
        }
        cur.remove(cur.size() - 1);
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, 5, 1};
        TreeNode root = Util.createTreeNode(array);
        List<List<Integer>> res = new _113_PathSumII().pathSum(root, 22);
        for (List<Integer> l : res)
            System.out.println(l);
    }
}

import java.util.ArrayList;
import java.util.List;

public class _107_BinaryTreeLevelOrderTraversalII {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        bfs(root, result, 0);
        return result;
    }

    public void bfs(TreeNode root, List<List<Integer>> result, int level) {
        if (root == null) {
            return;
        }
        if (level >= result.size()) {
            result.add(0, new ArrayList<Integer>());
        }
        bfs(root.left, result, level + 1);
        bfs(root.right, result, level + 1);
        result.get(result.size() - level - 1).add(root.val);
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{3, 9, 20, null, null, 15, 7};
        TreeNode root = Util.createTreeNode(array);
        List<List<Integer>> lists = new _107_BinaryTreeLevelOrderTraversalII().levelOrderBottom(root);
        System.out.println(lists);
    }
}

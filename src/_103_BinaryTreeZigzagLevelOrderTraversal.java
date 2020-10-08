import java.util.ArrayList;
import java.util.List;

public class _103_BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> sol = new ArrayList<>();
        travel(root, sol, 0);
        return sol;
    }

    private void travel(TreeNode curr, List<List<Integer>> sol, int level) {
        if (curr == null) return;
        if (sol.size() <= level) {
            List<Integer> tmpList = new ArrayList<>();
            sol.add(tmpList);
        }
        List<Integer> listNode = sol.get(level);
        if (level % 2 == 0) listNode.add(curr.val);
        if (level % 2 != 0) listNode.add(0, curr.val);
        travel(curr.left, sol, level + 1);
        travel(curr.right, sol, level + 1);
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{3, 9, 20, null, null, 15, 7};
        TreeNode root = Util.createTreeNode(array);
        List<List<Integer>> res = new _103_BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(root);
        System.out.println(res);
    }
}
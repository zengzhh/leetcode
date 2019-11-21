import java.util.ArrayList;
import java.util.List;

public class _095_UniqueBinarySearchTreesII {

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }
        return generate(1, n);
    }

    public List<TreeNode> generate(int start, int end) {
        List<TreeNode> list = new ArrayList<>();
        if (start > end) {
            list.add(null);
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> leftList = generate(start, i - 1);
            List<TreeNode> rightList = generate(i + 1, end);
            for (TreeNode left : leftList) {
                for (TreeNode right : rightList) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    list.add(root);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<TreeNode> list = new _095_UniqueBinarySearchTreesII().generateTrees(3);
        System.out.println(list);
        for (TreeNode node : list) {
            Util.printTreeNodePreorder(node);
            System.out.println();
        }
    }
}

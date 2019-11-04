import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _094_BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        list.addAll(inorderTraversal(root.left));
        list.add(root.val);
        list.addAll(inorderTraversal(root.right));
        return list;
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        LinkedList<TreeNode> stack = new LinkedList<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1l = new TreeNode(2);
        root.right = node1l;
        TreeNode node2r = new TreeNode(3);
        node1l.left = node2r;
        Util.printTreeNodeInorder(root);
        List<Integer> list = new _094_BinaryTreeInorderTraversal().inorderTraversal(root);
        System.out.println(list);
    }
}

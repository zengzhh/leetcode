import java.util.HashMap;
import java.util.Map;

public class _106_ConstructBinaryTreefromInorderandPostorderTraversal {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int inLen = inorder.length;
        int postLen = postorder.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inLen; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(postorder, 0, postLen - 1, map, 0, inLen - 1);
    }

    private TreeNode buildTree(int[] postorder, int postLeft, int postRight, Map<Integer, Integer> map, int inLeft, int inRight) {
        if (postLeft > postRight || inLeft > inRight) {
            return null;
        }
        int rootVal = postorder[postRight];
        TreeNode root = new TreeNode(rootVal);
        int pIndex = map.get(rootVal);
        root.left = buildTree(postorder, postLeft, postLeft + pIndex - inLeft - 1, map, inLeft, pIndex - 1);
        root.right = buildTree(postorder, postLeft + pIndex - inLeft, postRight - 1, map, pIndex + 1, inRight);
        return root;
    }

    public static void main(String[] args) {
//        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        TreeNode root = new _106_ConstructBinaryTreefromInorderandPostorderTraversal().buildTree(inorder, postorder);
        Util.printTreeNodePreorder(root);
    }
}

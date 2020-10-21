import java.util.HashMap;
import java.util.Map;

public class _105_ConstructBinaryTreefromPreorderandInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preLen = preorder.length;
        int inLen = inorder.length;
        Map<Integer, Integer> map = new HashMap<>(preLen);
        for (int i = 0; i < inLen; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(preorder, 0, preLen - 1, map, 0, inLen - 1);
    }

    private TreeNode buildTree(int[] preorder, int preLeft, int preRight, Map<Integer, Integer> map, int inLeft, int inRight) {
        if (preLeft > preRight || inLeft > inRight) {
            return null;
        }
        int rootVal = preorder[preLeft];
        TreeNode root = new TreeNode(rootVal);
        int pIndex = map.get(preorder[preLeft]);
        root.left = buildTree(preorder, preLeft + 1, preLeft + pIndex - inLeft, map, inLeft, pIndex - 1);
        root.right = buildTree(preorder, preLeft + pIndex - inLeft + 1, preRight, map, pIndex + 1, inRight);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
//        int[] postorder = {9, 15, 7, 20, 3};
        TreeNode root = new _105_ConstructBinaryTreefromPreorderandInorderTraversal().buildTree(preorder, inorder);
        Util.printTreeNodePostorder(root);
    }
}

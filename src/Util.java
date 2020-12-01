public class Util {

    public static ListNode createListNode(int[] nodes) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        for (int i = 0; i < nodes.length; i++) {
            p.next = new ListNode(nodes[i]);
            p = p.next;
        }
        return head.next;
    }

    public static void printNode(ListNode node) {
        if (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print("->");
                printNode(node.next);
            } else {
                System.out.print("\n");
            }
        } else {
            System.out.println("\"null\"");
        }
    }

    public static void printNums(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println(nums[nums.length - 1]);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            printNums(matrix[i]);
        }
    }

    public static TreeNode createTreeNode(Integer[] array) {
        return createTreeNodeByArray(array, 0);
    }

    private static TreeNode createTreeNodeByArray(Integer[] array, int index) {
        TreeNode root = null;
        if (index < array.length) {
            Integer val = array[index];
            if (val == null) {
                return null;
            }
            root = new TreeNode(val);
            root.left = createTreeNodeByArray(array, 2 * index + 1);
            root.right = createTreeNodeByArray(array, 2 * index + 2);
        }
        return root;
    }

    public static void printTreeNodeInorder(TreeNode node) {
        if (node == null)
            return;
        printTreeNodeInorder(node.left);
        System.out.print(node.val + ", ");
        printTreeNodeInorder(node.right);
    }

    public static void printTreeNodePreorder(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.val + ", ");
        printTreeNodePreorder(node.left);
        printTreeNodePreorder(node.right);
    }

    public static void printTreeNodePostorder(TreeNode node) {
        if (node == null)
            return;
        printTreeNodePostorder(node.left);
        printTreeNodePostorder(node.right);
        System.out.print(node.val + ", ");
    }

    public static Node createNode(Integer[] array) {
        return createNodeByArray(array, 0);
    }

    private static Node createNodeByArray(Integer[] array, int index) {
        Node root = null;
        if (index < array.length) {
            Integer val = array[index];
            if (val == null) {
                return null;
            }
            root = new Node(val);
            root.left = createNodeByArray(array, 2 * index + 1);
            root.right = createNodeByArray(array, 2 * index + 2);
        }
        return root;
    }
}

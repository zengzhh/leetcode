public class Util {

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
}

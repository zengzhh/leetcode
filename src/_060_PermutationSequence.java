import java.util.LinkedList;

public class _060_PermutationSequence {

    public String getPermutation(int n, int k) {
        int[] fac = new int[n];
        fac[0] = 1;
        for (int i = 1; i < n; i++) {
            fac[i] = i * fac[i - 1];
        }
        LinkedList list = new LinkedList();
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }
        StringBuilder sb = new StringBuilder();
        k = k - 1;
        for (int i = n; i > 0; i--) {
            int ind = k / fac[i - 1];
            k = k % fac[i - 1];
            sb.append(list.remove(ind));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String res = new _060_PermutationSequence().getPermutation(4, 9);
        System.out.println(res);
    }
}

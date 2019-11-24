public class _096_UniqueBinarySearchTrees {

    public int numTrees(int n) {
        if (n == 0 || n == 1)
            return 1;
        if (n == 2)
            return 2;
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            int tmp = 0;
            for (int j = 0; j < i; j++) {
                tmp += dp[j] * dp[i - 1 - j];
            }
            dp[i] = tmp;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(new _096_UniqueBinarySearchTrees().numTrees(3));
    }
}

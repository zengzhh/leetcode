public class _070_ClimbingStairs {

    public int climbStairs(int n) {
        if (n < 2) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(new _070_ClimbingStairs().climbStairs(4));
    }
}

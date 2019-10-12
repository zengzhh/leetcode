public class _053_MaximumSubarray {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        int sum[] = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = Math.max(nums[i], sum[i - 1] + nums[i]);
            max = Math.max(sum[i], max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max = new _053_MaximumSubarray().maxSubArray(nums);
        System.out.println(max);
    }
}

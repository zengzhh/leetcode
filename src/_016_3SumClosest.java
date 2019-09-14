import java.util.Arrays;

public class _016_3SumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[nums.length - 1];
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(res - target)) {
                    res = sum;
                }
                if (sum < target) {
                    while (left < right - 1 && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    left++;
                } else if (sum > target) {
                    while (left < right - 1 && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    right--;
                } else {
                    return sum;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-3, 0, 1, 2};
        int target = 1;
        int res = new _016_3SumClosest().threeSumClosest(nums, target);
        System.out.println(res);
    }
}

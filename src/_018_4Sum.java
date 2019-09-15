import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _018_4Sum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 4 || (nums.length >= 4 && 4 * nums[0] > target || 4 * nums[nums.length - 1] < target)) {
            return res;
        }
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right - 1 && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right - 1 && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, -5, -5, -3, 2, 5, 0, 4};
        int target = -7;
        List<List<Integer>> res = new _018_4Sum().fourSum(nums, target);
        System.out.println(res);
    }
}

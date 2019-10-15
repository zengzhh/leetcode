public class _055_JumpGame {

    public boolean canJump(int[] nums) {
        boolean res = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && res) {
                res = false;
                for (int j = 0; j < i; j++) {
                    if (nums[j] > i - j) {
                        res = true;
                        break;
                    }
                }
            }
        }
        return res;
    }

    public boolean canJump2(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return false;
            }
            max = Math.max(nums[i] + i, max);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 0, 1, 0, 1};
        boolean res = new _055_JumpGame().canJump(nums);
        System.out.println(res);
    }
}

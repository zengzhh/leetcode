public class _081_SearchinRotatedSortedArrayII {

    public boolean search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo < hi && nums[lo] == nums[hi]) {
            hi--;
        }
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] <= nums[hi]) {
                if (nums[mid] < target && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            } else {
                if (nums[lo] <= target && target < nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,3,1,1};
        System.out.println(new _081_SearchinRotatedSortedArrayII().search(nums, 3));
    }
}

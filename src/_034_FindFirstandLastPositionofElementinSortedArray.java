public class _034_FindFirstandLastPositionofElementinSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1;
        // find first one
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < target) {
                lo = mid + 1;
            } else if (nums[mid] > target) {
                hi = mid - 1;
            } else {
                first = mid;
                hi = mid - 1;
            }
        }
        // find last one
        lo = 0;
        hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < target) {
                lo = mid + 1;
            } else if (nums[mid] > target) {
                hi = mid - 1;
            } else {
                last = mid;
                lo = mid + 1;
            }
        }
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{};
        int target = 8;
        int[] res = new _034_FindFirstandLastPositionofElementinSortedArray().searchRange(nums, target);
        Util.printNums(res);
    }
}

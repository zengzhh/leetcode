public class _035_SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            // System.out.println(lo + " " + hi + " " + mid + "(" + nums[mid] + ")");
            if (nums[mid] > target) {
                hi = mid - 1;
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 4;
        int index = new _035_SearchInsertPosition().searchInsert(nums, target);
        System.out.println(index);
    }
}

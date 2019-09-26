public class _033_SearchinRotatedSortedArray {

    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // 6,7,1,2,3,4,5
            if (nums[mid] <= nums[hi]) {
                if (target > nums[mid] && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
            // 3,4,5,6,7,1,2
            else {
                if (target >= nums[lo] && target < nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{6, 7, 1, 2, 3, 4, 5};
        int target = 4;
        int index = new _033_SearchinRotatedSortedArray().search(nums, target);
        System.out.println(index);
    }
}

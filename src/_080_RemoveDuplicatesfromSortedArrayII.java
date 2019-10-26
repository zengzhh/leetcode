public class _080_RemoveDuplicatesfromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < 2 || nums[i] > nums[k - 2]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int len = new _080_RemoveDuplicatesfromSortedArrayII().removeDuplicates(nums);
        System.out.println(len);
    }
}

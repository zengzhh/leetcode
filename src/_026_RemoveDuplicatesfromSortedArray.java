public class _026_RemoveDuplicatesfromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1])
                nums[res++] = nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int res = new _026_RemoveDuplicatesfromSortedArray().removeDuplicates(nums);
        System.out.println("length = " + res);
        Util.printNums(nums);
    }
}

public class _075_SortColors {

    public void sortColors(int[] nums) {
        int i = 0, j = 0, k = 0;
        for (int p = 0; p < nums.length; p++) {
            if (nums[p] == 0) {
                nums[k++] = 2;
                nums[j++] = 1;
                nums[i++] = 0;
            } else if (nums[p] == 1) {
                nums[k++] = 2;
                nums[j++] = 1;
            } else if (nums[p] == 2) {
                nums[k++] = 2;
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        new _075_SortColors().sortColors(nums);
        Util.printNums(nums);
    }
}

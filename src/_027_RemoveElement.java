public class _027_RemoveElement {

    public int removeElement(int[] nums, int val) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                nums[res++] = nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int res = new _027_RemoveElement().removeElement(nums, val);
        System.out.println(res);
        Util.printNums(nums);
    }
}

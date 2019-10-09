import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _047_PermutationsII {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tmplist, int[] nums, boolean[] used) {
        if (tmplist.size() == nums.length) {
            list.add(new ArrayList<>(tmplist));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                    continue;
                }
                used[i] = true;
                tmplist.add(nums[i]);
                backtrack(list, tmplist, nums, used);
                used[i] = false;
                tmplist.remove(tmplist.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        List<List<Integer>> list = new _047_PermutationsII().permuteUnique(nums);
        System.out.println(list);
    }
}

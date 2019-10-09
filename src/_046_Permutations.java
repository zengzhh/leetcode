import java.util.ArrayList;
import java.util.List;

public class _046_Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tmplist, int[] nums) {
        if (tmplist.size() == nums.length) {
            list.add(new ArrayList<>(tmplist));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tmplist.contains(nums[i]))
                    continue;
                tmplist.add(nums[i]);
                backtrack(list, tmplist, nums);
                tmplist.remove(tmplist.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> list = new _046_Permutations().permute(nums);
        System.out.println(list);
    }
}

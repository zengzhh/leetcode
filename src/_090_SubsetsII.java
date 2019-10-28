import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _090_SubsetsII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tmpList, int[] nums, int start) {
        list.add(new ArrayList<>(tmpList));
        for (int i = start; i < nums.length; i++) {
            tmpList.add(nums[i]);
            backtrack(list, tmpList, nums, i + 1);
            Integer last = tmpList.get(tmpList.size() - 1);
            tmpList.remove(tmpList.size() - 1);
            while (i < nums.length - 1 && last == nums[i + 1]) i++;
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> res = new _090_SubsetsII().subsetsWithDup(new int[]{1, 2, 2});
        System.out.println(res);
    }
}

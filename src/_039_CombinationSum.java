import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _039_CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tmpList, int[] candidates, int remain, int start) {
        if (remain < 0) {
            return;
        } else if (remain == 0) {
            list.add(new ArrayList<>(tmpList));
        } else {
            for (int i = start; i < candidates.length; i++) {
                tmpList.add(candidates[i]);
                backtrack(list, tmpList, candidates, remain - candidates[i], i);
                tmpList.remove(tmpList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = new int[]{2, 3, 5};
        int target = 8;
        List<List<Integer>> list = new _039_CombinationSum().combinationSum(candidates, target);
        System.out.println(list);
    }
}

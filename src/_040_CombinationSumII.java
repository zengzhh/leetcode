import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _040_CombinationSumII {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
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
                if (i > start && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                tmpList.add(candidates[i]);
                backtrack(list, tmpList, candidates, remain - candidates[i], i + 1);
                tmpList.remove(tmpList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = new int[]{2, 5, 2, 1, 2};
        int target = 5;
        List<List<Integer>> list = new _040_CombinationSumII().combinationSum2(candidates, target);
        System.out.println(list);
    }
}

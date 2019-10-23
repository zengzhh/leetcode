import java.util.ArrayList;
import java.util.List;

public class _077_Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), n, k, 1);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tmpList, int n, int k, int start) {
        if (tmpList.size() == k) {
            list.add(new ArrayList<>(tmpList));
        } else {
            for (int i = start; i <= n; i++) {
                tmpList.add(i);
                backtrack(list, tmpList, n, k, i + 1);
                tmpList.remove(tmpList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> res = new _077_Combinations().combine(4, 2);
        System.out.println(res);
    }
}

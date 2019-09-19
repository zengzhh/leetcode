import java.util.ArrayList;
import java.util.List;

public class _022_GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }

    public void backtrack(List<String> list, String s, int left, int right, int n) {
        if (s.length() == 2 * n) {
            list.add(s);
            return;
        }
        if (left < n) {
            backtrack(list, s + "(", left + 1, right, n);
        }
        if (right < left) {
            backtrack(list, s + ")", left, right + 1, n);
        }

    }

    public static void main(String[] args) {
        int n = 3;
        List<String> res = new _022_GenerateParentheses().generateParenthesis(n);
        System.out.println(res);
    }
}

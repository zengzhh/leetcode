import java.util.ArrayList;
import java.util.List;

public class _093_RestoreIPAddresses {

    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", s, 0);
        return res;

    }

    private void backtrack(List<String> res, String path, String s, int k) {
        if (s.isEmpty() || k == 4) {
            if (s.isEmpty() && k == 4)
                res.add(path.substring(1));
            return;
        }
        for (int i = 1; i <= (s.charAt(0) == '0' ? 1 : 3) && i <= s.length(); i++) {
            String part = s.substring(0, i);
            if (Integer.valueOf(part) <= 255)
                backtrack(res, path + "." + part, s.substring(i), k + 1);

        }
    }

    public static void main(String[] args) {
        List<String> res = new _093_RestoreIPAddresses().restoreIpAddresses("25525511135");
        System.out.println(res);
    }
}

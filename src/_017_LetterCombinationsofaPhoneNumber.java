import java.util.LinkedList;
import java.util.List;

public class _017_LetterCombinationsofaPhoneNumber {

    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if (digits.isEmpty()) return ans;
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        while (ans.peek().length() < digits.length()) {
            String remove = ans.remove();
            String map = mapping[digits.charAt(remove.length()) - '0'];
            for (char c : map.toCharArray()) {
                ans.add(remove + c);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String digits = "237";
        List<String> res = new _017_LetterCombinationsofaPhoneNumber().letterCombinations(digits);
        System.out.println(res);
    }
}

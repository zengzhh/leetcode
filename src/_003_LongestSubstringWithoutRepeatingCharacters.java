import java.util.HashMap;
import java.util.HashSet;

public class _003_LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        // sub: j~i
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }

    public int lengthOfLongestSubstring2(String s) {
        if (s.length() == 0) {
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        // sub: j~i
        int i = 0, j = 0;
        while (i < s.length()) {
            if (set.add(s.charAt(i))) {
                max = Math.max(max, i - j + 1);
                i++;
            } else {
                set.remove(s.charAt(j++));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(new _003_LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s));
    }
}

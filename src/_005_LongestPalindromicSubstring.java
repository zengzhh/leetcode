public class _005_LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int maxLen = 0, lo = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int len1 = extendPalindrome(s, i, i); //odd
            int len2 = extendPalindrome(s, i, i + 1); //even
            if (maxLen < Math.max(len1, len2)) {
                maxLen = Math.max(len1, len2);
                lo = (len1 > len2) ? (i - len1 / 2) : (i - len2 / 2 + 1);
            }
        }
        return s.substring(lo, lo + maxLen);
    }

    private int extendPalindrome(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return j - i - 1;
    }

    public static void main(String[] args) {
        String s = "cbbd";
        String res = new _005_LongestPalindromicSubstring().longestPalindrome(s);
        System.out.println(res);
    }
}

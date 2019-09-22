public class _028_ImplementstrStr {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            for (int j = 0; j < needle.length() && haystack.charAt(i + j) == needle.charAt(j); j++) {
                if (j == needle.length() - 1)
                    return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        int index = new _028_ImplementstrStr().strStr(haystack, needle);
        System.out.println(index);
    }
}

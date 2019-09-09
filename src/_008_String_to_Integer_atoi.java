public class _008_String_to_Integer_atoi {

    public int myAtoi(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int len = str.length();
        int sign = 1, base = 0, i = 0;
        while (i < len && str.charAt(i) == ' ') {
            i++;
        }
        if (i < len && (str.charAt(i) == '-' || str.charAt(i) == '+')) {
            sign = str.charAt(i++) == '-' ? -1 : 1;
        }
        while (i < len && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            base = 10 * base + (str.charAt(i++) - '0');
        }
        return base * sign;
    }

    public static void main(String[] args) {
        String s1 = "42";
        String s2 = "  -42";
        String s3 = "4193 with words";
        String s4 = "words and 987";
        String s5 = "-91283472332";
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648
        int res = new _008_String_to_Integer_atoi().myAtoi(s3);
        System.out.println(res);
    }
}

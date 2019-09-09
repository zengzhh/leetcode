public class _009_PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int rev = 0;
        int y = x;
        while (y != 0) {
            rev = rev * 10 + y % 10;
            y = y / 10;
        }
        if (rev == x) {
            return true;
        }
        return x == rev;
    }

    public static void main(String[] args) {
        int x1 = 121;
        int x2 = -121;
        int x3 = 10;
        boolean res = new _009_PalindromeNumber().isPalindrome(0);
        System.out.println(res);
    }
}

public class _007_ReverseInteger {

    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int tail = x % 10;
            int newRes = res * 10 + tail;
            if ((newRes - tail) / 10 != res) {
                return 0;
            }
            res = newRes;
            x = x / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        int x = Integer.MAX_VALUE;
        int res = new _007_ReverseInteger().reverse(x);
        System.out.println(res);
    }
}

public class _050_PowXN {

    /*
     * 9 = 2^3 + 2^0 = (1001)2
     * x^9 = x^(2^3) * x^(2^0)
     */
    public double myPow(double x, int n) {
        double ans = 1;
        long absN = Math.abs((long) n);
        while (absN > 0) {
            if ((absN & 1) == 1) {
                ans *= x;
            }
            absN >>= 1;
            x *= x;
        }
        return n < 0 ? 1 / ans : ans;
    }

    public static void main(String[] args) {
        double x = 0.00001;
        int n = 2147483647;
        double res = new _050_PowXN().myPow(x, n);
        System.out.println(res);
    }
}

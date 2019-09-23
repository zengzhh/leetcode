public class _029_DivideTwoIntegers {

    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        boolean isSame = dividend > 0 == divisor > 0;
        int res = divideHelper(-Math.abs(dividend), -Math.abs(divisor));
        return isSame ? res : -res;
    }

    private int divideHelper(int dividend, int divisor) {
        if (divisor < dividend) return 0;
        // top digit
        int pos = 1;
        while ((divisor << pos) >= dividend && (divisor << pos) < 0 && pos < 31) pos++;
        int power = pos - 1;
        int remainder = dividend - (divisor << power);
        if (remainder > divisor) return 1 << power;
        return (1 << power) + divide(remainder, divisor);
    }

    public static void main(String[] args) {
        int dividend = -10;
        int divisor = -1;
        int res = new _029_DivideTwoIntegers().divide(dividend, divisor);
        System.out.println(res);
    }
}

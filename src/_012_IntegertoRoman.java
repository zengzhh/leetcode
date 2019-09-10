public class _012_IntegertoRoman {

    public String intToRoman(int num) {
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
    }

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;
        int num3 = 9;
        int num4 = 58;
        int num5 = 1994;
        String roman = new _012_IntegertoRoman().intToRoman(num5);
        System.out.println(roman);
    }
}

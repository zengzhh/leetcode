public class _067_AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            if (i >= 0) carry += a.charAt(i--) - '0';
            if (j >= 0) carry += b.charAt(j--) - '0';
            sb.append(carry % 2);
            carry = carry / 2;
        }
        if (carry == 1) {
            sb.append("1");
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String sum = new _067_AddBinary().addBinary("11", "1");
            System.out.println(sum);
}
}

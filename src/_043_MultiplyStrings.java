public class _043_MultiplyStrings {

    public String multiply(String num1, String num2) {
        int n1 = num1.length(), n2 = num2.length();
        int[] products = new int[n1 + n2];
        for (int i = n1 - 1; i >= 0; i--) {
            int d1 = num1.charAt(i) - '0';
            for (int j = n2 - 1; j >= 0; j--) {
                int d2 = num2.charAt(j) - '0';
                products[i + j + 1] += d1 * d2;
//                System.out.println(d1 + "(" + i + ")*" + d2 + "(" + j + ") => p[" + (i + j + 1) + "]=" + products[i + j + 1]);
            }
        }
        int carry = 0;
        for (int i = products.length - 1; i >= 0; i--) {
            int tmp = (products[i] + carry) % 10;
            carry = (products[i] + carry) / 10;
            products[i] = tmp;
//            System.out.println("p[" + i + "]=" + tmp);
        }
        StringBuilder sb = new StringBuilder();
        for (int num : products) sb.append(num);
        while (sb.length() != 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        String product = new _043_MultiplyStrings().multiply(num1, num2);
        System.out.println(product);
    }
}

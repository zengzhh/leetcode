public class _006_ZigZagConversion {

    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        StringBuffer[] sb = new StringBuffer[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuffer();
        }
        int len = c.length;
        int i = 0;
        while (i < len) {
            for (int idx = 0; idx < numRows && i < len; idx++) {
                sb[idx].append(c[i]);
                i++;
            }
            for (int idx = numRows - 2; idx > 0 && i < len; idx--) {
                sb[idx].append(c[i]);
                i++;
            }
        }
        for (int j = 1; j < sb.length; j++) {
            sb[0].append(sb[j]);
        }
        return sb[0].toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String res = new _006_ZigZagConversion().convert(s, numRows);
        System.out.println(res);
    }
}

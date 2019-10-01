public class _038_CountandSay {

    public String countAndSay(int n) {
        if (n == 1) return "1";
        String pre = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < pre.length()) {
            char say = pre.charAt(i);
            int j = 0;
            while (i + j < pre.length() && pre.charAt(i + j) == say) {
                j++;
            }
            sb.append(j).append(say);
            i = i + j;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String res = new _038_CountandSay().countAndSay(5);
        System.out.println(res);
    }
}

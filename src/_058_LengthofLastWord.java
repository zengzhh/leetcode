public class _058_LengthofLastWord {

    public int lengthOfLastWord(String s) {
        int index = s.trim().lastIndexOf(" ");
        return s.trim().length() - index - 1;
    }

    public static void main(String[] args) {
        String s = "Hello World ";
        int length = new _058_LengthofLastWord().lengthOfLastWord(s);
        System.out.println(length);
    }
}

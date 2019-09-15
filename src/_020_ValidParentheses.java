import java.util.Stack;

public class _020_ValidParentheses {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case ')':
                    if (!stack.isEmpty() && stack.peek() == '(') stack.pop();
                    break;
                case ']':
                    if (!stack.isEmpty() && stack.peek() == '[') stack.pop();
                    break;
                case '}':
                    if (!stack.isEmpty() && stack.peek() == '{') stack.pop();
                    break;
                default:
                    stack.push(s.charAt(i));
                    break;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{[()]}()";
        boolean res = new _020_ValidParentheses().isValid(s);
        System.out.println(res);
    }
}

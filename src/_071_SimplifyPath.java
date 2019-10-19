import java.util.Stack;

public class _071_SimplifyPath {

    public String simplifyPath(String path) {
        // "path", ".", "..", ""
        String[] strs = path.split("/");
        Stack stack = new Stack();
        for (int i = 0; i < strs.length; i++) {
            if (!stack.isEmpty() && strs[i].equals("..")) {
                stack.pop();
            }
            if (!strs[i].equals(".") && !strs[i].equals("..") && !strs[i].isEmpty()) {
                stack.push(strs[i]);
            }
        }
        if (stack.isEmpty()) return "/";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            sb.append("/").append(stack.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new _071_SimplifyPath().simplifyPath("/../"));
    }
}

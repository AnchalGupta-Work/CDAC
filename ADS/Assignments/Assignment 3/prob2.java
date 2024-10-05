// Check for balanced parentheses using a stack
import java.util.*;

class prob2 {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = "({}()"; // Change this string to test other cases
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                s.push(c);
            } else {
                if (s.isEmpty()) {
                    System.out.println("false");
                    return;
                }
                char top = s.peek();
                if ((top == '(' && c == ')') ||
                    (top == '{' && c == '}') ||
                    (top == '[' && c == ']')) {
                    s.pop();
                } else {
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println(s.isEmpty() ? "true" : "false");
    }
}

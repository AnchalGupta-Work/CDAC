//Evaluate a postfix expression using a stack.
import java.util.*;

class prob4 {
    public static void main(String[] args) {
        String str = "53+2*";
        System.out.println(postFix(str)); 
        System.out.println(postFix("45*6/")); 
    }
    
    static int postFix(String str) {
        Stack<Integer> s = new Stack<>();
        
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if (Character.isDigit(c)) {
                s.push(c - '0');
            } else {
                int num1 = s.pop();
                int num2 = s.pop();
                
                switch (c) {
                    case '+':
                        s.push(num2 + num1);
                        break;
                    case '-':
                        s.push(num2 - num1);
                        break;
                    case '/':
                        s.push(num2 / num1);
                        break;
                    case '*':
                        s.push(num2 * num1);
                        break;
                }
            }
        }
        return s.pop();
    }
}

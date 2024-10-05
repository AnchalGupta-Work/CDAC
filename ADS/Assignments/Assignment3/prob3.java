// Program to reverse string using stack;
import java.util.*;

class prob4 {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = "hello world";  
        String nstr = "";  

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));  
        }

        for (int i = 0; i < str.length(); i++) {
            nstr += s.pop();  
        }

        System.out.println(nstr);  
    }
}

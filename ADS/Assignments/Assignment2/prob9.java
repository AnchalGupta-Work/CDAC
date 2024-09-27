// Problem: Write a Java program to check if a given string is a palindrome.
import java.util.*;

class prob9 {
    public static void main(String[] args) {
        System.out.println(palinCheck("madam"));
        System.out.println(palinCheck("hello"));
        
        
    }
    public static boolean palinCheck(String s) {
        char[] c = s.toCharArray();
        String s1 = "";
        for(int i=c.length-1 ; i>=0 ; i--) {
            s1 = s1+c[i];
        }
        if(s1.equals(s)) {
            return true;
        }
        else {
            return false;
        }
    }
}
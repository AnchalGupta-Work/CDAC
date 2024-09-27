// Problem: Write a Java program to reverse the words in a given sentence.
// Time complexity of O(n) and Space complexity of O(n)
// First we will convert string into an char array
// loop the char array in reverse and store it inside the new string
import java.util.*;

class prob6 {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(revString(s));
    }
    
    public static String revString(String s) {
        char[] c = s.toCharArray();
        String rs = "";
        
        for(int i=c.length-1 ; i>=0 ; i-- ) {
            rs = rs+c[i];
        }
        return rs;
        
    }
}
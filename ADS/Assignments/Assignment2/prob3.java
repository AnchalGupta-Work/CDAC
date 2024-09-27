// Problem: Write a Java program to remove all white spaces from a given string.
// Time complexity of O(n) because replaceAll method iterate over all the elements
// Space complexity O(n) because new string is created to store elements


import java.util.*;


class prob3 {
    public static void main(String[] args) {
        // Calling StringFormat method with testcases
        System.out.println(stringFormat("hello world"));
        System.out.println(stringFormat("java   programming"));
    }
    
    public static String stringFormat(String s) {
        // replaceAll method will replace all the white space,tabs and new line
        String s1 = s.replaceAll("\\s","");
        return s1;
        
    }
}


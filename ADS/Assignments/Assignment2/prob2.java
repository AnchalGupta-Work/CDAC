//Problem: Write a Java program to remove duplicates from a sorted array and return the new length of the array.
// Time complexity is O(n) because of n operations in loop
// Space complexity is O(n) because of using hashset


import java.util.*;

class prob2 {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,5,5};
        System.out.println("Duplicate array size "+arr.length);
        System.out.println("Non Duplicate array size "+dupArray(arr));
    }
    
    public static int dupArray(int[] arr) {
        Set<Integer> ls = new HashSet<>(); // Created new hashset
         
         // Looping to add values from arrays to hashset
        for(int i=0 ; i<arr.length ; i++) {
            ls.add(arr[i]); 
        }
        
        return ls.size();
        
        
        
    }
}
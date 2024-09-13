/*
 * 1.	Declare a single-dimensional array of 5 integers inside the main method. 
 * Traverse the array to print the default values. 
 * Then accept records from the user and print the updated values of the array.
 * 
 */
import java.util.*;

 public class prob1 {
    public static void main(String[] args) {
        
        int[] arr = new int[5];

        for(int i=0 ; i<arr.length ; i++) { 
            arr[i] = i;
        }
       Scanner sc = new Scanner(System.in);
        

        for(int i=0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i=0 ; i<arr.length ; i++) {
            System.out.println(arr[i]);
        }


    }
 }
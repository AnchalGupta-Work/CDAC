/*
2.	Declare a single-dimensional array of 5 integers inside the main method.
 Define a method named acceptRecord to get input from the terminal into the array and 
 another method named printRecord to print the state of the array to the terminal.
 */

import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        int[] arr = new int[] {2,4,5,6,7};
        Scanner sc = new Scanner(System.in);

        
        for(int i=0 ; i<arr.length ; i++) {
            System.out.println("Enter the value for array");
            arr[i] = sc.nextInt();
        }




        
        

    }
    void acceptRecord() {

    }
}


}

/*
9.	You need to implement a system to manage airplane seat assignments. 
The airplane has seats arranged in rows and columns. Implement functionalities to:
•	Initialize the seating arrangement with a given number of rows and columns.
•	Book a seat to mark it as occupied.
•	Cancel a booking to mark a seat as available.
•	Check seat availability to determine if a specific seat is available.
•	Display the current seating chart.

 */

 import java.util.Arrays;
 import java.util.Scanner;
 
 public class prob9 {
     public static void main(String[] args) {
         Airplane obj = new Airplane();
         Scanner sc = new Scanner(System.in);
 
         System.out.println("Enter the seat number (row and column): ");
         obj.bookSeat(sc.nextInt(), sc.nextInt());
         System.out.println("Your seat is booked");
 
         System.out.println("Enter another seat number (row and column): ");
         obj.bookSeat(sc.nextInt(), sc.nextInt());
         System.out.println("Your seat is booked");
 
         System.out.println("Current seat chart:");
         System.out.println(Arrays.deepToString(obj.getArr()));
 
         System.out.println("Enter the seat number (row and column) to cancel: ");
         obj.cancelSeat(sc.nextInt(), sc.nextInt());
 
         System.out.println("Seat chart after cancellation:");
         System.out.println(Arrays.deepToString(obj.getArr()));
 
         System.out.println("Enter seat number (row and column) to check availability: ");
         boolean isAvailable = obj.checkSeatAvail(sc.nextInt(), sc.nextInt());
 
         if (isAvailable) {
             System.out.println("The seat is available.");
         } else {
             System.out.println("The seat is already booked.");
         }
 
         System.out.println("Current seat chart:");
         System.out.println(Arrays.deepToString(obj.getArr()));
     }
 }
 
 class Airplane {
     int[][] arr;
 
     Airplane() {
         arr = new int[5][5];
     }
 
     public int[][] getArr() {
         return arr;
     }
 
     public void bookSeat(int a, int b) {
         if (a >= 0 && a < 5 && b >= 0 && b < 5) {
             if (arr[a][b] == 0) { 
                 arr[a][b] = 1;
             } else {
                 System.out.println("Seat already booked!");
             }
         } else {
             System.out.println("Invalid seat number. Please enter values between 0 and 4.");
         }
     }
 
     public void cancelSeat(int a, int b) {
         if (a >= 0 && a < 5 && b >= 0 && b < 5) {
             if (arr[a][b] == 1) {
                 arr[a][b] = 0;
                 System.out.println("Seat canceled at row " + a + " and column " + b);
             } else {
                 System.out.println("Seat is not booked, so cannot cancel!");
             }
         } else {
             System.out.println("Invalid seat number. Please enter values between 0 and 4.");
         }
     }
 
     public boolean checkSeatAvail(int a, int b) {
         if (a >= 0 && a < 5 && b >= 0 && b < 5) {
             return arr[a][b] == 0;
         } else {
             System.out.println("Invalid seat number. Please enter values between 0 and 4.");
             return false;
         }
     }
 }
   


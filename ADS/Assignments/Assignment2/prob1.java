// Problem: Write a Java program to print patterns such as a right triangle of stars.
// Time complexity is O(n^2) because of nested loops
// Space complexity is O(1) because of constant variables
// Flow chart is
// Calling the patternprint method from main method
// first loop will start with the first row
// second loop will print the * in columns

class Prob1 {
    public static void main(String[] args) {
        patternPrint(5); //calling the method;
        patternPrint(3);
    
    }
    // method to print the pattern
    public static void patternPrint(int n) {
        for(int i=1 ; i<=n ; i++) { //First loop is for rows
            for(int j=1 ; j<=i ; j++) { // Nested loop for columns
                System.out.print("*");
            } 
            System.out.println("");
        }
    }
}
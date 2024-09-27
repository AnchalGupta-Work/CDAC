// Problem: Write a Java program to reverse a given number.


class prob7 {
    public static void main(String[] args) {
        System.out.println(revNum(345)); // Output: 543
    }

    public static int revNum(int n) {
        int rev = 0;
        
        while (n != 0) {
            rev = rev * 10 + n % 10; // Add the last digit of n to rev
            n = n / 10; // Remove the last digit from n
        }
        return rev; // Return the reversed number
    }
}

// Problem: Write a Java program to reverse a given string.


class prob4 {
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
        System.out.println(reverseString("java"));
    }

    public static String reverseString(String s) {
        String s1 = "";  // Resulting reversed string
        char[] c = s.toCharArray();  // Convert string to char array
        
        for (int i = c.length - 1; i >= 0; i--) {
            s1 = s1 + c[i];  // Concatenate characters to s1
        }
        return s1;  // Return the reversed string
    }
}

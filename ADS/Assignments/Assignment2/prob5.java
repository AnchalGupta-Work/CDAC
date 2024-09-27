// Problem: Write a Java program to reverse an array in place.
// Time complexity O(n) and space Complexity O(n);

class prob5 {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8};
        revArray(arr);
    }
    
    public static void revArray(int[] arr) {
        int[] arr1 = new int[arr.length];
        for(int i=arr.length-1 ; i>=0 ; i--) {
            arr1[arr.length-i-1] = arr[i];
        }
        for (int k : arr1) {
            System.out.println(k);
        }
    }
}
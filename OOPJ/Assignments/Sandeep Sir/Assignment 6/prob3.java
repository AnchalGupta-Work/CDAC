// 3.	Write a program to find the maximum and minimum values in a single-dimensional array of integers.


public class prob3 {
    public static void main(String[] args) {
        int[] arr = new int[] {10,45,5,78,99};
        int min = arr[0];
        int max = arr[0];
   
        for(int i=1 ; i<arr.length ; i++) {
            if(max<arr[i]) {
                max = arr[i];
            }
            if(min>arr[i]) {
                min = arr[i];
            }
        }
    System.out.println(min);
    System.out.println(max);
    }

}

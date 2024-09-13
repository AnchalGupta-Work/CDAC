/*
 * 4.	Write a program to remove duplicate elements from a single-dimensional array of integers.
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class prob4 {
    public static void main(String[] args) {
        int[] arr = new int[] {3,7,5,4,3,8};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int j=0;

       for (int i=1 ; i<arr.length ; i++) {
         if(arr[i]!=arr[j])
       }


    }
}

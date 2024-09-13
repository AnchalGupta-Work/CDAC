// 8.	Modify the previous assignment to use getter and setter methods instead of acceptRecord and printRecord.
import java.util.Arrays;
import java.util.Scanner;

public class prob8 {
    
    public static void main(String[] args) {
        Arr obj = new Arr();
        obj.acceptRecord();
        obj.printRecord();
    }
    
}

class Arr {
    private int[] arr;

    
    public Arr() {
        arr = new int[4];
    }

    
    public int[] getArr() {
        return arr;
    }

    
    public void setArr(int[] arr) {
        this.arr = arr;
    }

    
    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value for array index " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }

    
    public void printRecord() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
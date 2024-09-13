// 6.	Write a program to find the missing number in an array of integers ranging from 1 to N.


public class prob6 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,5,6,4,8}; 
                              {1,2,3,4,5,6,7,8}    
 int sum1=0;
 int sum2=0;
        for(int i=0 ; i<arr.length ; i++) {
            sum1= sum1+i;

        }
        for(int i=0 ; i<arr.length+1 ; i++) {  
            sum2=sum2+i;
        }
        System.out.println(sum2-sum1);

    }
}

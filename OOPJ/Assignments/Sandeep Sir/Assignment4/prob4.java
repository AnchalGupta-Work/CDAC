/*
 * 4. Discount Calculation for Retail Sales
Design a system to calculate the final price of an item after applying a discount. The system should:
1.	Accept the original price of an item and the discount percentage from the user.
2.	Calculate the discount amount and the final price using the following formulas:
o	Discount Amount Calculation: discountAmount = originalPrice * (discountRate / 100)
o	Final Price Calculation: finalPrice = originalPrice - discountAmount
3.	Display the discount amount and the final price of the item, in Indian Rupees (₹).
Define the class DiscountCalculator with fields, an appropriate constructor, getter and setter methods, a toString method, and business logic methods. Define the class DiscountCalculatorUtil with methods acceptRecord, printRecord, and menuList. Define the class Program with a main method to test the functionality of the utility class.


 */

import java.util.Scanner;

public class prob4 {
    public static void main(String[] args) {
        DiscountCalculatorUtil obj1 = new DiscountCalculatorUtil();
        obj1.acceptRecord();
        obj1.printRecord();

        
    }
}



class DiscountCalculator {
    private double originalPrice;
    private double discountRate;

    public DiscountCalculator() {
        this(0.0,0.0);
    }

    public DiscountCalculator(double originalPrice, double discountRate) {
        this.originalPrice = originalPrice;
        this.discountRate = discountRate;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() 
 {
        return discountRate;
    }

    

    public double calculateDiscountAmount() {
        return originalPrice * (discountRate / 100);
    }

    public double calculateFinalPrice() {
        return originalPrice - calculateDiscountAmount();
    }

    public String toString() {
        return "Original Price: ₹" + originalPrice + "\n" +
                "Discount Rate: " + discountRate + "%\n" +
                "Discount Amount: ₹" + calculateDiscountAmount() + "\n" +
                "Final Price: ₹" + calculateFinalPrice();
    }
}



class DiscountCalculatorUtil {
     
    DiscountCalculator obj = new DiscountCalculator();
    
     public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original price: ₹");
        obj.setOriginalPrice(sc.nextDouble());
        System.out.print("Enter the discount rate (%): ");
        obj.setDiscountRate(sc.nextDouble());
       
    
     }

    public void printRecord() {
        System.out.println(obj.calculateFinalPrice());
        System.out.println(obj);
    }

}


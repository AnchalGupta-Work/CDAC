/*
 * 3. BMI (Body Mass Index) Tracker
Create a system to calculate and classify Body Mass Index (BMI). The system should:
1.	Accept weight (in kilograms) and height (in meters) from the user.
2.	Calculate the BMI using the formula:
o	BMI Calculation: BMI = weight / (height * height)
3.	Classify the BMI into one of the following categories:
o	Underweight: BMI < 18.5
o	Normal weight: 18.5 ≤ BMI < 24.9
o	Overweight: 25 ≤ BMI < 29.9
o	Obese: BMI ≥ 30
4.	Display the BMI value and its classification.
Define the class BMITracker with fields, an appropriate constructor, getter and setter methods, a toString method, and business logic methods. Define the class BMITrackerUtil with methods acceptRecord, printRecord, and menuList. Define the class Program with a main method to test the functionality of the utility class.

 */
public class prob3 {
    public static void main(String[] args) {
        BMITracker obj = new BMITracker();
        obj.acceptRecord(65.60, 1.69);
        obj.calculateBMI();
        obj.classifyBMI();
        obj.printRecord();  
    }
}

class BMITracker {
    private double weight;
    private double height;
    private double BMI;
    private String bmiCategory;

    public void acceptRecord(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public void calculateBMI() {
        this.BMI = this.weight / (this.height * this.height);
    }

    public void classifyBMI() {
        if (this.BMI < 18.5) {
            this.bmiCategory = "Underweight";
        } else if (this.BMI >= 18.5 && this.BMI < 24.9) {
            this.bmiCategory = "Normal Weight";
        } else {
            this.bmiCategory = "Overweight";
        }
    }

    public void printRecord() {
        System.out.println("BMI: " + this.BMI);
        System.out.println("BMI Category: " + this.bmiCategory);
    }
}
package CH03;

import java.util.*;

public class ComputeBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your weight by Kilogram : ");
        double weight = input.nextDouble();
        System.out.print("Enter your length by Centimeter : ");
        double length = input.nextDouble() / 100;
        
        double BMI = weight / Math.pow(length, 2);
        
        System.out.printf("Your BMI is %5.2f\n" , BMI);
        if(BMI < 16)System.out.println("You are seriously underweight");
        else if(BMI < 18)System.out.println("You are underweight");
        else if(BMI < 24)System.out.println("You are normal weight");
        else if(BMI < 29)System.out.println("You are overweight");
        else if(BMI < 35)System.out.println("You are seriously overweight");
        else if(BMI > 35)System.out.println("You are overweight");

    }
}

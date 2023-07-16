package CH02;

import java.util.*;

public class EX02_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double inches = input.nextDouble();

        double kilograms = pounds * 0.45359237;
        double meters = inches * 0.0254;
        double BMI = kilograms / (Math.pow(meters, 2));//BMI ==> Body Mass Index 

        System.out.printf("BMI is %6.4f", BMI);
    }
}

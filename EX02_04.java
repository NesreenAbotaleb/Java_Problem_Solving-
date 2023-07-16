package CH02;

import java.util.*;

public class EX02_04 {

    public static void main(String[] args) {
        System.out.print("Enter a number in pounds : ");

        Scanner input = new Scanner(System.in);
        double pound = input.nextDouble();

        double kilograms = pound * 0.454;
        System.out.println(pound + " pounds is " + kilograms + " kilograms");
    }
}

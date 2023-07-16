package CH02;

import java.util.*;

public class EX02_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");

        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = Math.PI * radius * radius;// use printf
        double volume = area * length;

        System.out.printf("The area is %5.4f \nThe volume is %5.1f",
                area, volume);

    }
}

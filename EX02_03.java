package CH02;

import java.util.*;

public class EX02_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");

        double feet = input.nextDouble();
        double meters = 0.305 * feet;

        System.out.println(feet + " Feet is " + meters + " meters");
    }
}

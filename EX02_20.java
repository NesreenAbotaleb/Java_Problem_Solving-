package CH02;

import java.util.*;

public class EX02_20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double x_s = Math.pow((x2 - x1), 2);
        double y_s = Math.pow((y2 - y1), 2);

        System.out.println("The distance of the two points is "
                + (Math.pow((x_s + y_s), 0.5)));
    }
}

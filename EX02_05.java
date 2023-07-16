package CH02;

import java.util.*;

public class EX02_05 {

    public static void main(String[] args) {
        System.out.print("Enter the subtotal and a gratuity rate : ");

        Scanner input = new Scanner(System.in);
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = (gratuityRate / 100) * subtotal;
        double total = gratuity + subtotal;

        System.out.printf("The gratuity is $ %5.2f and total is $ %5.2f",
                 gratuity, total);
    }
}

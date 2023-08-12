package CH03;

import java.util.*;

public class EX03_22 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        
        double radius = Math.pow(((x * x) + (y * y)), 0.5);
        
        if (radius <= 10) 
            System.out.println("point (" + x + " , " + y + ") is in the "
                    + "circle"); 
        else 
            System.out.println("point (" + x + " , " + y + ") is not in the "
                    + "circle");
    }
}

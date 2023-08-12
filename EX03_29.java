package CH03;

import  java.util.*;

public class EX03_29 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Coordiantes of the the center and the "
                + "radius of the first Circle : ");
        double x1 =input.nextDouble();        
        double y1 =input.nextDouble();
        double radius1 =input.nextDouble();
        System.out.print("\nEnter the Coordiantes of the the center and the "
                + "radius of the second Circle : ");
        double x2 =input.nextDouble();        
        double y2 =input.nextDouble();
        double radius2 =input.nextDouble();
        
        double length = Math.pow((Math.pow((x1 - x2), 2) + Math.pow((y1 - y2),
                2)), 0.5);
        if (radius1 < radius2) {
            double temp = radius1;
            radius1 = radius2;
            radius2 = temp;
        }
        if (length <= (radius1 - radius2)) {
            System.out.println("circle2 is not overlaps circle1");
        }else if(length <= (radius1 + radius2)){
            System.out.println("circle2 overlaps circle1");
        }

        
    }
}

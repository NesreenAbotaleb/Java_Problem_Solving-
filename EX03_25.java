package CH03;

import java.util.*;

public class EX03_25 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the edges of the triangle : ");
        double a = input.nextDouble();        
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        if (!(a + b >= c)) 
            System.out.println("the input is invalid!");
        else{
            System.out.println("the perimeter is : " + (a + b + c));
        }
    }
}

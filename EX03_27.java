package CH03;

import java.util.*;

public class EX03_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point’s x- and y-coordinates : ");
        double x = input.nextDouble();        
        double y = input.nextDouble();
        System.out.print("Enter the three point's coordinates :");
        double xa = input.nextDouble();
        double ya = input.nextDouble();
        double xb = input.nextDouble();
        double yb = input.nextDouble();
        double xc = input.nextDouble();
        double yc = input.nextDouble();
        
        double ABC = Math.abs((xa * (yb - yc) + xb * (yc  - ya)+ xc * (ya - yb))) 
                / 2.0;
        double ABP = Math.abs((xa * (yb - y) + xb * (y - ya) + x * (ya - yb))) 
                / 2.0;
        double PBC = Math.abs((x * (yb - yc) + xb * (y - ya) + x * (yb - ya))) 
                / 2.0;
        double APC = Math.abs((xa * (y - yc) + x * (yc - ya) + xc * (ya - y))) 
                / 2.0;
        
//        if(ABC < 0) ABC *= -1;
//        if(ABP < 0) ABC *= -1;
//        if(PAC < 0) ABC *= -1;
//        if(PBC < 0) ABC *= -1;

        
        
        if ((ABP + PBC + APC) == ABC)
            System.out.println("The point is in the triangle");
        else
            System.out.println("The point is not in the triangle");
    }
}

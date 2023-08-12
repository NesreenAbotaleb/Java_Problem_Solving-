package CH03;

import java.util.*;

public class EX03_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        
        System.out.println("IS " + num + " divisible by 5 and 6 ? "
                + ((num % 5 == 0) && (num % 6 == 0)));
        System.out.println("IS " + num + " divisible by 5 or 6 ? "
                + ((num % 5 == 0) || (num % 6 == 0)));
        System.out.println("IS " + num + " divisible by 5 or 6, but not both ? "
                + ((num % 5 == 0) ^ (num % 6 == 0)));
        
    }
}

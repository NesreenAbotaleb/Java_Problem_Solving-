package CH02;

import java.util.*;

public class EX02_06 {
    public static void main(String[] args) {
        System.out.print("Enter a number between 0 and 1000 : ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
//        while (num != 0) {
//            sum += (num % 10);
//            num = num / 10;
//        }

        sum += (num % 10);
        sum += (num % 10);
        sum += (num % 10);
        
        System.out.println("The sum of the digits is " + sum);
    }
}

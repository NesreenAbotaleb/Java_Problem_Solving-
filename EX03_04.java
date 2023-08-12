package CH03;

import java.util.*;

public class EX03_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        
        
        System.out.print("What is " + num1 + " + " + num2 + " = ");
        int answer = input.nextInt();
        if (answer == (num1 + num2))System.out.println("You are correct!");
        else System.out.println("you are wrong the anwer should be " +
                (num1 + num2));
    }
}

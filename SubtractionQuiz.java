package CH03;
import java.util.*;
public class SubtractionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        
        if (num1 < num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        }
        
        System.out.print("What is\n" + num1 + " - " + num2 + " = ");
        int answer = input.nextInt();
        
        if (answer == (num1 - num2))System.out.println("You are correct!");
        else System.out.println("You are wrong \nthe answer should be " 
                + (num1 - num2));
    }
}

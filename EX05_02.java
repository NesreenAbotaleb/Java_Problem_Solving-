package CH05;

import  java.util.*;

public class EX05_02 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        long num = input.nextLong();
        System.out.println("The sum of digits for " + num +" is " + sumDigits
        (num));
    }
    
    public static int sumDigits(long num){
        int sum = 0;
        while(num != 0){
          sum += (num % 10);
          num /= 10;
        }
        return sum;
    }
}

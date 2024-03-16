package CH06;

import java.util.*;

public class EX06_12 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double num [] = new double[10];
        System.out.print("Enter ten numbers : ");
        for (int i = 0; i < 10; i++) {
            num[i] = input.nextDouble();
        }
        num = reverse(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num [i] + " ");
            
        }
    }
    public static double [] reverse(double [] num){
        double rev [] = new double [num.length];
        for (int i = 0 , j = num.length - 1; i < num.length; i++ , j--) {
            rev[i] = num[j];
        }
        return rev;
    }
}

package CH06;

import java.util.*;

public class EX06_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num [] = new double[10];
        System.out.print("Enter ten numbers : ");
        for (int i = 0; i < 10; i++) {
            num[i] = input.nextDouble();
        }
        System.out.printf("The mean is %1.2f \nThe stander deviation is "
                + "%1.5f\n" , mean(num) , deviation(num));
        
    }
    public static double mean(double[] x){
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return (sum / x.length);
    }
    public static double deviation(double[] x){
        double sum = 0;
        double mean = mean(x);
        for (int i = 0; i < x.length; i++) {
            sum += Math.pow((x[i] - mean), 2);
        }
        return (Math.pow((sum / (x.length - 1)), 0.5));
    }
}

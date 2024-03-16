package CH06;

import java.util.*;

public class EX06_08 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers : ");
        double num []  = new double [10];
        for (int i = 0; i < 10; i++) {
            num[i] = input.nextDouble();
        }
        System.out.println(average(num));
    }
    public static int average(int...nums){
        int max = 0;
        int min = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        return (int)((min + max) / 2);
    }
    public static double  average(double ...nums){
        double  max = 0;
        double  min = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        return ((min + max) / 2);
    }
}

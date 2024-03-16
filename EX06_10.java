package CH06;

import java.util.*;

public class EX06_10 {
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers : ");
        double num []  = new double [10];
        for (int i = 0; i < 10; i++) {
            num[i] = input.nextDouble();
        }
        System.out.println("The smallest number's index is " + 
                indexOfSmallestElement(num));
    }
     public static int indexOfSmallestElement(double ...nums){
        double  min = nums[0];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
                index = i;
            }
        }
        return index;
    
    }
}

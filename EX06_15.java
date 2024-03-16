package CH06;

import java.util.*;

public class EX06_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num [] = new int[10];
        System.out.print("Enter ten numbers : ");
        for (int i = 0; i < 10; i++) {
            num[i] = input.nextInt();
        }
        num = eliminateDuplicates(num);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < num.length; i++) {
            if(num[i] == 0 && num[i+1] == 0)break;
            System.out.print(num[i] + " ");
        }
    }
    public static int[] eliminateDuplicates(int[] nums){
        int[] x = new int [nums.length];
        boolean notexist;
        for (int i = 0 , k = 0; i < nums.length; i++) {
            notexist = true;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == x[j]) {
                    notexist = false;
                    break;
                }
                
            }
            if (notexist) {
                x[k] = nums[i];
                k++;
            }
        }
        return x;
    }
}

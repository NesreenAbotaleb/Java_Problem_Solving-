package CH06;

import java.util.*;

public class EX06_14 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number of integers : ");
        int num = input.nextInt();
        int [] nums = new int[num];
        System.out.print("Enter the integers : ");
        for (int i = 0; i < num; i++) {
            nums[i] = input.nextInt();
        }
        
        System.out.println( "The gcd is "+ gcd(nums));
        
    }
    public static int gcd(int... nums){
        int gcd = 1;
        for (int i = 0; i < nums.length; i++) {
            gcd = gcd(nums[i] , nums[i + 1]);
        
            for(int a : nums){
                if (a % gcd != 0) {
                    break;
                }else 
                    return gcd;
            }

        }
        return gcd;
    }
    public static int gcd(int e1 , int e2){
        int gcd = 1;
        for (int i = 2; i <= e1  && i <= e2 ; i++) {
            if (e1 % i == 0 && e2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}

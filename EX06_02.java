package CH06;

import java.util.*;

public class EX06_02 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers :");
        int nums [] = new int [10];
        for (int i = 0; i < 10; i++) {
            nums[i] = input.nextInt();
        }
        nums = reverse(nums);
        print(nums);
    }
    public static int[] reverse(int ... nums){
        int temp ;
        for (int i = 0 , j = nums.length - 1; i < nums.length /2 ; i++ , j--) {
            temp = nums[i];
            nums [i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }
    public static void print(int...nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
            if(i % 9 == 0 && i != 0)System.out.println("");
        }
    }
}

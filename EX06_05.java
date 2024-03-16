package CH06;

import java.util.Scanner;

public class EX06_05 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int [] nums = new int [10]; 
        for (int i = 0; i < 10; i++) {
            nums [i] = input.nextInt();
        }
        int [] distinct = new int[10];
        boolean d;
        for (int i = 0 , k =0; i < 10 && k < 10; i++) {
            d = true;
            for (int j = 0; j < 10; j++) {
                if(distinct[j] == nums[i]){
                   d = false;
                   break;
                }
                
            }
            if (d) {
                distinct[k] = nums[i];
                k++;
            }
        }
        
        print(distinct);    
        
    }
    public static void print(int[] arr){
        System.out.print("The distinct numbers are : ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0 && arr[i+1]== 0)break;
            System.out.print(arr[i] + " ");
        }
    } 
}

    


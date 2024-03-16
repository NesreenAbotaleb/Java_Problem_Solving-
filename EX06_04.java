package CH06;

import java.util.*;

public class EX06_04 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] score = new int [10] ;
        int below = 0;
        int above = 0;
        //int count = 0;
        int temp ;
        System.out.print("Enter the scores if you finsh enter negative num "
                + "(the max of scores is 10): ");

        for (int i = 0; i < 10 && score[i] >= 0; i++) {
            temp = input.nextInt();
            if (temp < 0) {
                i--;
                break;
            }else{
                score[i] = temp;
                
            }
                
        }
        double  average = average(score);
        for (int i = 0; i < score.length; i++) {
            if (score[i] >= average) {
                above++;
            }
            if (score[i] < average) {
                below++;
            }
        }
        System.out.println("the number of scores that are above the average is "
                            + above + " the number of scores below is " + below);
    }
        
        public static double  average(int...score){
        int max = 0;
        int min = score[0];
       // System.out.println(min);
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
        }
       // System.out.println(min);
        return ((max + min) / 2);
        
    }
}
    
    

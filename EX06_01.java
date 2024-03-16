package CH06;

import java.util.*;

public class EX06_01 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students : ");
        int num = input.nextInt();
        
        int [] grads = new int[num];
        System.out.print("Enter " + num + " scores : ");
        for (int i = 0; i < num; i++) {
            grads[i] = input.nextInt();
        }
       int best = max(grads);
        for (int i = 0; i < num; i++) {
            if (grads[i] >= best - 10) {
                System.out.println("Student "+ i + " score is " + grads[i] +
                        " Grad is A");
            }else if (grads[i] >= best - 20) {
                System.out.println("Student "+ i + " score is " + grads[i] +
                        " Grad is B");
            }else if (grads[i] >= best - 30) {
                System.out.println("Student "+ i + " score is " + grads[i] +
                        " Grad is C");
            }else
                System.out.println("Student "+ i + " score is " + grads[i] +
                        " Grad is F");
        }
        
    }
    public static int max(int [] grads){
        int best = 0;
        for (int i = 0; i < grads.length; i++) {
            if (best < grads[i]) {
                best = grads[i];
            }   
        }
        return best;
    }
}

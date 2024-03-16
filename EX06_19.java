package CH06;

import java.util.*;

public class EX06_19 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double scores [] = new double[10];
        String names []  = new String [10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the name & the score : ");
            names[i] = input.next();
            scores[i] = input.nextDouble();
        }
        sort(names, scores);
    }
    public static void sort(String [] names , double [] scores){       
        double  temp;
        String s;
            for (int j = 0; j < 9; j++) {
                if (scores[j] < scores[j + 1]) {
                    temp = scores[j];
                    s = names[j];
                    scores[j] = scores[j + 1];
                    names[j] = names[j + 1];
                    scores[j + 1] = temp;
                    names[j + 1] = s;
                }
            }
        System.out.printf("%10s %10s\n" , "Name" , "Score");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%10s %10f\n" , names[i] , scores[i]);
        }
    }
}

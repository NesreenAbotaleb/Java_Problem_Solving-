package CH06;

import java.util.*;

public class EX06_17 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num [] = new double[10];
        System.out.print("Enter ten numbers : ");
        for (int i = 0; i < 10; i++) {
            num[i] = input.nextDouble();
        }
        num = selectionSort(num);
        for (int i = 0; i < 10; i++) {
            System.out.print(num[i] + " ");
        }
    }
    public static double [] selectionSort(double [] num){
        for (int i = 0; i < num.length; i++) {
            double max = num[i];
            int index = i;
            for (int j = i + 1; j < num.length; j++) {
                if(max < num [j]){
                    max = num[j];
                    index = j;
                }
            }
            if(index != i){
                num[index] = num[i];
                num[i] = max;
            }
        }
        return num;
    }
}

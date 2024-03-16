package CH07;

import java.util.*;

public class EX07_06 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [][] m1 = new double [3][3];
        System.out.print("Enter matrix1 : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = input.nextDouble();
            }
        }
        double [][] m2 = new double [3][3];
        System.out.print("Enter matrix2 : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = input.nextDouble();
            }
        }
        double[][] answer = multiplyMatrix (m1 , m2);
        System.out.println("The matrices are multiplied as follows:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m1[i][j] + "\t");
            }
            if(i == 1)System.out.print("*\t");
            else System.out.print("\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(m2[i][j] + "\t");
            }
            if(i == 1)System.out.print("=\t");
            else System.out.print("\t");

            for (int j = 0; j < 3; j++) {
                System.out.printf("%5.1f\t",answer[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        double [][] answer = new double [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    answer[i][j] += a[i][k] * b [k][j];
                }
                
            }
            
        }
        return answer;
    }
}

package CH05;

import java.util.*;

public class EX05_12 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The first character : ");
        String c1 = (input.next());
        char ch1 = c1.charAt(0);
        System.out.print("The second character : ");
        String c2 = input.next();
        char ch2 = c2.charAt(0);
        System.out.print("Enter number of characters per line : ");
        int num = input.nextInt();
        printChars(ch1 , ch2 , num);
    }
    
    public static void printChars(char c1 , char c2 , int num){
        int x = 1;
        
        for (char i = c1 ; i <= c2; i++) {
           
            if(x < num){
                System.out.print(i + "\t");
            }else{
                System.out.print(i + "\n");
                x = 0;
            }
            x++;
        }
    }
}

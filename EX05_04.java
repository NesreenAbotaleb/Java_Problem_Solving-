package CH05;

import java.util.*;

public class EX05_04 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        System.out.println("The reverse of " + num + " is " + reverse(num));
    }
    public static int reverse(int num){
        String s = "" + num;
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            s2 += num % 10;
            num /= 10;
        }
        return (Integer.parseInt(s2));
    }
}

package CH05;

import java.util.*;

public class EX05_03 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        if(isPalindrome(num))
            System.out.println("The integer is a palindrome");
        else
            System.out.println("The integer is not a palindrome");
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
    public static boolean isPalindrome(int num){
        int rev = reverse(num);
        return (rev == num);
    }
}

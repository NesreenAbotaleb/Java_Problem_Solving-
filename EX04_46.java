package CH04;

import java.util.*;

public class EX04_46 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer : ");
        short num = input.nextShort();
        String bits = "";
        for (int i = 0; i < 16; i++) {
            bits = (num & 1) + bits;
            num >>= 1;
  //          System.out.println(num);
       }
//        while (num != 0) {
//            bits = num % 2 + bits
//            num /= 2;
//        }
//        while (bits.length() != 16) {
//            bits = 0 + bits;
//        }
        System.out.println("The bits are " + bits);
       // System.out.println(num & 1);
    }
}

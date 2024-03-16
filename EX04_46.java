package CH04;

import java.util.*;

public class EX04_46 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String newBits = "";
        System.out.print("Enter an integer : ");
        short num = input.nextShort();
        String bits = "";
        //positive int
        if(num >= 0){
            while (num != 0) {
                bits = num % 2 + bits;
                num /= 2;
            }
            //add zeros to the binary number
            while (bits.length() != 16) {
                bits = '0' + bits;
            }
        //negative int
        } else {
            //turn it into positive 
            num = (short) (num * (-1));
            while (num != 0) {
                newBits = num % 2 + newBits;
                num /= 2;
            }
            while (newBits.length() != 16) {
                newBits = '0' + newBits;
            }
            //replacing all zeros with one and ones with zeros
            for (int i = 0; i < 16; i++) {
                if (newBits.charAt(i) == '1') {
                    bits = bits + '0'; 
                } else {
                    bits = bits + '1';   
                }
            }
            char[] bitArray = bits.toCharArray();
            for (int i = bitArray.length - 1; i >= 0; i--) {
                if (bitArray[i] == '0') {
                    bitArray[i] = '1';
                    break; // No need to continue, we've added 1
                } else {
                    bitArray[i] = '0';
                }
            }
            bits = String.valueOf(bitArray);
        }
        
        System.out.println("The bits are " + bits);

    }
}

         
//Another solution       
//        for (int i = 0; i < 16; i++) {
//            bits = (num & 1) + bits;
//            num >>= 1;
//  //          System.out.println(num);
//       }
////        
       
       // System.out.println(num & 1);
    


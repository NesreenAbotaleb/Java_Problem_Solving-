package CH02;

import java.util.*;

public class EX02_08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");

        int ASCIICode = input.nextInt();
        char c = (char) ASCIICode;

        System.out.println("The character for ASCII code " + ASCIICode + " is "
                + c);
    }
}

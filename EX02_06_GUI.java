package CH02;

import javax.swing.*;

public class EX02_06_GUI {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null,
                "Enter a number between 0 and 1000" );
        int num = Integer.parseInt(s);
        int sum = 0;
        while (num != 0) {
            sum += (num % 10);
            num = num / 10;
        }
        JOptionPane.showMessageDialog(null,  "The sum of digits is " 
                + sum);
    }
}

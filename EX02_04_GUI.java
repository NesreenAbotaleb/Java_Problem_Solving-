package CH02;

import javax.swing.*;

public class EX02_04_GUI {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null,
                "Enter a number in pounds " );
        
        double pound = Double.parseDouble(s);
        double kilograms = pound * 0.454;
        
        JOptionPane.showMessageDialog(null,  pound + " pound is " 
                         + kilograms +" kilograms");


    }
}

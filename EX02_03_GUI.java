package CH02;

import javax.swing.*;

public class EX02_03_GUI {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null,
                "Enter a value for feet" );
        
        double feet = Double.parseDouble(s);
        double meters = 0.305 * feet ;
        
        JOptionPane.showMessageDialog(null,  feet + " feet is " 
                         + meters +" meters");
    }
}

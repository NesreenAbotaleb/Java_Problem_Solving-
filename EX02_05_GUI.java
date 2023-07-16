package CH02;

import javax.swing.*;

public class EX02_05_GUI {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null,
                "Enter the subtotal " );
        String s2 = JOptionPane.showInputDialog(null,
                "Enter the gratuity rate" );
        
        double subtotal = Double.parseDouble( s1);
        double gratuityRate = Double.parseDouble( s2);
        
        double gratuity = (gratuityRate / 100) * subtotal;
        double total = gratuity + subtotal;
        
        JOptionPane.showMessageDialog(null,  " The sgratuity is " 
                       + gratuity + " and The total is " + total);
    }
}

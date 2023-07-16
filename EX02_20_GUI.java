package CH02;

import javax.swing.*;

public class EX02_20_GUI {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null, 
                "Enter x1");      
        String s2 = JOptionPane.showInputDialog(null, 
                "Enter y1");
        String s3 = JOptionPane.showInputDialog(null, 
                "Enter x2");
        String s4 = JOptionPane.showInputDialog(null,
                "Enter y2");
        
        double x1 = Double.parseDouble( s1);       
        double y1 = Double.parseDouble( s2);
        double x2 = Double.parseDouble( s3);
        double y2 = Double.parseDouble( s4);
        
        double x_s = Math.pow((x2 - x1), 2);
        double y_s = Math.pow((y2 - y1), 2);
        
        JOptionPane.showMessageDialog(null, "The distance of"
                + " the two points is " + (Math.pow((x_s + y_s), 0.5)));
    }
}

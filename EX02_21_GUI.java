package CH02;

import javax.swing.*;

public class EX02_21_GUI {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null, 
                "Enter x1");      
        String s2 = JOptionPane.showInputDialog(null, 
                "Enter y1");
        String s3 = JOptionPane.showInputDialog(null, 
                "Enter x2");
        String s4 = JOptionPane.showInputDialog(null,
                "Enter y2");
        String s5 = JOptionPane.showInputDialog(null,
                "Enter x3");
        String s6 = JOptionPane.showInputDialog(null,
                "Enter y3");
        
        double x1 = Double.parseDouble( s1);       
        double y1 = Double.parseDouble( s2);
        double x2 = Double.parseDouble( s3);
        double y2 = Double.parseDouble( s4);
        double x3 = Double.parseDouble( s5);
        double y3 = Double.parseDouble( s6);
        
        double side1 = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1),
                2)), 0.5);
        double side2 = Math.pow((Math.pow((x3 - x1), 2) + Math.pow((y3 - y1),
                2)),0.5);
        double side3 = Math.pow((Math.pow((x3 - x2), 2) + Math.pow((y3 - y2),
                2)),0.5);
        
        double s = (side1 + side2 + side3) / 2;
        
        double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)),
                0.5);
        
        JOptionPane.showMessageDialog(null,"The area of the triangle is " + area);
    }
}

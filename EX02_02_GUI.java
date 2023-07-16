package CH02;

import javax.swing.*;

public class EX02_02_GUI {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null,
                "Enter the radius of a cylinder" );
        String s2 = JOptionPane.showInputDialog(null,
                "Enter the length of a cylinder" );
        
        double radius = Double.parseDouble( s1);
        double length = Double.parseDouble( s2);
        
        double area = Math.PI * radius * radius;
        double volume = area * length;

        JOptionPane.showMessageDialog(null,  " The area is " 
                       + area + "\n The volume is " + volume);

    }
}

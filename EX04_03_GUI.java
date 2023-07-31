package CH04;

import javax.swing.*;

public class EX04_03_GUI {
    
    public static void main(String[] args) {
        String s1;
        String s = String.format("%-12s %-5s", "Kilograms", 
                 "Pounds");
        JOptionPane.showMessageDialog(null, s, 
                "Kilograms to Pounds", 
                JOptionPane.INFORMATION_MESSAGE);
        
        for (int i = 1; i < 200; i += 2) {
           s1 = String.format("%-12d %-5.1f", i, (i * 2.2));
           JOptionPane.showMessageDialog(null, s1,
                "Kilograms to Pounds", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}

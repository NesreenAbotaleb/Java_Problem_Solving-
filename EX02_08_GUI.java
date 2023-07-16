package CH02;

import javax.swing.*;

public class EX02_08_GUI {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null, "Enter"
                + " an ASCII code");
        
        int ASCIICode = Integer.parseInt(s);
        char c = (char)ASCIICode ;
        
        JOptionPane.showMessageDialog(null, "The character for "
                + "ASCII code " + ASCIICode + " is " 
                + c);
        
    }
}

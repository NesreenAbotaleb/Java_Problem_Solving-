package CH04;

import javax.swing.*;

public class EX04_46_GUI {
    
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null,
                "Enter an integer : ", "bit-level operations", 
                -1);
        short num = Short.parseShort(s);
         String bits = "";
        for (int i = 0; i < 16; i++) {
            bits = (num & 1) + bits;
            num >>= 1;
        }
        JOptionPane.showMessageDialog(null, "The bits are " + bits,
                "bit-level operations", -1);
    }
}

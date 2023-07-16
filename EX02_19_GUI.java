package CH02;

import javax.swing.*;

public class EX02_19_GUI {
    public static void main(String[] args) {
        Long currentTime = System.currentTimeMillis();
        char c = (char)((currentTime % 26) + 65);
        
        JOptionPane.showMessageDialog(null, c);
    }
}

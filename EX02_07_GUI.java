package CH02;

import javax.swing.*;

public class EX02_07_GUI {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null,
                "Enter the number of minutes" );
        
        Long minite = Long.parseLong(s);
        long year = minite / (365 * 60 * 24);
        long day = (minite % (365 * 60 * 24) ) / (24 * 60);
        
        JOptionPane.showMessageDialog(null, minite + " minutes is"
                + " approminiteimately " + year + " years and " + day + "days");
        
    }
}

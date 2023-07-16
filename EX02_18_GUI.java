package CH02;

import javax.swing.*;

public class EX02_18_GUI {

    public static void main(String[] args) {

        int a1 = 1;
        int a2 = 2;
        int a3 = 3;
        int a4 = 4;
        int a5 = 5;

        int b1 = a1 + 1;
        int b2 = a2 + 1;
        int b3 = a3 + 1;
        int b4 = a4 + 1;
        int b5 = a5 + 1;

        JOptionPane.showMessageDialog(null, "a     b     pow(a,b)"
                + "\n" + a1 + "     " + b1 + "     "
                + Math.pow(a1, b1) + "\n" + a2 + "     " + b2 + "     "
                + Math.pow(a2, b2) + "\n" + a3 + "     " + b3 + "     "
                + Math.pow(a3, b3) + "\n" + a4 + "     " + b4 + "     "
                + Math.pow(a4, b4) + "\n" + a5 + "     " + b5 + "     "
                + Math.pow(a5, b5));

    }
}

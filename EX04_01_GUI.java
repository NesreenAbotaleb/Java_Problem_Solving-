package CH04;

import javax.swing.*;

public class EX04_01_GUI {

    public static void main(String[] args) {
        String s;
        int x = 0;
        int positive = 0;
        int negative = 0;
        int total = 0;
        int sum = 0;

        do {
             s = JOptionPane.showInputDialog(null, "Enter an int "
                    + "value, the program exits if the input is 0:",
                     "Positive and negative",
                    JOptionPane.DEFAULT_OPTION);
            x = Integer.parseInt(s);
            if (x == 0) {
                continue;
            }
            if (x > 0) {
                positive++;
              

            } else if (x < 0) {
                negative++;
                

            }
            total++;
            sum += x;
           
        } while (x != 0);

        JOptionPane.showMessageDialog(null, "The number of positives"
                + " is " + positive + "\nThe number of negatives is " + negative
                + "\nThe total is " + total + "\nThe average is " + ((double) sum
                / total), "Positive and negative",
                JOptionPane.INFORMATION_MESSAGE);
    }
}

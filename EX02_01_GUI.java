package CH02;
import javax.swing.*;
public class EX02_01_GUI {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null,
                "Enter a degree in Celsius" );
        double celsius = Double.parseDouble(s);
        double fahrenheit = (9.0 / 5) * celsius + 32;
        
        JOptionPane.showMessageDialog(null, fahrenheit + 
                " Fahrenheit");
        
    }
}

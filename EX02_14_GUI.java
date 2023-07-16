package CH02;

import javax.swing.*;

public class EX02_14_GUI {
    public static void main(String[] args) {
        String S_pounds = JOptionPane.showInputDialog(null, 
                "Enter weight in pounds");
        String S_inches = JOptionPane.showInputDialog(null, 
                "Enter height in inches");
        
        double pounds = Double.parseDouble(S_pounds);
        double inches = Double.parseDouble(S_inches);
        double kilograms = pounds * 0.45359237 ;
        double meters = inches * 0.0254;
        double BMI = kilograms / (Math.pow(meters, 2));//BMI ==> Body Mass Index 
        
        
        JOptionPane.showMessageDialog(null, "BMI is " + BMI);
        
    }
}

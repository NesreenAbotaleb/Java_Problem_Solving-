package CH02;

import javax.swing.*;

public class EX02_11_GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, 
                "Enter employee's name");
        String S_hour = JOptionPane.showInputDialog(null, 
                "Enter number of hours worked in a week");
        int hourPerWeek = Integer.parseInt(S_hour);
        String S_PayHour = JOptionPane.showInputDialog(null, 
                "Enter hourly pay rate");
        double PayRate = Double.parseDouble(S_PayHour);
        String S_FederalTaxPrecent = JOptionPane.showInputDialog(null, 
                "Enter Federal tax withholding rate");
        double FederalTaxPrecent  = Double.parseDouble(S_FederalTaxPrecent);
        String S_StateTaxPrecent = JOptionPane.showInputDialog(null, 
                "Enter State tax withholding rate");
        double StateTaxPrecent  = Double.parseDouble(S_StateTaxPrecent);
        
        double GrossRate = hourPerWeek * PayRate;
        double FederalTax = GrossRate * FederalTaxPrecent;
        double StateTax = GrossRate * StateTaxPrecent;

        JOptionPane.showMessageDialog(null, "Employee Name: " + name + "\nHours Worked: "
                + hourPerWeek + "\nPay Rate: " + PayRate + "\nGross Pay: "
                + GrossRate + "\nDeductions: \n Federal Withholding("
                + FederalTaxPrecent + ") :" + FederalTax + "\n State Withholding("
                + StateTaxPrecent + ") :" + StateTax + "\n Total Deductions: "
                + (FederalTax + StateTax) + "\nNet pay : " + (GrossRate
                - (FederalTax + StateTax)));
    }
}

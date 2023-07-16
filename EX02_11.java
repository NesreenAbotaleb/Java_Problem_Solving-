package CH02;

import java.util.*;

public class EX02_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        int hourPerWeek = input.nextInt();
        System.out.print("Enter hourly pay rate: ");
        double PayRate = input.nextDouble();
        System.out.print("Enter Federal tax withholding rate: ");
        double FederalTaxPrecent = input.nextDouble();
        System.out.print("Enter State tax withholding rate: ");
        double StateTaxPrecent = input.nextDouble();

        double GrossRate = hourPerWeek * PayRate;
        double FederalTax = GrossRate * FederalTaxPrecent;
        double StateTax = GrossRate * StateTaxPrecent;

        System.out.println("Employee Name: " + name + "\nHours Worked: "
                + hourPerWeek + "\nPay Rate: $" + PayRate + "\nGross Pay: $"
                + GrossRate + "\nDeductions: \n Federal Withholding("
                + FederalTaxPrecent * 100 + "%) : $" + FederalTax + "\n State Withholding("
                + StateTaxPrecent * 100 + "%) : $" + StateTax + "\n Total Deductions: $"
                + (FederalTax + StateTax) + "\nNet pay : $" + (GrossRate
                - (FederalTax + StateTax)));

    }
}

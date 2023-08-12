package CH03;

import javax.swing.*;

public class SubtractionQuiz_GUI {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        
        if (num1 < num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        }
        
        String Sanswer = JOptionPane.showInputDialog(null ,"What is"
                + "\n" + num1 + " - " + num2 + " = " );
        
        int answer = Integer.parseInt(Sanswer);
        if (answer == (num1 - num2))JOptionPane.showMessageDialog(
                null, "You are correct!");
        else JOptionPane.showMessageDialog(null, 
                "You are wrong \nthe answer should be " + (num1 - num2));
    }
}

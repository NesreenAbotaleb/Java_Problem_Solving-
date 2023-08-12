package CH03;

import javax.swing.*;

public class GussingBirthDay_GUI {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int day  = 0;
        int month = 0;
        String set1 = "1 3 5 7 \n"
                    + "9 11 13 15 \n"
                    + "17 19 21 23\n"
                    + "25 27 29 31"; 
        
        String set2 = "2 3 6 7 \n" 
                    + "10 11 14 15 \n" 
                    + "18 19 22 23 \n" 
                    + "26 27 30 31";
        
        String set3 = "4 5 6 7 \n"
                    + "12 13 14 15 \n"
                    + "20 21 22 23 \n"
                    + "28 29 30 31";
        
        String set4 = "8 9 10 11\n" 
                    + "12 13 14 15\n" 
                    + "24 25 26 27\n" 
                    + "28 29 30 31";
        
        String set5 = "16 17 18 19\n" 
                    + "20 21 22 23\n" 
                    + "24 25 26 27\n" 
                    + "28 29 30 31";
        

        int answer = JOptionPane.showConfirmDialog(null, "Is your "
                + "birthday in Set1?\n" + set1 );
        if (answer == JOptionPane.YES_OPTION)day += 1;
        
        answer = JOptionPane.showConfirmDialog(null, "Is your "
                + "birthday in Set2?\n" + set2 );
        if (answer == JOptionPane.YES_OPTION)day += 2;
        
        
        answer = JOptionPane.showConfirmDialog(null, "Is your "
                + "birthday in Set3?\n" + set3);
        if (answer == JOptionPane.YES_OPTION)day += 4;
        
        answer = JOptionPane.showConfirmDialog(null, "Is your "
                + "birthday in Set4?\n" + set4);
        if (answer == JOptionPane.YES_OPTION)day += 8;
        
        answer = JOptionPane.showConfirmDialog(null, "Is your "
                + "birthday in Set5?\n" + set5);
        if (answer == JOptionPane.YES_OPTION)day += 16;
        
        String setM1 ="1 3 5 7 9 11";
        String setM2 ="2 3 6 7 10 11";
        String setM3 ="4 5 6 7 12"; 
        String setM4 ="8 9 10 11 12 ";
        
        answer = JOptionPane.showConfirmDialog(null, "Is your "
                + "birthday's month in Set1?\n" + setM1);
        if (answer == JOptionPane.YES_OPTION)month += 1;
        
        
        answer = JOptionPane.showConfirmDialog(null, "Is your "
                + "birthday's month in Set2?\n" + setM2);
        if (answer == JOptionPane.YES_OPTION)month += 2;
        
        
        answer = JOptionPane.showConfirmDialog(null, "Is your "
                + "birthday's month in Set3?\n" + setM3);
        if (answer == JOptionPane.YES_OPTION)month += 4;
        
        
        answer = JOptionPane.showConfirmDialog(null, "Is your "
                + "birthday's month in Set4?\n" + setM4);
        if (answer == JOptionPane.YES_OPTION)month += 8;
        
        
        switch(month){
            case 1 -> JOptionPane.showMessageDialog(null, 
                    "\nYour birthday is " + day + " January");
            
            case 2 -> JOptionPane.showMessageDialog(null, 
                    "\nYour birthday is " + day +" February");
            
            case 3 -> JOptionPane.showMessageDialog(null, 
                    "\nYour birthday is " + day + " March");
            
            case 4 -> JOptionPane.showMessageDialog(null, 
                    "\nYour birthday is " + day + " April");
            
            case 5 -> JOptionPane.showMessageDialog(null, 
                    "\nYour birthday is " + day + " May");
            
            case 6 -> JOptionPane.showMessageDialog(null, 
                    "\nYour birthday is " + day + " June");
            
            case 7 -> JOptionPane.showMessageDialog(null, 
                    "\nYour birthday is " + day + " Jule");
            
            case 8 -> JOptionPane.showMessageDialog(null,
                        "\nYour birthday is " + day + " August");
            
            case 9 -> JOptionPane.showMessageDialog(null, 
                    "\nYour birthday is " + day + " September");
            
            case 10 -> JOptionPane.showMessageDialog(null, 
                    "\nYour birthday is " + day + " October");
            
            case 11 -> JOptionPane.showMessageDialog(null, 
                    "\nYour birthday is " + day + " November");
            
            case 12 -> JOptionPane.showMessageDialog(null, 
                    "\nYour birthday is " + day + " December");
        }
    }   
}

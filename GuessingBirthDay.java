package CH03;

import java.util.*;

public class GuessingBirthDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day  = 0;
        
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
        
        System.out.print("Is your birthday in Set1?\n" + set1 + "\nEnter 0 for"
                + " No and 1 for Yes: ");
        int answer = input.nextInt();
        
        if(answer == 1)day += answer;
        
        System.out.print("Is your birthday in Set2?\n" + set2 + "\nEnter 0 for"
                + " No and 1 for Yes: ");
        answer = input.nextInt();
        if(answer == 1)day += answer * 2;
        
        System.out.print("Is your birthday in Set3?\n" + set3 + "\nEnter 0 for"
                + " No and 1 for Yes: ");
        answer = input.nextInt();
        if(answer == 1)day += answer * Math.pow(2, 2);
        
        System.out.print("Is your birthday in Set4?\n" + set4 + "\nEnter 0 for"
                + " No and 1 for Yes: ");
        answer = input.nextInt();
        if(answer == 1)day += answer * Math.pow(2, 3);
        
        System.out.print("Is your birthday in Set5?\n" + set5 + "\nEnter 0 for"
                + " No and 1 for Yes: ");
        answer = input.nextInt();
        if(answer == 1)day += answer * Math.pow(2, 4);
        
       // System.out.print("\nYour birthday is " + day + "!");
        
        String setM1 ="1 3 5 7 9 11";
        String setM2 ="2 3 6 7 10 11";
        String setM3 ="4 5 6 7 12"; 
        String setM4 ="8 9 10 11 12 ";
        
        int mounth = 0;
        
        System.out.print("Is your birthday mounth in Set1?\n" + setM1  
                            + "\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if(answer == 1)mounth += answer;
        
        System.out.print("Is your birthday mounth in Set2?\n" + setM2  
                            + "\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if(answer == 1)mounth += answer * 2;
        
        System.out.print("Is your birthday mounth in Set3?\n" + setM3  
                            + "\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if(answer == 1)mounth += answer * Math.pow(2, 2);
        
        System.out.print("Is your birthday mounth in Set4?\n" + setM4  
                            + "\nEnter 0 for No and 1 for Yes: ");
        answer = input.nextInt();
        if(answer == 1)mounth += answer * Math.pow(2, 3);
        
        switch(mounth){
            case 1 : System.out.print("\nYour birthday is " + day + " January");
                break;
            case 2 : System.out.print("\nYour birthday is " + day + " February");
                break;
            case 3 : System.out.print("\nYour birthday is " + day + " March");
                break;
            case 4 : System.out.print("\nYour birthday is " + day + " April");
                break;
            case 5 : System.out.print("\nYour birthday is " + day + " May");
                break;
            case 6 : System.out.print("\nYour birthday is " + day + " June");
                break;
            case 7 : System.out.print("\nYour birthday is " + day + " Jule");
                break;
            case 8 : System.out.print("\nYour birthday is " + day + " August");
                break;
            case 9 : System.out.print("\nYour birthday is " + day + " September");
                break;
            case 10 : System.out.print("\nYour birthday is " + day + " October");
                break;
            case 11 : System.out.print("\nYour birthday is " + day + " November");
                break;
            case 12 : System.out.print("\nYour birthday is " + day + " December");

        }
    }
}

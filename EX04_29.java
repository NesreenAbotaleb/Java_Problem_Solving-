package CH04;

import java.util.*;

public class EX04_29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = input.nextInt();
        System.out.print("Enter the day : ");
        int firstDay = input.nextInt();
        int days = 0;

        for (int month = 1; month <= 12; month++) {
            switch (month) {
                case 1:
                    System.out.println("\t\tJanuary   " + year);
                    days = 31;
                    break;
                case 2:
                    System.out.println("\t\tFebrauary   " + year);
                    if (year % 4 == 0) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                case 3:
                    System.out.println("\t\tMarch   " + year);
                    days = 31;
                    break;
                case 4:
                    System.out.println("\t\tApril   " + year);
                    days = 30;
                    break;
                case 5:
                    System.out.println("\t\tMay   " + year);
                    days = 31;
                    break;
                case 6:
                    System.out.println("\t\tJune   " + year);
                    days = 30;
                    break;
                case 7:
                    System.out.println("\t\tJule   " + year);
                    days = 31;
                    break;
                case 8:
                    System.out.println("\t\tAugust   " + year);
                    days = 31;
                    break;
                case 9:
                    System.out.println("\t\tSeptember   " + year);
                    days = 30;
                    break;
                case 10:
                    System.out.println("\t\tOctober   " + year);
                    days = 31;
                    break;
                case 11:
                    System.out.println("\t\tNovember   " + year);
                    days = 30;
                    break;
                case 12:
                    System.out.println("\t\tDecember   " + year);
                    days = 31;
                    break;
            }
            for (int i = 0; i < 50; i++) {
                System.out.print("-");
            }
            System.out.println("\nSun\tMon\tTue\tWed\tThr\tFri\tSat");
            for (int i = 0; i < firstDay; i++) {
                System.out.print("\t");
            }
            for (int i = 1; i <= days; i++) {

                if (i < 10) {
                    System.out.print(" " + i + "\t");
                } else {
                    System.out.print(i + "\t");
                }
                if ((i + firstDay) % 7 == 0) {
                    System.out.print("\n");
                }
                //firstDay++;
            }
            System.out.println("");
            firstDay = ((firstDay + days) % 7);
        }

    }
}

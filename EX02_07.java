package CH02;

import java.util.*;

public class EX02_07 {

    public static void main(String[] args) {
        System.out.print("Enter the number of minutes : ");

        Scanner input = new Scanner(System.in);
        long minite = input.nextLong();
        long year = minite / (365 * 60 * 24);
        long day = (minite % (365 * 60 * 24) ) / (24 * 60);
        

        System.out.println(minite + " minutes is approminiteimately " + year +
                " years and " + day + "days");
    }
}

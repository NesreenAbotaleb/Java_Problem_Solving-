package CH02;

import java.util.*;

public class EX02_25 {
    public static void main(String[] args) {
        System.out.print("Enter the time zone offset to GMT : ");

        long totalMiliSeconds = System.currentTimeMillis();

        Scanner input = new Scanner(System.in);
        int GMT = input.nextInt();

        long totalSeconds = totalMiliSeconds / 1000;
        int currentSecond = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        int currentMinutes = (int) (totalMinutes % 60);
        long totalHours = (totalMinutes / 60);
        int currentHour = (int) ((totalHours + GMT) % 24);

        System.out.println("The current time is " + currentHour + " : "
                + currentMinutes + " : " + currentSecond);
    }
}

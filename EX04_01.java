package CH04;

import java.util.*;

public class EX04_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        int positive = 0;
        int negative = 0;
        int total = 0;
        int sum = 0;
        System.out.print("Enter an int value, the program exits if the input"
                + " is 0 : ");
        do {

            if (x > 0) {
                positive++;
                total++;
                sum += x;

            } else if (x < 0) {
                negative++;
                total++;
                sum += x;

            }
            x = input.nextInt();
        } while (x != 0);

        System.out.println("The number of positives is " + positive + "\nThe "
                + "number of negatives is " + negative + "\nThe total is "
                + total + "\nThe average is " + ((double) sum / total));
    }
}

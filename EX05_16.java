package CH05;

public class EX05_16 {
    
    public static void main(String[] args) {
        for (int i = 2000; i <= 2010; i++) {
            System.out.println("The number of days for " + i + " is " 
                    + numberOfDaysInAYear(i));
        }
    }
    public static int numberOfDaysInAYear(int year){
        if (year % 4 == 0) {
            return 366;
        }else
            return 365;
    }
}

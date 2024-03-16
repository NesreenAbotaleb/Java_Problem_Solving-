package CH06;

import java.util.*;

public class EX06_03 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        int[] arr = new int[100];
        //int test;
        for (int i = 0; i < 100; i++) {
            arr[i] = input.nextInt();
            if (arr[i] == 0) {
                break;
            }
        }
        print(arr);
    }

    public static int occur(int num, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                count++;
            }

        }
        return count;
    }

    public static void print(int[] arr) {
        int[] t = new int[arr.length];
        int times;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0) {
                break;
            }
            boolean d = true;
            times = occur(arr[j], arr);
            //if(t[j] == arr [j])continue;
            for (int i = 0; i < t.length; i++) {
                if (arr[j] == t[i]) {
                    d = false;
                    break;
                }
            }

            if (d) {
                if (times == 1) {
                    System.out.println(arr[j] + " occurs " + times
                            + " time");

                } else {

                    System.out.println(arr[j] + " occurs " + times
                            + " times");
                    t[j] = arr[j];
                }
            }

        }
    }
}

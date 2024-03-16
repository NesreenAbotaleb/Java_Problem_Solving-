package CH06;

import java.util.*;

public class EX06_13 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num [] = new int[10];
        System.out.print("Enter ten numbers : ");
        for (int i = 0; i < 10; i++) {
            num[i] = input.nextInt();
        }
        System.out.println(getRandom(num));
    }
    public static int getRandom(int ... num){
        int r = 0;
        boolean exist = false;
        for (int i = 0; i < num.length; i++) {
            r = (int)(Math.random() * 54 + 1);
            for (int j = 0; j < num.length; j++) {
                exist = num [j] == r;
                if (exist) {
                    break;
                }
                
            }
            if(! exist) break;
        }
        return r;
    }
}

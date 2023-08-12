package CH05;

public class EX05_01 {

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            System.out.printf("%5d  ",pentagonal(i));
            if (i % 10 == 0) {
                System.out.println("");
            }
        }
        
    }
    public static int pentagonal(int n){
        return (n * (3 * n - 1) / 2);
    }
}

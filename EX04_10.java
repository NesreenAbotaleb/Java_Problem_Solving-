package CH04;

public class EX04_10 {
    
    public static void main(String[] args) {
        int x = 0;
        for (int i = 100 ; i < 1000 ; i += 10) {
            if(i % 5 == 0 && i% 6 == 0){
                System.out.print(i + " ");
                x++;
            }
            if (x  == 10){
                System.out.print("\n");
                x = 0;
            }
        }
    }
}

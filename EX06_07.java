package CH06;

public class EX06_07 {

    public static void main(String[] args) {
        
        int[] counts = new int[10];
        int num;
        
        for (int i = 0; i < 100; i++) {
            num = (int)(Math.random() * 10);
            counts[num]++;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println("The " + i + " is repeated " + counts[i] + " times");
        }
    }
}

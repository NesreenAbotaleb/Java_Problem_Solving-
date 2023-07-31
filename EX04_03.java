package CH04;

public class EX04_03 {

    public static void main(String[] args) {
        System.out.printf("%-12s %-5s", "Kilograms", "Pounds");
        for (int i = 1; i < 200; i += 2) {
            System.out.print("\n");
            System.out.printf("%-12d %-5.1f", i, (i * 2.2));
        }
    }
}

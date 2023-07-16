package CH02;

public class EX02_19 {

    public static void main(String[] args) {
        Long currentTime = System.currentTimeMillis();
        char c = (char) ((currentTime % 26) + 65);
        System.out.println(c);
    }
}

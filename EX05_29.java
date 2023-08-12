package CH05;

public class EX05_29 {

    public static void main(String[] args) {
        int num1 = rolled();
        int num2 = rolled();
        int sum = num1 + num2;
        System.out.println("You rolled " + num1 + " + " + num2 + " = " + sum);
        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You lose");
        }else if (sum == 7 || sum == 11) {
            System.out.println("You win");
        }else {
            System.out.println("the point is " + sum);
            num1 = rolled();
            num2 = rolled();
            
            while (num1 + num2 != sum && num1 + num2 != 7) {
                num1 = rolled();
                num2 = rolled();
                System.out.println("You rolled " + num1 + " + " + num2 + " = "
                        + (num1 + num2));
                
            }
            if (num1 + num2 == sum) {
                System.out.println("You win");
            }else
                System.out.println("You lose");
            
        }
    }
    
    public static int rolled(){
        return(int)((Math.random() * 6) + 1);
    }
}

package CH05;
 

public class EX05_10 {
    
    public static void main(String[] args) {
        System.out.println("The primes numbers from 2 to 10000 :");
        print(10000);
    }
    
    public static boolean isPrime(int x){
        for (int i = 2 ; i < x ; i++ ) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void print(int x){
        int count = 0;
        int prime = 2;
        while(prime < x ){
            if (isPrime(prime)) {
                count++;
                if (count % 10 == 0) {
                    System.out.print(prime + "\n");
                }else
                    System.out.print(prime + "\t");
            }
            prime++;
        }
    }
}

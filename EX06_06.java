package CH06;

public class EX06_06 {

    public static void main(String[] args) {
        
        int [] primes = new int [50];
        int num = 0;
        int count = 0;
        
        while (count < 50) {
            if(isPrime(num)){
                primes[count] = num;
                count ++;
            }
            num++;
        }
        print(primes);
    }
    public static boolean isPrime(int num){
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void print(int...nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
            if((i + 1) % 10 == 0 )System.out.println("");
        }
    }
}

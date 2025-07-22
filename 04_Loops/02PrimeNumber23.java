import java.util.*;

public class PrimeNumber23 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        /* Check if number is prime or not */

        int n = sc.nextInt();
        
        if(n <= 1) {
                System.out.println("Not a Prime Number");
        } else {
                boolean isPrime =  true;

                for(int i=2; i<=Math.sqrt(n); i++) { // i<=n-1
                        if(n%i==0) {
                                isPrime = false;
                                break;
                        }
                }
                if(isPrime == true) {
                        System.out.println("Prime Number");
                } else {
                        System.out.println("Not a Prime Number");
                }
        }
    }
}

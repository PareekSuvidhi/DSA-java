public class BinomialCoefficient33 {
    public static long factorial(int n) {
        long f = 1;
        for(int i=1; i<=n; i++) {
            f = f * i;
        }
        return f;
    }

    public static long binCoeff(int n, int r) {
        long fact_n = factorial(n);        // here factorial(n), factorial(r), factorial(n-r) are helper functions
        long fact_r = factorial(r);
        long fact_nmr = factorial(n-r);
        
        long binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter n : ");
        // int n = sc.nextInt();
        // System.out.print("Enter r : ");
        // int r = sc.nextInt();
        // int result = factorial(n) / (factorial(r) * factorial(n-r));
        // System.out.println("Binomial Coefficient : " + result);


        System.out.println(binCoeff(16,4));
    }
}

public class FunctionsFactorial32 {
    public static int factorial(int n) {
        int f = 1;
        for(int i=1; i<=n; i++) {
            f = f * i;
        }
        return f;
    }
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter n: ");
        // int n = sc.nextInt();
        // System.out.println("Factorial of " + n + " : " + factorial(n));

        // OR
        
        System.out.println("Factorial : " + factorial(6));
    }
}

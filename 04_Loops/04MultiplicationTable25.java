import java.util.Scanner;

public class MultiplicationTable25 {
    public static void printMultiplicationTable (int n) {
        System.out.println("Table of " + n);
        for(int i=1; i<=12; i++) {
            System.out.println(n + " X " + i + " = " + (n*i));
        } 
    }
    public static void main(String s[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();

        printMultiplicationTable(n);
    }
}

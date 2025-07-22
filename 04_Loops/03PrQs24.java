import java.util.*;

public class PrQs24 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

/* qs 1. How many times 'Hello' is printed */

        // for(int i=0; i<5; i++) {
        //     System.out.println("Hello");
        //     i+=2;            
        // }


/* qs 2. Write a program that reads a set of integers, and then prints the sum of the even and odd integers. */

        // System.out.println("How many numbers will you enter?");
        // int choice = sc.nextInt();
        // int sumEven = 0;
        // int sumOdd = 0;

        // for(int i=1; i<=choice; i++) {
        //     System.out.println("Enter number:");
        //     int n = sc.nextInt();

        //     if(n%2 == 0) {
        //         sumEven = sumEven + n;
        //     } else{
        //         sumOdd = sumOdd + n;
        //     }
        // }
        // System.out.println("Sum of even numbers: " + sumEven);
        // System.out.println("Sum of odd numbers: " + sumOdd);


        // APNA COLLEGE

        // int number;
        // int choice;
        // int evenSum = 0;
        // int oddSum = 0;

        // do { 
        //     System.out.println("Enter number:");
        //     number = sc.nextInt();

        //     if(number%2 == 0) {
        //         evenSum += number;
        //     } else {
        //         oddSum += number;
        //     }

        //     System.out.println("Do you want to continue? Press 1 for yes or any number for no");
        //     choice = sc.nextInt();

        // } while (choice==1);

        // System.out.println("Sum of even numbers: " + evenSum);
        // System.out.println("Sum of odd numbers: " + oddSum);




/* qs 3. Write a program to find the factorial of any number entered by the user. */

        // System.out.println("Enter any positive integer:");
        // int n = sc.nextInt();
        // int fact = 1;

        // for(int i=1; i<=n; i++) {  // int i=n; i>=1; i--
        //     fact = fact * i;   // fact *= i;
        // }
        // System.out.println("Factorial of " + n + " is " + fact);


/* qs 4. Write a program to print the multiplication table of a number N, entered by the user. */

        // System.out.println("Enter number:");
        // int n = sc.nextInt();
        // System.out.println("Table of " + n);

        // for(int i=1; i<=12; i++) {
        //     // int mult = n * i;
        //     // System.out.println(mult);
        //     System.out.println(n + " X " + i + " = " + (n*i));
        // }


/* qs 5. What is wrong in the following program */

        int i;

        for(i = 0; i<=5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("i after the loop = " + i);  




    }
}

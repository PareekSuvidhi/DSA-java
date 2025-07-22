import java.util.*;

public class Loops22 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

/* WHILE LOOP */

        // int counter = 0; // initialize

        // while(counter < 10) {
        //     System.out.println("Hello World");
        //     counter++;
        // }

        // System.out.println("Printed HW 10x");



/* Print number from 1 to 10 */

        // int counter = 1;                   // intialize
        // while(counter <= 10) {             // condition
        //     System.out.println(counter);
        //     counter++;                     // increment 
        // }

// Another way for same 
        // int counter = 1;                   // intialize
        // while(counter <= 100) {             // condition
        //     System.out.print(counter+" ");
        //     counter++;                     // increment 
        // }
        // System.out.println();
        // System.out.println("Hello");


/* Print number from 1 to n */

        // System.out.println("Enter range: ");
        // int range = sc.nextInt();
        // int counter = 1;

        // while(counter <= range) {
        //     System.out.print(counter + " ");
        //     counter++;
        // }
        // System.out.println();


/* Sum of first n natural number */

        // System.out.println("Enter n:");
        // int n = sc.nextInt();
        // int sum = 0;

        // int i = 1;
        // while(i <= n) {
        //     // sum = sum + i;
        //     sum += i;
        //     i++;
        // }
        // System.out.println("Sum is : " + sum);



/* FOR LOOP */

        // for( int i=1; i<=10; i++) {
        //         System.out.println("Hello World");
        // }

// Print Square pattern
        // for(int line=1; line<=4; line++) {
        //         System.out.println("****");
        // }

// same using while loop
        // int line = 1;
        // while(line<=4) {
        //         System.out.println("****");
        //         line++;
        // }

// Print Reverse of number using while loop

        // System.out.println("Enter number: ");
        // int n = sc.nextInt();

        // while(n>0) {
        //         int lastDigit = n%10;
        //         System.out.print(lastDigit);
        //         n /= 10;  // n = n/10
        // }
        // System.out.println();
        // System.out.println("Hello");

// Reverse the given number using for while loop

        // System.out.println("Enter number: ");
        // int n = sc.nextInt();
        // int rev = 0;
         
        // while(n>0) {
        //         int x = n%10;  // last digit
        //         rev = (rev*10) + x;
        //         n = n/10;  // remaining digits
        // }
        // System.out.println("Reversed digits: " + rev);

// for loop

        // int rev = 0;
        // for(int n=98765; n>0; n=n/10) {
        //         int x = n%10;  // last digit
        //         rev = rev*10 + x;
        // }
        // System.out.println("Reversed digits: " + rev);




/* do-while loop */

        // print hw 10 times

        // int counter = 1;
        // do {
        //         System.out.println("Hello World");
        //         counter++;
        // } while(counter <= 10);


/* break statement */

        // for(int i=1; i<=10; i++) {
        //         if(i==5) {
        //                 break;
        //         }
        //         System.out.println(i);
        // }

        // System.out.println("I am out of the loop.");


/* Keep entering numbers till user enters a multiple of 10 (use break) */

        // while(true) {
        //     System.out.print("Enter n: ");    
        //     int n = sc.nextInt(); 
            
        //     if(n % 10 == 0) {
        //         break;
        //     }
        //     System.out.println("n is " + n);
        // }
        // System.out.println("Out of the loop.");



        // USING DO-WHILE LOOP

        // do {
        //     System.out.print("Enter number: ");    
        //     int n = sc.nextInt(); 
            
        //     if(n % 10 == 0) {
        //         break;
        //     }
        //     System.out.println("number is " + n);
        // } while(true);                              // try using false it runs atleast once

        // System.out.println("Out of the loop.");




/* continue statement */

        // for(int i=1; i<=5; i++) {
        //         if(i == 3) {
        //                 continue;
        //         }
        //         System.out.println(i);
        //         System.out.println("HI Friend " + i);
        // }


/* Display all numbers entered by user except multiples of 10 */

        // do { 
        //     System.out.print("Enter n: ");
        //     int n = sc.nextInt();

        //     if(n % 10 == 0) {
        //         continue;
        //     }
        //     System.out.println("n is: " + n);
        // } while (true);



        



    }
}

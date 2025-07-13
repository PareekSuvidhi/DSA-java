import java.util.*;

public class ConditionalStatements14 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        // System.out.println("Enter Age : ");             // user input
        // int age = sc.nextInt();

        // int age = 22;

        // if(age >= 18){
        //     System.out.println("Adult : Vote, Drive");
        // }

        // if(age > 13 && age < 18){
        //     System.out.println("Teenager");
        // }

        // else{
        //     System.out.println("Not Adult");
        // }
 


        // Output: For age 22
        // Adult : Vote, Drive
        // Not Adult



        /* 

        What's wrong here?

        The first (if) is independent and checks if the age is 18 or more.

        The second if-else block is a pair — the else belongs only to the second if (age > 13 && age < 18), not to the first one.

        Since your age is 22:

        age >= 18 is true → prints Adult : Vote, Drive

        age > 13 && age < 18 is false

        So its else executes → prints Not Adult

        How to fix it:

        Use a proper (if - else if - else) structure so only one block runs

        */

        // if(age >= 18){
        //             System.out.println("Adult : Vote, Drive");
        // }
        // else {
        //     if(age > 13 && age < 18){
        //         System.out.println("Teenager");
        //     }
        //     else{
        //         System.out.println("Not Adult");
        //     }
        // }




        // Print largest of 2 numbers 

        // System.out.println("Enter A : ");
        // int A = sc.nextInt();
        // System.out.println("Enter B : ");
        // int B = sc.nextInt();

        // // int A = 1;
        // // int B = 3;

        // if(A >= B){
        //     System.out.println("A = " + A + " is greater");   // we can write multiple statements in a if block
        //     System.out.println("A >= B");
        // }
        // else{
        //     System.out.println("B = " + B + " is greater");   // This block is executed when (B > A)
        // }





        // if(A >= B)
        //     System.out.println("A = " + A + " is greater");   
        // else
        //     System.out.println("B = " + B + " is greater");   
        
        /*
        Only the first statement after an if without braces is part of the if block.

        Any lines after that are outside the if.

        So when using multiple lines — always wrap your blocks with {}.
        */





        // print if number is even or odd

        // System.out.print("Enter number: ");
        // int n = sc.nextInt();
        // if (n % 2 == 0) {
        //         System.out.println("n = " + n + " is Even number");
        // } else {
        //         System.out.println("n = " + n + " is Odd number");
        // }


// if - else if - else
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Adult");
        } 
        else if (age >= 13 && age < 18) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Children");
        }



    }
}

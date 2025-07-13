import java.util.*;

public class TernaryOperator18 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // int number = sc.nextInt();

        // if((number % 2) == 0) {
        //     System.out.println("even");
        // }
        // else {
        //     System.out.println("odd");
        // }


        // Ternary operator

        // String type = ((number % 2) == 0) ? "even" : "odd";
        // System.out.println(type);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int larger = (a>b)?a:b;
        // System.out.println("Larger: " + larger);


        // check if a student will pass or fail
        // int marks = sc.nextInt();
        // if(marks >= 33) {
        //     System.out.println("PASS");
        // }
        // else {
        //     System.out.println("Not Yet");
        // }

        // Ternary Operator
        // String result = (marks >= 33) ? "PASS" : "Not Yet";
        // System.out.println("Result: " + result);

//Question 1: Absolute Value
// Take an integer input from the user. Use a ternary operator to print the absolute value (i.e., remove the negative sign if it's negative).
        
        int n = sc.nextInt();
        int result = (n < 0) ? -n : n;
        System.out.println("Result: " + result);


    }
}

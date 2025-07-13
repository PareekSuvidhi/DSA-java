import java.util.*;

public class ConditionalPrQs21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


// question 1: print whether number is positive or negative

        // System.out.println("Enter n:");
        // int n = sc.nextInt();
        // if(n<0) {
        //     System.out.println("n = " + n + " is Negative");
        // } else {
        //     System.out.println("n = " + n + " is Positive");
        // }

// ternary operator

        // String result = (n<0)?"Negative":"Positive";
        // System.out.println(result);

// ternary operator

        // String result = (n<0)?"Negative":"Positive";
        // System.out.println("n = " + n + " is " + result);




// question 2 : print fever if temperature is above 100 otherwise print you don't have fever

        // double temp = 103.5;
        // if(temp > 100) {
        //     System.out.println("You have Fever");
        //     System.out.println("Visit the nearest clinic. Get well soon");
        // } else {
        //     System.out.println("You don't have fever");
        //     System.out.println("Well Done, Keep it Up Bro");
        // }

// ternary operator

        // double temp = 103.5;
        // String result = (temp > 100)?"Fever":"NO Fever";
        // System.out.println("Result: " + result);




// question 3 : input week number and print week name using switch case

        /* Input week number from user */
        // System.out.println("Enter week Number (1-7) : "); 
        // int week = sc.nextInt();

        // switch(week) {
        //         case 1 : 
        //                System.out.println("Monday"); 
        //                break;
        //         case 2 : 
        //                System.out.println("Tuesday");
        //                break;
        //         case 3 : 
        //                System.out.println("Wednesday");
        //                break;
        //         case 4 : 
        //                System.out.println("Thursday");
        //                break;
        //         case 5 : 
        //                System.out.println("Friday");
        //                break;
        //         case 6 : 
        //                System.out.println("Saturday");
        //                break;
        //         case 7 : 
        //                System.out.println("Sunday");
        //                break;
        //         default : 
        //                System.out.println("Invlaid Input! Please enter week number between 1-7.");
        // }



        // System.out.println("Enter week Number (1-7) : "); 
        // int week = sc.nextInt();
        // String day = "Sorry";

        // switch(week) {
        //         case 1 : day = "Monday";
        //                         break;
        //         case 2 : day = "Tuesday";
        //                         break;
        //         case 3 : day = "Wednesday";
        //                         break;
        //         case 4 : day = "Thursday";
        //                         break;
        //         case 5 : day = "Friday";
        //                         break;
        //         default : System.out.println("Wrong Input");
        // }
        // System.out.println(day);



// question 4. what will be value of x and y

        // int a = 63, b = 36;
        // boolean x = (a < b) ? true : false;
        // int y = (a > b) ? a : b;
        // System.out.println(x);  // x = false
        // System.out.println(y);  // y = 63


// question 5. Write a Java program that takes a year from the user and print whether that year is a leap year or not.

        System.out.println("Enter a year:");
        int year = sc.nextInt();

        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println("Leap year");
        }
        else {
                System.out.println("Not a Leap year");
        }

        // ✅ Only years divisible by 4 and not divisible by 100, 
        // OR years divisible by 400, are leap years.

// as per flowchart

        // System.out.println("Enter a year:");
        // int year = sc.nextInt();

        // boolean x = (year % 4) == 0;
        // boolean y = (year % 100) != 0; 
        // boolean z = ((year % 100 == 0) && (year % 400 == 0)); // leap year

        // if ( x && (y || z)) {
        //         System.out.println(year + " is a leap year");
        // } else {
        //         System.out.println(year + " is not a leap year");
        // }



    }
}

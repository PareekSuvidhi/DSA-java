import java.util.*;

public class PracticeQuestion7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

// Question 1 : Calculate average of 3 number

        // float number1 = sc.nextFloat();
        // float number2 = sc.nextFloat();
        // float number3 = sc.nextFloat();
        // float average = (number1 + number2 + number3) / 3;
        // System.out.println("average is : " + average);

        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // int C = sc.nextInt();
        // int average = (A + B + C) / 3 ;
        // System.out.println("average : " + average);

// Question 2 : Area of square

        // float side = sc.nextFloat();
        // float area = side * side;
        // System.out.println(area);

            // int side = sc.nextInt();
            // int area = side * side;
            // System.out.println("area of squrae is : " + area);


// Question 3 : Calculate bill

        // float pencil = sc.nextFloat();
        // float object1 = 0.18f * pencil;

        // float pen = sc.nextFloat();
        // float object2 = 0.18f * pen;

        // float eraser = sc.nextFloat();
        // float object3 = 0.18f * eraser;

        // float sum = object1 + object2 + object3;
        // System.out.println("Tax : " + sum);

        // float total = pen + pencil + eraser;
        // System.out.println("Total without tax : " + total);

        // float add = sum + total;
        // System.out.println("Total with tax : " + add);

// the above code is correct but not efficient, below is the corrected version


        // float pencil = sc.nextFloat();
        // float pen = sc.nextFloat();
        // float eraser = sc.nextFloat();

        // // Calculating total cost before tax
        // float total = pencil + pen + eraser;
        // System.out.println("Total without tax : " + total);
        
        // // Calculating 18% GST on the total
        // float tax = 0.18f * total;
        // System.out.println("Tax : " + tax);

        // // Calculating total cost after tax
        // float newTotal = total + tax;
        // System.out.println("Total with tax : " + newTotal);



// Question 4 : Type Promotion ( what should be the data type of result)
        //     byte b = 4;
        //     char c = 'a';
        //     short s = 512;
        //     int i = 1000;
        //     float f = 3.14f;
        //     double d = 99.9954;
            
        //     double result = (f * b) + (i % c) - (d * s);
        //     System.out.println(result);


// Question 5 : This will give any error ? Answer is : no error

                // int $ = 24;
                // System.out.println($);

// No, the statement will not give any error.
// Names of variables are called identifiers in Java. 
// Identifier rule says, identifiers can start with any alphabet or underscore (“_”) or dollar (“$”).
// According to the rule the given variable name is a valid identifier.

    }
    
}

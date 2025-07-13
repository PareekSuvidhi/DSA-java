import java.util.*;

public class JavaInputExamples4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

// Sum of 2 numbers

        /* 
        System.out.println("a:");
        int a = sc.nextInt();
        System.out.println("b:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum: ");
        System.out.println(sum);
        */


// Product of 2 numbers

        /*
        System.out.println("Enter x:");
        int x = sc.nextInt();
        System.out.println("Enter y:");
        int y = sc.nextInt();
        int product = x * y;
        System.out.println("Product of x and y:");
        System.out.println(product);
        */


// Area of circle without input

        // int radius = 2;
        // double area = 3.14 * radius * radius;
        // System.out.println(area);

        // float radius = 2;
        // System.out.println(radius);
        // float area = 3.14f * radius * radius;
        // System.out.println(area);
        

// Area of circle with user input

        // int radius = sc.nextInt();
        // float area = 3.14f * radius * radius; 
         

        /* 
        **** Explanation ****
        3.14f is a float.
        radius * radius is an int (25).
        Java automatically converts 25 to 25.0f (int → float) to match the float precision.
        Now, 3.14f * 25.0f results in a float (78.5f).
        The float result (78.5f) is assigned to area, which is a float. No error!
        */


        // System.out.println("Area:");
        // System.out.println(area);

        
        // float radius = sc.nextFloat();
        // float area = 3.14f * radius * radius;    // Every decimal value is bydefault considered as double
        // System.out.println(area);



// Perimeter of circle

        float r = sc.nextFloat();
        float perimeter = 2 * 3.14f * r;
        System.out.println(perimeter);

    }
}
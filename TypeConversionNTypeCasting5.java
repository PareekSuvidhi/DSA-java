import java.util.*;

public class TypeConversionNTypeCasting5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

// Type Conversion / Implicit Conversion / Widening Conversion
// byte -> short -> int -> float -> long -> double

        // int a = 25;
        // long b = a;   // possible

        // long a = 25;
        // int b = a;     // not possible
        
        // System.out.println(b);      

        // float number = sc.nextInt();
        // System.out.println(number);         // possible

        // int number2 = sc.nextFloat();
        // System.out.println(number2);       // not possible  

        // char ch = 'a';
        // int number = ch;
        // System.out.println(number);

        // char ch2 = 'b';
        // int number2 = ch2;
        // System.out.println(number2);

        // char ch3 = 'z';
        // int number3 = ch3;
        // System.out.println(number3);  // a(97) to z(122)

        // char ch4 = 'A';
        // int number4 = ch4;
        // System.out.println(number4);   // A(65) to Z(90)

        // char ch5 = 'Z';
        // int number5 = ch5;
        // System.out.println(number5);

// Type casting 

        // int n = 99;
        // char ch = (char) n;
        // System.out.println(ch);

        // int n1 = 89;
        // char ch1 = (char) n1;
        // System.out.println(ch1);

// In above 2 example: The numbers 99 and 89 correspond to the ASCII values of 'c' and 'Y', respectively.

// Type Casting / Narrowing Conversion / Explicit conversion

        // float a = 25.12f;
        // int b = a;
        // System.out.println(b);   // not possible

        // float a = 25.12f;
        // int b = (int) a;         // this will remove decimal part from 25.12
        // System.out.println(b);


// Type conversion and type casting both

        // long num = sc.nextInt();   // Implicit type conversion (widening) from int to long
        // int num2 = (int) num;      // Explicit type casting (narrowing) from long to int
        // System.out.println(num2);

        // double num1 = 21.2;     
        // float num2 = 67.9f;    // these 2 are for understanding that every decimal value is bydefault considered as double
        // long a = 3000000000L;  // these is for understanding that every integer value is bydefault considered as int

        double num = sc.nextFloat();    // Implicit type conversion (widening) from float to double
        float num2 =(float) num;       // Explicit type casting (narrowing) from double to float
        System.out.println(num2);
        
        System.out.println(num);

        }
}
import java.util.*;

public class TypePromotion6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        // char a = 'a';
        // char b = 'b';
        // int num1 = a;
        // int num2 = b;
        // System.out.println(num1);
        // System.out.println(num2);
        // System.out.println(b-a);


        // Alternate way to write above code
        // char a = 'a';
        // char b = 'b';
        // System.out.println((int)(a));
        // System.out.println((int)(b));
        // System.out.println(a);
        // System.out.println(b-a);

        
        // char a = 'a';
        // char b = 'b';
        // char c = b-a ;      // answer of b-a is integer which cannot be stored in char

        // To solve error in above line
        // char c = (char) (b-a);
        // System.out.println(c);


        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // byte bt = (byte) (a + b + c);
        // System.out.println(bt);


        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // double d = 30;
        // double ans = a + b + c + d;  // here among (int,float,long,double) double is the largest datatype so every datatype is converted to double
        // System.out.println(ans);

        // int ans1 = a + b + c + d;   // error
        // System.out.println(ans1); 

        // byte b = 5;
        // byte a = b * 2;   // error because (b * 2) is an expression whose answer is int
        // System.out.println(a);

// error in above 3 lines is solved below
        // byte b = 5;
        // byte a = (byte) (b * 2);
        // System.out.println(a);

        // byte c = 6;
        // byte d = c * 2.5 ;  // error because (c * 2.5) is double
        // System.out.println(d);

        // byte c = 6;
        // byte d =(byte) (c * 3.6) ; 
        // System.out.println(d);
        
        // byte, short, char -> int
        // float, double -> possible largest datatype

        byte b = 2;
        short a = 5;
        char c = 'c';
        int num = 12;
        float f = 12.2f;
        long l = 32;
        double d = 32.4;
        double answer = b + a + c + num + f * l + d;
        System.out.println(answer); 

        // float a = 23.4f;
        // long b = 986;
        // long c = (long) (b - a) ;        // (b - a) is promoted to float
        // System.out.println(c);


    }
}

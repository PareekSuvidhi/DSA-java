import java.util.Scanner;
public class CompleteRevision15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();         // next is used to print a word
        // System.out.println(input);
        // sc.nextLine();
        // String input1 = sc.nextLine();    // nextLine is used to print sentence
        // System.out.println(input1);

        // int number = sc.nextInt();
        // System.out.println(number);

        // float price = sc.nextFloat();
        // System.out.println(price);

        // long num = sc.nextLong();
        // System.out.println(num);

        // double num1 = sc.nextDouble();
        // System.out.println(num1);

        // boolean bol = sc.nextBoolean();   // input: true/false  or  True  or  TRUE
        // System.out.println(bol);

        // short sh = sc.nextShort();
        // System.out.println(sh);

        // byte by = sc.nextByte();
        // System.out.println(by);


    
       
        // type conversion | implicit | widening

        // int a = 23;
        // long b = a;
        // System.out.println(b);

        // byte -> short -> int -> float -> long -> double (allowed)
        
        // float b = sc.nextInt();
        // System.out.println(b);

        // int b = sc.nextFloat();  // LOSSY CONVERSION
        // System.out.println(b);

        // double b = sc.nextLong();
        // System.out.println(b);

        // char ch = 'A';
        // int number = ch;
        // System.out.println(number);

        // char ch1 = 'B';
        // int number1 = ch1;
        // System.out.println(number1);

        // char ch3 = 'Z';
        // int number3 = ch3;
        // System.out.println(number3);




        // Type casting | explicit | narrowing

        // long c = (long) sc.nextFloat();
        // System.out.println(c);

        // int a = (int) sc.nextFloat();
        // System.out.println(a);

        // float b = 99.99f;
        // int a = (int) b;
        // System.out.println(a);
        // System.out.println(b);

        // int number = 65;
        // char ch = (char) number;
        // System.out.println(ch);




        /* problem on input  */    

        // Sum of 2 numbers
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println(sum);

        // Product of 2 numbers
        // float a = sc.nextFloat();
        // float b = sc.nextFloat();
        // float product = a * b;
        // System.out.println(product);

        // Area of circle (3.14*Radius*Radius) without input
        // float radius = 5;
        // float area = 3.14f * radius * radius;
        // System.out.println(area);

        // Area of circle with user input
        // float r = sc.nextFloat();
        // float area = 3.14f * r * r;
        // System.out.println(area);

        // Perimeter of circle (2 * 3.14 * radius) with user input
        // System.out.println("Enter radius: ");
        // float r = sc.nextFloat();
        // float perimeter = 2 * 3.14f * r;
        // System.out.print("Perimeter of circle is: ");
        // System.out.println(perimeter);




        // Type Promotion in expression
      
        // byte, short, char --> int
        // char a = 'a';
        // short b = 25;
        // byte c = 55;
        // byte bt = (byte) (a + b + c);
        // System.out.println(bt);

        // int, float, long, double --> Highest possible datatype
        // int a = 12;
        // float b = 14.5f;
        // long c = 56;
        // double d = 34.6;
        // double ans = a + b + c + d;
        // // int ans = (int) (a + b + c + d);
        // System.out.println(ans);

        // int a = 12;
        // float b = 14.5f;
        // long c = 56;
        // // long ans =(long) (a + b * c);
        // float ans = a + b * c;
        // System.out.println(ans);

        // byte bt = 34;
        // // bt =(byte) (bt * 2);  // bt * 2 is an expression and hence promoted to int 
        // // System.out.println(bt);

        // int a = bt * 2;
        // System.out.println(a);

        // byte bt = 34;
        // double a = bt * 2.0;
        // System.out.println(a);

        // char a = 'a';
        // short b = 25;
        // byte c = 55;
        // int d = 56;
        // float val = 78.5f;
        // float ans =  a + b * c / d + val;
        // System.out.println(ans);

        // type conversion ways
        // char a = 'a';
        // char b = 'b';
        // // int num1 = a;
        // // int num2 = b;
        // // System.out.println(num1);
        // // System.out.println(num2);

        // System.out.println((int)a);
        // // System.out.println(b-a);

        // type casting ways
        // float a = 12.3f;
        // int b = (int) a;
        // System.out.println(b);


        // // type casting
        // float a = 12.3f;
        // System.out.println((int)a);

        // // type conversion
        // int a = 12;
        // System.out.println((float)a);




        // 1. Average of Three numbers
        // System.out.println("Enter A:");
        // int A = sc.nextInt();
        // System.out.println("Enter B:");
        // int B = sc.nextInt();
        // System.out.println("Enter C:");
        // int C = sc.nextInt();

        // int avg = (A + B + C) / 3;
        // System.out.println("Average: " + avg);


        // 2. Area of a square 
        // System.out.println("Enter side:");
        // int side = sc.nextInt();
        // int area = side * side;
        // System.out.println("Area: " + area + " sqm");


        // 3. output toatal cost along with 18% gst
        // System.out.println("Enter Cost of pencil:");
        // float pencil = sc.nextFloat();
        // System.out.println("Enter Cost of pen:");
        // float pen = sc.nextFloat();
        // System.out.println("Enter Cost of eraser:");
        // float eraser = sc.nextFloat();

        // float total = pencil + pen + eraser;
        // System.out.println("Total Cost: " + total);

        // float newTotal = total + (0.18f * total);
        // System.out.println("Bill wiht gst: " + newTotal);


        // 4. guess datatype of result
        // byte b =4;
        // char c = 'a';
        // short s = 512;
        // int i = 1000;
        // float f = 3.14f;
        // double d = 99.9954;
        // double result = (f *d) + (i % c) - (d * s);
        // System.out.println(result);
        

        // 5. will it give an error
        // int $ = 24;
        // System.out.println($);




// OPERATORS

        // Arithmetic operators (Binary: 2 operands)
        
        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // int sum = A + B;
        // System.out.println("sum: " + sum);
        // int diff = A - B;
        // System.out.println("Difference: " + diff);
        // int mult = A * B;
        // System.out.println("multiplication: " + mult);
        // int div = A / B;
        // System.out.println("division: " + div);
        // int modulo = A % B;
        // System.out.println("modulus: " + modulo);


        // Arithmetic operators (Unary: 1 operand)

        // increment operator
        // int a = 9;
        // int b = a++;   // post increment operator [ b = 9 and then a = 9 + 1 = 10 ]
        // int b = ++a;   // pre increment operator [ a = 9 + 1 = 10 and then b = 10 ]

        // decrement operator
        // int a = 9;
        // int b = a--;   // post decrement operator [ b = 9 and then a = 9 - 1 = 8]
        // int b = --a;   // pre decrement operator [ a = 9 - 1 = 8 and then b = 8 ]

        // System.out.println(a);
        // System.out.println(b);

        // int x = 3;
        // System.out.println(x++);   // post increment : value use and then increment
        // System.out.println(++x);  
        // System.out.println(x--);  
        // System.out.println(--x);  

        // int a = 5;
        // // int b = a++ + ++a;
        // int b = ++a - a++;  // 6 - 6 = 0 (not post increment has higher precedene than pre increment so ++a - 5 = 7-5=2

        // System.out.println("a = " + a);
        // System.out.println("b = " + b);



        // Relational Operators

        // int A = 20;
        // int B = 10;
        // System.out.println(A == B);
        // System.out.println(A != B);
        // System.out.println(A > B);
        // System.out.println(A < B);
        // System.out.println(A <= B);
        // System.out.println(A >= B);



        // Logical Operators

        // int A = 20;
        // int B = 40;
        // System.out.println((A<B) && (A!=B));       /* && (Logical AND) Both true then true */ 
        // System.out.println((A>B) || (A!=B));       /* ||(Logical OR) Both false then false */ 
        // System.out.println(!(A<B));                   // print false



        
        // Assignment operator (=) and the compound assignment operators (+=, -=, *=, /=, %=) 

        // int A = 20;
        // int B = A;
        // System.out.println(B);
        // A += 40;     // A = A + 40;
        // A -= 10;     // A = A - 10;
        // A *= 10;     // A = A * 10;
        // A /= 2;      // A = A / 2;
        // A %= 2;      // A = A % 2;
        // System.out.println(A);


        // pr qs
        // 1. 
        // int x = 2, y = 5;
        // int exp1 = (x * y / x);  // * and / has same precedence then left associativity
        // System.out.println(exp1 + ",");
        // int exp2 = (x * (y / x));
        // System.out.println(exp2);


        // 2.
        // int x = 200, y = 50, z = 100;
        // if(x > y && y > z){    
        //     System.out.println("Hello");    // 200 > 50 (true) && 50 > 100 (false) then false
        // }
        // if(z > y && z < x){
        //     System.out.println("Java");     // 100 > 50 (true) && 100 < 200 (true) then true
        // }
        // if((y+200) < x && (y+150) < z){
        //     System.out.println("Hello Java");   // (50+200) < 200 (false) && (50+150) < 100 (false) then false
        // }


        // 3. 
        // int x, y, z;
        // x = y = z = 2;
        // x += y;  // x = x + y = 2 + 2 = 4
        // y -=z;  // y = y - z = 2 - 2 = 0
        // z /= (x + y);  // z = z / (x + y) = 2/(4 + 0) = 0
        // System.out.println(x + " " + y + " " + z);


        // 4.
        // int x = 9, y = 12;
        // int a = 2, b = 4, c = 6;
        // int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);  //  exp = 278 
        // System.out.println(exp);


        // 5. 
        // int x = 10, y = 5;
        // int exp1 = (y * (x / y + x / y));          // exp1 = 20
        // int exp2 = (y * x / y + y * x / y);        // exp2 = 20
        // int exp3 = (y * (x / y) + y * (x / y));    // exp3 = 20
        // System.out.println(exp1);
        // System.out.println(exp2);
        // System.out.println(exp3);



// conditional statements
// if else
        // int age = 16;
        // int age = sc.nextInt();
        // if(age >= 18) {
        //     System.out.println("Adult: Vote, Drive");
        // }
        // else {
        //     if((age > 13) && (age < 18)) {
        //         System.out.println("Teenager");
        //     }
        //     else {
        //         System.out.println("Not Adult");
        //     }
        // }


// Largest of 2 values
        // System.out.print("Enter A: ");
        // int A = sc.nextInt();
        // System.out.print("Enter B: ");
        // int B = sc.nextInt();
        // if(A >= B) {
        //         System.out.println("A = " + A + " is greater");
        //         System.out.println("A >= B");
        // } else {
        //         System.out.println("B = " + B + " is greater");
        // }
                
// if or else has only one statement then dont use curly braces but it suggested to use curly braces even for one statement



// print if number is even or odd 
        // System.out.print("Enter number: ");
        // int n = sc.nextInt();
        // if (n % 2 == 0) {
        //         System.out.println("n = " + n + " is Even number");
        // } else {
        //         System.out.println("n = " + n + " is Odd number");
        // }


// Loops revise : while loop, for loop, do while
/* print numbers from 1 to n */
        // System.out.println("Enter n:");
        // int n = sc.nextInt();

        // int i = 1;                          // initialize
        // while(i <= n) {                     // condition
        //         System.out.println(i);   
        //         i++;                        // increment
        // }

/* Sum of first n natural numbers */
        // System.out.println("Enter n:");
        // int n = sc.nextInt();
        // int sum = 0;

        // int i = 1;
        // while(i <= n){
        //         sum = sum + i; // sum += i;
        //         i++;
        // }
        // System.out.println("Sum: " + sum);


/* Print 1 to 10 */
        int i = 1;
        while(i <= 10) {
                System.out.print(i + " ");
                i++;
        }
        System.out.println();
        System.out.println("Printed 1 to 10");





    }
}


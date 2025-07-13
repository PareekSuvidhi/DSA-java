import java.util.*;

public class Operators8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter A :");
        int A = sc.nextInt();
        System.out.println("Enter B :");
        int B = sc.nextInt();

        
        // int A = 10;
        // int B = 5;

        // Arithmetic operators (Binary)
        System.out.println("Addition = " + (A + B));
        System.out.println("Subtraction = " + (A - B));
        System.out.println("Multiplication = " + (A * B));
        System.out.println("Division = " + (A / B));
        System.out.println("Modulo(Remainder) = " + (A % B));
    }
}

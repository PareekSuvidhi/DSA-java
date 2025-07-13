import java.util.*;
public class LargestOfThreeNo17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Largest of Three numbers
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter c:");
        int c = sc.nextInt();

        // if(a > b && a > c) {
        //     System.out.println("a = " + a + " is largest");
        // }
        // else if(b > a && b > c) {
        //     System.out.println("b = " + b + " is largest");
        // }
        // else if(c > a && c > b) {
        //     System.out.println("c = " + c + " is largest");
        // }
        
        if((a >= b) && (a >= c)) {
            System.out.println("a is largest");
        }
        else if(b >= c) {
            System.out.println("b is largest");
        }
        else {
            System.out.println("c is largest");
        }
    }
}

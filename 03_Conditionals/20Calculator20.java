import java.util.*;

public class Calculator20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a:");
        // int a = sc.nextInt();
        // System.out.println("Enter b:");
        // int b = sc.nextInt();
        // System.out.println("Enter operator:");
        // char operator = sc.next().charAt(0);

        // switch(operator) {
        //     case '+' : System.out.println(a+b);
        //                 break;
        //     case '-' : System.out.println(a-b);
        //                 break;
        //     case '*' : System.out.println(a*b);
        //                 break;
        //     case '/' : System.out.println(a/b);
        //                 break;
        //     case '%' : System.out.println(a%b);
        //                 break;
        //     default : System.out.println("Invalid Operator");
        // }

// for 3 numbers

        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter c:");
        int c = sc.nextInt();
        System.out.println("Enter operator:");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println(a+b+c);
                        break;
            case '-' : System.out.println(a-b-c);
                        break;
            case '*' : System.out.println(a*b*c);
                        break;
            case '/' : {
                if(b==0 || c==0) {
                    System.out.println("Cannot divide by zero");
                }
                else {
                    System.out.println(a/b/c);
                }
                        break;
            }
            
            case '%' : {
                if(b==0 || c==0) {
                    System.out.println("Cannot perform modulo by zero");
                }
                else {
                    System.out.println(a%b%c);
                }
                        break;
            }
            default : System.out.println("Invalid Operator");
        }
    }
}

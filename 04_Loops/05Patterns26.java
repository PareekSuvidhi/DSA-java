import java.util.*;

public class Patterns26 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

    /* star pattern */
        // for(int line=1; line<=10; line++) {
        //     for(int star=1; star<=line; star++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

    /* inverted star pattern OWN*/
        // for(int line=4; line>=1; line--) {
        //     for(int star=line; star>=1; star--) {    // condition : int star=1; star<=line; star++
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

    /* inverted star pattern */
        // System.out.println("Enter number of lines:");
        // int n = sc.nextInt();
        // for(int line=1; line<=n; line++) {
        //     for(int star=1; star<=n-line+1; star++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

    /* Half-Pyramid Pattern */
        // int n = sc.nextInt();

        // for(int line=1; line<=n; line++) {
        //     for(int number=1; number<=line; number++) {
        //         System.out.print(number);
        //     }
        //     System.out.println();
        // }


    /* Character Pattern */
    //A 
    //BC 
    //DEF 
    //GHIJ
 
        // System.out.print("Enter number of lines: ");
        // int n = sc.nextInt();
        // char alphabet = 'A';
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(alphabet);
        //         alphabet++;
        //     }
        //     System.out.println();
        // }


/* Floyd's triangle pattern */
        // System.out.print("Enter number of lines: ");
        // int n = sc.nextInt();
        // int num = 1;
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }


/* inverted half-pyramid with number pattern */
// 1 2 3 4 5  line1 number5  n-line+1   (n=5)
// 1 2 3 4    line2 number4
// 1 2 3      line3 number3
// 1 2        line4 number2
// 1          line5 number1

        // System.out.print("Enter number of lines: ");
        // int n = sc.nextInt();

        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=n-i+1; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }



    }
}

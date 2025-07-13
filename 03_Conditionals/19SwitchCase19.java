public class SwitchCase19 {
    public static void main(String args[]){
            // int number = 2;
            // switch(number) {
            //     case 1 : System.out.println("Rasmalai");
            //     case 2 : System.out.println("Sondesh");
            //     case 3 : System.out.println("Chocolate Kajukatli");
            //     case 4 : System.out.println("Pineapple Sheera");
            //     default : System.out.println("I'm on a NO SUGAR diet");
            //}

                /* 
                output:
                Sondesh
                Chocolate Kajukatli
                Pineapple Sheera
                I'm on a NO SUGAR diet
                */

            // switch(number) {
                // case 1 : System.out.println("Rasmalai");
                //             break;
                // case 2 : System.out.println("Sondesh");
                //             break;
                // case 3 : System.out.println("Chocolate Kajukatli");
                //             break;
                // case 4 : System.out.println("Pineapple Sheera");
                //             break;
                // default : System.out.println("I'm on a NO SUGAR diet");
            // }


// cases (numbers) in random order


            // switch(number) {
            // case 3 : System.out.println("Rasmalai");
            //             break;
            // case 4 : System.out.println("Sondesh");
            //             break;
            // case 2 : System.out.println("Chocolate Kajukatli");
            //             break;
            // case 1 : System.out.println("Pineapple Sheera");
            //             break;
            // default : System.out.println("I'm on a NO SUGAR diet");
            // }


// use char type variable


            // char ch = 'd';
            // switch(ch) {
            //     case 'a' : System.out.println("Rasmalai");
            //                 break;
            //     case 'b' : System.out.println("Sondesh");
            //                 break;
            //     case 'c' : System.out.println("Chocolate Kajukatli");
            //                 break;
            //     case 'd' : System.out.println("Pineapple Sheera");
            //                 break;
            //     default : System.out.println("I'm on a NO SUGAR diet");
            // }

// can also use data types like float, double


// multiple lines inside a single case 


            // int number = 2;
            // switch(number) {
            //     case 1 : {
            //         System.out.println("Rasmalai");
            //         System.out.println("Soft and Sweet");
            //         break;
            //     }
                    
            //     case 2 : {
            //         System.out.println("Sondesh");
            //         System.out.println("Bengoli Sweet");
            //         System.out.println("Must try");
            //         break;
            //     }
                    
            //     case 3 : {
            //         System.out.println("Chocolate Kajukati");
            //         System.out.println("Nuts and Chocolate");
            //         break;
            //     }
                    
            //     default :
            //         System.out.println("I am on NO SUGAR diet");

            // }

    
// In the enhanced switch expression (introduced in Java 14 as a stable feature), you do not need break; statements.

            // char ch = 'b';
            // switch(ch) {
            //     case 'c' -> System.out.println("Apple");
            //     case 'b' -> {
            //         System.out.println("Mango");
            //         System.out.println("Shake");
            //     }
            //     default -> System.out.println("Eat fruits");
            // }


            // char ch = 'b';
            // String sweet = switch (ch) {
            //     case 'a' -> "Rasmalai";
            //     case 'b' -> "Sondesh";
            //     default -> "No Sweet";
            // };
            // System.out.println("Sweet: " + sweet);

            // int n = 9;
            // String gift;

            // switch (n) {
            //     case 8:
            //         gift = "Cycle";
            //         break;
            //     case 9:
            //         gift = "New Phone";
            //         break;
            //     default:
            //         gift = "Chup";
            //         break;
            // }

            // System.out.println("Gift: " + gift);
    }
}

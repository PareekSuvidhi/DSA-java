public class PrQs13{
    public static void main(String args[]){

        // Qs 1
        //  int x = 2, y = 5;
        //  int exp1 = (x * y / x);
        //  int exp2 = (x * (y / x));

        //  System.out.print(exp1 + ",");   // Ans 5
        //  System.out.print(exp2);   // Ans 4


        // Qs 2
        // int x = 200, y = 50, z = 100;
        // if(x > y && y > z){
        //     System.out.println("Hello");
        // }
        // if(z > y && z < x){
        //     System.out.println("Java");
        // }
        // if( (y + 200) < x && (y + 150) < z){
        //     System.out.println("Hello Java");
        // }


       
        // Qs 3
        // int x, y, z;
        // x = y = z = 2; // Assign 2 to all three variables x, y, and z
                
        // x += y;    // x = x + y = 2 + 2 = 4
        // y -= z;    // y = y - z = 2 - 2 = 0
        // z /= (x + y);    // z = z / (x + y) = 2 / (4 + 0) = 2 / 4 = 0 (integer division)
                
        // System.out.println(x + ", " + y + ", " + z);
           
        


        // Qs 4
        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;

        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);

        System.out.println(exp);  // exp = 278


        // Qs 5
        // int x = 10, y = 5;
        // int exp1 = (y * (x / y + x / y));
        // int exp2 = (y * x / y + y * x / y);

        // System.out.println(exp1);  // 20
        // System.out.println(exp2); // 20
    }
}
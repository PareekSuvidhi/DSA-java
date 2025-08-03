public class FunctionsProduct31 {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }
    public static void main(String args[]) {
        int a = 3;
        int b = 5;
        int prod = multiply(a, b);  
        System.out.println("Product is : " + prod);
        prod = multiply(20, 10);
        System.out.println("Product is : " + prod);
        System.out.println(multiply(3,8));



        
/* 3. Compilation Rules
Unlike some older languages (like C), Java does not require a method to be declared before it’s used (as long as it’s in the same class).
That’s because the Java compiler scans the entire class before compiling it. */


    }
}

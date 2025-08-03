public class FunctionsCallByValue29 {
    public static void swap(int a, int b) {   
        //swap - values exchange
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        int a = 10; 
        int b = 5;  
        swap(a, b);
        System.out.println("a is " + a);  // a = 10
        System.out.println("b is " + b);  // b = 5
    }
}
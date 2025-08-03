public class FunctionsCallByValue30 {
    public static int changeA(int a) {
        a = 5;
        // System.out.println("a is " + a);  
        return a;
    }
    public static void main(String args[]) {
        int a = 10;
        a = changeA(a);
        System.out.println("a is " + a);   
    }
}

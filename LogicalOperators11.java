public class LogicalOperators11{
    public static void main(String args[]){ 

        // Logial AND

        // System.out.println( (3>2) && (5>0) );    // true
        // System.out.println( (3<2) && (5>0) );    // false
        // System.out.println( (3>2) && (5<0) );    // false
        // System.out.println( (3<2) && (5<0) );    // false


        // Logical OR

        System.out.println( (3<2) || (5<0) );     // false
        System.out.println( (3>2) || (5<0) );     // true
        System.out.println( (3<2) || (5>0) );     // true
        System.out.println( (3>2) || (5>0) );     // true


        // Logical NOT

        // System.out.println( !(3>2) );     // false
        // System.out.println( !(5<0) );     // true

    }
}
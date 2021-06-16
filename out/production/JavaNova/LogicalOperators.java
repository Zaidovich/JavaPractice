

public class LogicalOperators {
    public static void main(String[] args) {

        // && all statements have to be true otherwise it returns false
        /*
        int x = 70;

        System.out.println( (x < 60) && (x < 80));
        System.out.println( (x >= 70) && (x <= 70));

        float x1 = 10.99f;
        float y1 = 10.98f;

        System.out.println( (x1 > y1) && (x1 == y1) && ( y1 < x1));

        System.out.println( (x1 != y1) && (y1 < x1) && ( x1 > y1) && (y1 != x1));


        double x = 101.00;

        System.out.println((x != 100) && (x > 100));

        */

        float x1 = 10.99f;
        float y1 = 10.98f;

        System.out.println( (x1 > y1) || (x1 == y1) || ( y1 < x1));

        //! => Reverse the result, returns false if the result is true

        System.out.println( ! ( x1 > y1) && (x1 == y1));


    }
}



public class HomeworkTwelve {

    public static void main(String[] args) {
        System.out.println(greater( 15, 20));
        System.out.println(threeInts(10,12,10));
    }
                        //Task 1
    public static int greater (int x, int y) {
        int output = 0;
        if (x > 21 && y > 21) {
           return 0;
        } else if (x <= 21 && x > y || y > 21) {
            return x;
        }else{
            return y;
        }
    }
                        //Task 2

    public static int threeInts (int a, int b, int c){
        if (a == b)
            return c;
        else if(a == c)
            return b;
        else if(b == c)
            return a;
        else if (a == b && a == c)
            return 0;
        else
            return a + b + c;
    }
}

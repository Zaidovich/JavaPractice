

public class JavaMethodsDay2 {
    public static void main(String[] args) {

        System.out.println("Hello");

    }



    // Method Overloading in java!

    public static void printText(){
        System.out.println("no parameters");

    }
    public static void printText(int x){
        System.out.println("1 int " + x);

    }
    public static void printText(String str){
        System.out.println("string parameters " + str);

    }
    public static void printText(boolean y){
        System.out.println(y);

    }
    public static void printText(char c){
        System.out.println("char parameters " + c);

    }





                            //Task

    public static void addNumber(String a, int x){
        System.out.println("Parameter String added to int = " + a + x);

    }
    public static void addNumber(char c, int x){
        System.out.println("Parameter char added to int = " + c + x);

    }
    public static void addNumber(int x, int y, int z){
        System.out.println("Parameter of three ints added together  = " + x + y + z);

    }
    public static void addNumber(byte x, int y, String z){
        System.out.println("Parameter of byte, int and String added together = " + x + y + z);

    }
    public static void addNumber(long x, short y){
        System.out.println("Parameter long and short added together = " + x + y);

    }
}

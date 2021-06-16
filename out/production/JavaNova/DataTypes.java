


public class DataTypes {

    public static void main(String [] args) {

        //byte can only hold from -128 to 127
/*
        byte num1 = 127;

 */
        // The short data type can store whole numbers from -32,768 to 32,767:

        short num2 = 1000;

        //The int data type can store whole numbers from -2147483648 to 2147483647.
        //data type when we create variables with a numeric value.
        //In general and in our tutorial the in data type is the preferred.

        int number = 123456789;


        //The long data type can store whole numbers from -922337203 etc
        //This is used when int is not large enough to store the value.
        //Note that you should end the value with and "L":

        long numberLong = 12345678l;

        //the float data type can store fractional numbers from 3.4e-038 to 3.4e-038.
        //NOte that you should end the value with an "f":

        float numberFloat = 9.99995555f;

        //The double data type can store fractional numbers from 1.7e-308 to 1.7e+308.
        //Note that you should end the value with "d":

        double numberDouble = 9.9999999933333d;

        //The char data type is used to store a single character.
        // THe character must be surrounded by single quotes, like 'A' or 'c':

        char x = 'A';

        //A boolean data type is declared with the boolean keyword and
        //can only take values true or false:

        boolean light = true;

        char F = 70;
        char a = 97;
        char r = 114;
        char i = 105;
        char d = 100;
        char u = 117;
        char n = 110;

        System.out.println(F + "" + a + "" + r + "" + i + "" + d + "" + u + "" + n);

        //Book Program

        String name = "Java Book";
        String author = "JC";


        int copyPrinted = 2000000;
        int chapter = 17;
        int pages = 450;
        int pageNumber = 50;

        char dot = '.';

        float price = 12.99f;

        boolean isAGoodBook = true;

        System.out.println("This book  is about the " + name);
        System.out.println("The author of " + name + " is " + author + dot);
        System.out.println("The " + name + " has " + pages + " pages and " + chapter + " chapters" + dot);
        System.out.println("The " + name + " has been printed " + copyPrinted + " copies & the price is " + price + dot);








    }
}

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        //charAt();

        String str = "Java";
        /*
        char c = str.charAt(0);

        System.out.print(str.charAt(3));
        System.out.print(str.charAt(2));
        System.out.print(str.charAt(1));
        System.out.print(str.charAt(0));
        System.out.println(c);*/

        //concat();

        String str2 = " is fun";
        /*String result = str + str2;


        System.out.println(str.concat(str2));*/

        //compareTo();      returns zero(0) if same, postive number, or negative number!

        String str3 = "Java";
/*
        System.out.println(str.compareTo(str3));*/


        //equals(); returns positive or negative!

        /*System.out.println(str3.equals("Java"));*/

        //equalsIgnoreCase(); return ignored lower/upper case!

        /*System.out.println(str3.equalsIgnoreCase("JAVA"));*/

        //length(); checks and returns number of characters.

        /*System.out.println(str.length());*/

        //isEmpty(); returns true or false after checking if its empty or not.

        String str4 = "";

        /*System.out.println(str4.isEmpty());*/

        //contains(); returns true or false if it does/doesn't contain it.

        /*System.out.println(str.contains("A"));*/

        //startWith(); returns true/false if it starts with the given value.

       /* System.out.println(str.startsWith("Ava"));*/

        //endsWith(); returns true/false if it starts with the given value.

       /* System.out.println(str.endsWith("a"));*/

        //toUpperCase(); takes the value and returns all in upper case!

        /*System.out.println(str.toUpperCase());*/

        //toLowerCase(); take the value and returns it in lower case!

        /*System.out.println(str.toLowerCase());*/

        //indexOf(); opposite of charAt, finds and returns index of a String/character!

        /*System.out.println(str.indexOf("v"));*/

        //lastIndexOf; finds and returns last index of a String/character!

       /* System.out.println(str.lastIndexOf("J"));*/

        //replace(); will replace the first letter you write with the second letter you write!

        /*System.out.println(str.replace("Java", "Java is fun"));
        System.out.println(str.replace("v", "V"));
        System.out.println(str.replace(str, str2));*/

        //substring(); returns from index entered to the second index entered!

        /*System.out.println(str.substring(0, 4));*/

        //split(); returns an array of characters

        /*String [] x = str.split("a");

        String [] x1 = str.split("");

        System.out.println(x1 [0]);

        for(String c : x){
            System.out.print(c);
        }*/

        String str6 = "Java VA";

        String [] x2 = str6.split("");
        Arrays.sort(x2);
        System.out.println(x2[1]);





    }
}

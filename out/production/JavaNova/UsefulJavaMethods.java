import java.util.*;

import javax.swing.JOptionPane;

public class UsefulJavaMethods {

    public static void main(String[] args) {



        // Length Method() => lets us find out how many characters in a string
/*
        String name = "Hello";

        name = "Jack Bower";
        String myName = "Faridun Saidov";

        int myNameSize = myName.length();
        int nameSize = name.length();

        System.out.println(nameSize);
        System.out.println(myNameSize);

        // To UpperCase() => converts a;; string to upper case letters

        String text = "abc";

        System.out.println(text.toUpperCase());



        //toLowerCase()=> converts string to lower case letters

        String text = "ABCDEF";

        System.out.println(text.toLowerCase());



        //equals() => comprares 2 string together - returns boolean

        String text = "ABC";
        String text1 = "ABCd";

        boolean z = text.equals(text1);

        //System.out.println(text.equals(text1));




            System.out.println("Type - HELLO - ");
            String text = input.nextLine();
            System.out.println(text.toLowerCase());

            System.out.println("Type - hello - ");
            String text1 = input.nextLine();
            System.out.println(text1.toUpperCase());


        //parseInt() ==> Converts a string into int

        String number = "10";
        int valueOfNumber = Integer.parseInt(number);

        double valueNumber2 = Double.parseDouble(number);
        float valueNumber3 = Float.parseFloat(number);

        System.out.println(number + 1); //concatenation
        System.out.println(valueOfNumber +  1); //addition
        System.out.println(valueNumber2);
        System.out.println(valueNumber3 + 20);


        System.out.println("Enter string here: ");
        String numberFromUser = input.nextLine();
        double result = Double.parseDouble(numberFromUser);
        result += 10.10;
        System.out.println(result);


        //shopping list
        //Apples. Tomatoes, Sugar, Coffee, Potatoes, Orange, Milk, Bread and Eggs.

        //
        String firstName = JOptionPane.showInputDialog("Enter your First Name: ");
        String lastName = JOptionPane.showInputDialog("Enter your Last Name: ");
        int myAge = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        String favoritePlace = JOptionPane.showInputDialog("Enter your favorite place to visit: ");
        char dot = '.';

        System.out.println("My first name is " + firstName + dot + " My last name is  " + lastName + dot + " I am " + myAge + dot + " My favorite place to visit is " + favoritePlace + dot);

        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter first number "));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter second number "));
        int totalNumber = x * y;

        System.out.println(x + " * " + y + " = " + totalNumber);

        int currentYear = 2021;
        int birthYear = Integer.parseInt(JOptionPane.showInputDialog("What is your year of birth?"));
        int userAge = currentYear - birthYear;

        System.out.println("You are " + userAge + " years old");

        String java = JOptionPane.showInputDialog("Enter 'Java' ");
        String school = JOptionPane.showInputDialog("Enter 'Tech Nova School' ");

        System.out.println("I am learning " + java + " in " + school);

 */
        Scanner input = new Scanner(System.in);
        char sign = '$';

        System.out.println("Enter your 1st item: ");
        String one = input.next();
        System.out.println("Enter your 1st item price: ");
        double price1 = input.nextDouble();

        System.out.println("Enter your 2nd item: ");
        String two = input.next();
        System.out.println("Enter your 2nd item price: ");
        double price2 = input.nextDouble();

        System.out.println("Enter your 3rd item: ");
        String three = input.next();
        System.out.println("Enter your 3rd item price: ");
        double price3 = input.nextDouble();

        System.out.println("Enter your 4th item: ");
        String four = input.next();
        System.out.println("Enter your 4th item price: ");
        double price4 = input.nextDouble();

        System.out.println("Enter your 5th item: ");
        String five = input.next();
        System.out.println("Enter your 5th item price: ");
        double price5 = input.nextDouble();
        System.out.println("Enter your 6th item: ");
        String six = input.next();
        System.out.println("Enter your 6th item price: ");
        double price6 = input.nextDouble();
        System.out.println("Enter your 7th item: ");
        String seven = input.next();
        System.out.println("Enter your 7th item price: ");
        double price7 = input.nextDouble();
        System.out.println("Enter your 8th item: ");
        String eight = input.next();
        System.out.println("Enter your 8th item price: ");
        double price8 = input.nextDouble();
        System.out.println("Enter your 9th item: ");
        String nine = input.next();
        System.out.println("Enter your 9th item price: ");
        double price9 = input.nextDouble();
        System.out.println("Item1 : " + one + "  price is " + price1 + sign);
        System.out.println("Item2 : " + two + "  price is " + price2 + sign);
        System.out.println("Item3 : " + three + "  price is " + price3 + sign);
        System.out.println("Item4 : " + four + "  price is " + price4 + sign);
        System.out.println("Item5 : " + five + "  price is " + price5 + sign);
        System.out.println("Item6 : " + six + "  price is " + price6 + sign);
        System.out.println("Item7 : " + seven + "  price is " + price7 + sign);
        System.out.println("Item8 : " + eight + "  price is " + price8 + sign);
        System.out.println("Item9 : " + nine + "  price is " + price9 + sign);
        double totalPrice = price1 + price2 + price3 + price4 + price5 + price6 + price7 + price8 + price9;
        System.out.println("Your total is: " + totalPrice + sign);

    }
}

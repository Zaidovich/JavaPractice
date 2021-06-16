
import java.util.*;

public class Practice2 {
    public static void main(String[] args) {
/*
        String age = "I am ";

        int currentYear = 2021;
        int birthYear = 1995;

        int myAge = currentYear - birthYear;

        System.out.println(myAge);
        //

        float pound = 2.2f;
        float kg = 65.0f;

        float result = pound * kg;

        System.out.println(result);




        System.out.println("Enter current year: ");
        int currentYear = input.nextInt();

        System.out.println("Enter your year of birth: ");
        int birthYear = input.nextInt();

        System.out.println("Your age is: " + (currentYear - birthYear));





        System.out.println("What is your pound?: ");
        float pound = input.nextFloat();

        System.out.println("What is your kg?: ");
        float kg = input.nextFloat();

        System.out.println("Your weight is: " + (pound * kg));

        //task:



        System.out.println("What is the value of 1 kg converted to pound? : ");
        float pound = input.nextFloat();

        System.out.println("What is your kg?: ");
        float kg = input.nextFloat();

        System.out.println("Your weight is: " + (pound * kg));
*/
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int number1 = input.nextInt();

        System.out.println("Enter your second number: ");
        int number2 = input.nextInt();

        System.out.println("Number One " + (number1 > number2));
        System.out.println("Number Two " + (number2 > number1));
    }
}

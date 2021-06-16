import javax.swing.*;
import java.util.Scanner;

public class IfStatements {

    public static void main(String[] args) {
/*
        int number0 = 5;
        int number1 = 3;


        if ( number0 > number1 ) {

            System.out.println("5 is bigger than 3");
        }



        if ( 10 > 5 ) {

            System.out.println("10 is bigger than 5" );
        }



        //textX.equals(textY);
        //text == text2;
        String textX = "Apple";
        String textY = "Orange";

        if (textX == textY) {

            System.out.println(textX + " is not equal to " + textY);
        }


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int one = input.nextInt();
        System.out.println("Enter your second number: ");
        int two = input.nextInt();

        if (one > two) {

            System.out.println("Number 1 is bigger than number 2");
        }



        String aText = JOptionPane.showInputDialog("Enter your first number: ");
        String bText = JOptionPane.showInputDialog("Enter your second number: ");

        int a = Integer.parseInt(aText);
        int b = Integer.parseInt(bText);

        if ( aText.equals (bText)) {

          System.out.println(a + " is same as " + b);
        }

        int x = 10;
        int y = 5;

        if (x < y) {

            System.out.println(x + " is bigger than " + y);
        } else {
            System.out.println(x + " is smaller than " +y);
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int one = input.nextInt();
        System.out.println("Enter your second number: ");
        int two = input.nextInt();

        if ((one - two) == 0) {

            System.out.println(one + " is equal to" + two);

        } else {

            System.out.println(one + " not equal to " + two);

        }

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You can buy tobacco. ");
        } else {
            System.out.println("You are not allowed to buy tobacco! ");
        }

*/
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = input.nextInt();
        int age = 2021 - yearOfBirth;

        if (age>= 18){
            System.out.println("You can buy tobacco. ");
        } else {
            System.out.println("You are not allowed to buy tobacco! ");
        }
    }
}

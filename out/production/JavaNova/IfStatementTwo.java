import java.util.Scanner;

public class IfStatementTwo {

    public static void main(String[] args) {
/*
        if (4>2) {

            System.out.println("True");

        } else if (4>6) {

            System.out.println("Else will run");

        } else {

            System.out.println("Else runs if all conditions are false");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter 2nd number: ");
        int secondNumber = input.nextInt();

        if(firstNumber > secondNumber) {

            System.out.println("First number is bigger");

        } else if (secondNumber > firstNumber) {

            System.out.println("Second number is bigger");

        } else if (firstNumber == secondNumber && secondNumber == firstNumber) {

            System.out.println("Numbers are equal");

        } else {

            System.out.println("Wrong input!");
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter 2nd number: ");
        int secondNumber = input.nextInt();

        System.out.println("Enter 3rd number: ");
        int thirdNumber = input.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("First number is bigger.");

        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Second number is bigger.");

        } else if (thirdNumber > secondNumber && thirdNumber > firstNumber) {
            System.out.println("Third number is bigger.");

        } else {
            System.out.println("Numbers are equal");
        }


        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter 2nd number: ");
        int secondNumber = input.nextInt();

        System.out.println("Enter either of these char signs: +, -, *. /");
        char charSign = input.next().charAt(0);

        if (charSign == '+') {
            System.out.println(firstNumber + secondNumber);

        } else if (charSign == '-') {
            System.out.println(firstNumber - secondNumber);

        } else if (charSign == '*') {
            System.out.println(firstNumber * secondNumber);

        } else if (charSign == '/') {
            System.out.println(firstNumber / secondNumber);

        } else {
            System.out.println("Wrong input");
        }


        Scanner input = new Scanner(System.in);

        String userName = "Abc123";
        String password = "123456";

        System.out.println("Enter UserName");
        String userNameFromUser = input.nextLine();
        System.out.println("Enter password");
        String passwordFromUser = input.nextLine();

        if (userNameFromUser.equals(userName)) {
            System.out.println("Correct UserName");
        if (passwordFromUser.equals(password)) {
            System.out.println("You are Logged In");
        } else {
            System.out.println("Invalid user Password");
        }
    }else {
            System.out.println("Invalid Password");
        }

 */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int numberFromUser = input.nextInt();

        if (numberFromUser == 1) {
            System.out.println("Monday");

        } else if (numberFromUser == 2) {
            System.out.println("Tuesday");

        } else if (numberFromUser == 3) {
            System.out.println("Wednesday");

        } else if (numberFromUser == 4) {
            System.out.println("Thursday");

        } else if (numberFromUser == 5) {
            System.out.println("Friday");

        } else if (numberFromUser == 6) {
            System.out.println("Saturday");

        } else if (numberFromUser == 7) {
            System.out.println("Sunday");

        }else {
            System.out.println("Wrong input");
        }





    }
}

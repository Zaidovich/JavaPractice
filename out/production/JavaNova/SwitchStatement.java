import java.util.Random;
import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        //switch
/*
        int number = 2;

        switch (number) {

            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Invalid Number");
        }




        String day = "Monday";

        switch ( day ) {

            case "Monday":
                System.out.println("Today is " + day);
                break;
            case "Tuesday":
                System.out.println("Today is " + day);
                break;
            case "Wednesday":
                System.out.println("Today is " + day);
                break;
            case "Thursday":
                System.out.println("Today is " + day);
                break;
            case "Friday":
                System.out.println("Today is " + day);
                break;
            case "Saturday":
                System.out.println("Today is " + day);
                break;
            case "Sunday":
                System.out.println("Today is " + day);
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }

        int dayNumber = 1;

        switch (dayNumber) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }


         int monthNumber = 1;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

        String month = "December";

        switch ( month ) {

            case "December":
            case "January":
            case "February":
                System.out.println("This month is on Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("This month is on Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("This month is on Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("This month is on Fall");
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Enter month name: ");
        String monthName = input.nextLine();

        switch(monthName){

            case "December":
            case "January":
            case "February":
                System.out.println("This month is on Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("This month is on Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("This month is on Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.prqintln("This month is on Fall");
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your grade: ");
        char c = input.nextLine().charAt(0);

        switch (c) {
            case 'A':
            case 'a':
                System.out.println("Excellent!");
                break;
            case 'B':
            case 'b':
                System.out.println("Great!");
                break;
            case 'C':
            case 'c':
                System.out.println("Okay!");
                break;
            case 'D':
            case 'd':
                System.out.println("You can do better!");
                break;
            case 'F':
            case 'f':
                System.out.println("Something needs to change!");
                break;
            default:
                System.out.println("Invalid Grade");
                break;
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // 7 - 1 -7

        Random number = new Random();
        int randomInt = number.nextInt(14);
        if( randomInt >= 1 && randomInt <= 7){

            switch (randomInt){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }
        } else {
            System.out.println("Invalid");
        }


        Random number = new Random();
        int randomInt = number.nextInt();

 */
        Random number = new Random();
       // int randomInt = number.nextInt();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        var userNumber = input.nextInt();

        var randomNumber = number.nextInt(3);

        if (randomNumber == userNumber) {
            System.out.println(randomNumber + " You guessed right!");
        }else if (userNumber > randomNumber ){
            System.out.println(randomNumber + " Your guess is too high!");
        }else if (userNumber < randomNumber ) {
            System.out.println(randomNumber + " Your guess is too low");
        }else {
            System.out.println(randomNumber + " Game over try again!");
        }




    }
}

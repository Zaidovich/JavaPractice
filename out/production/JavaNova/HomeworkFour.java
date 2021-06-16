import java.util.*;

public class HomeworkFour {

    public static void main(String[] args) {

                        //Task 1

        Scanner input = new Scanner(System.in);
/*
        System.out.println("Enter your first number: ");
        int number1 = input.nextInt();

        System.out.println("Enter your second number: ");
        int number2 = input.nextInt();

        System.out.println("Enter your third number: ");
        int number3 = input.nextInt();

        System.out.println(number1 + number2 + number3);



                        //Task 2

        System.out.println("Enter your byte number: ");
        byte myByte = input.nextByte();

        System.out.println("Enter your short number: ");
        short myShort = input.nextShort();

        System.out.println("Enter your int number: ");
        int myInt = input.nextInt();

        System.out.println("Your byte number: " + myByte);
        System.out.println("Your short number: " + myShort);
        System.out.println("Your int number: " + myInt);
        System.out.println( ( myByte > myShort) && (myShort == myInt) && (myInt < myByte));

                        //Task3

        int number1, number2, number3, number4;

        System.out.println("Enter your first number: ");
        number1 = input.nextInt();

        System.out.println("Enter your second number: ");
        number2 = input.nextInt();

        System.out.println("Enter your third number: ");
        number3 = input.nextInt();

        System.out.println("Enter your fourth number: ");
        number4 = input.nextInt();

        if((number1 > number2) && (number1 > number3) && (number1 > number4))
        {
            System.out.println("\n The Largest Number = " + number1);
        }
        else if((number2 > number1) && (number2 > number3) && (number2 > number4))
        {
            System.out.println("\n The Largest Number = " + number2);
        }
            if((number3 > number1) && (number3 > number1) && (number3 > number4))
        {
                System.out.println("\n The Largest Number = " + number3);
        }
            if((number4 > number1) && (number4 > number2) && (number4 > number3))
        {
            System.out.println("The Largest Number = " + number4);
        }


                        //Task4

        Scanner inputData = new Scanner(System.in);

            System.out.print("Enter your first name and last name : ");
            String myName = inputData.nextLine();
            System.out.println("My full name is " + myName);

            System.out.println("Enter your age: ");
            String myAge = inputData.nextLine();
            System.out.println("My age is: " + myAge);

            System.out.println("Enter your favorite car: ");
            String myCar = inputData.nextLine();
            System.out.println("My favorite car is: " + myCar);

            System.out.println("How many languages do you speak?: ");
            String myLanguage = inputData.nextLine();
            System.out.println("I speak: " + myLanguage + " languages");

                            //Task5

            int miles = 1;
            float km = 1.60f;

            System.out.println("How many miles do you want to convert to km? : ");
            miles = input.nextInt();

            System.out.println("The the result: " + (miles * km) + "km");

                            //Task6

            int gallon = 1;
            float liter = 3.78f;

            System.out.println("How many gallons do you want to convert to liters? : ");
            gallon = input.nextInt();

            System.out.println("The the result: " + (gallon * liter) + "liters");
*/

                            //Task7

            System.out.println("Enter your seconds : ");
            int s = input.nextInt();

            int second = s % 60;
            int minute =(s / 60) % 60;
            int hour = (s/60) /60;

            System.out.println(hour + ":" + minute + ":" + second);
    }
}

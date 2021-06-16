import java.util.Locale;
import java.util.Scanner;

public class IfElseTHree {

    public static void main(String[] args) {
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int numberFromUser = input.nextInt();

        if (numberFromUser % 2 == 0){
            System.out.println("Even Number!");
        } else if (numberFromUser % 2 == 1) {
            System.out.println("Odd number! ");
        }

        int given = 2;

        if (given % 2 == 0){
            System.out.println("Even Number!");
        } else if (given % 2 == 1) {
            System.out.println("Odd Number! ");
        } else {
            System.out.println("Invalid number! ");
        }



        String cup1 = "Water";
        String cup2 = "Juice";
        String cup3 = cup1;
        cup1 = cup2;
        cup2 = cup3;

        System.out.println("Cup1 is holding Water " + cup1 );
        System.out.println("Cup1 is holding Juice " + cup2 );

       Scanner input = new Scanner(System.in);
        String Uppercase = "ABCD";
        String Lowercase = "abcd";




        Scanner input = new Scanner(System.in);

        System.out.println("Enter upper case text: ");
        String upperText = input.nextLine();
        upperText = upperText.toLowerCase();
        System.out.println(upperText);

        System.out.println("Enter lower case text: ");
        String LowerText = input.nextLine();
        LowerText = LowerText.toUpperCase();
        System.out.println(LowerText);

        System.out.println("Enter a text: ");
        String text = input.nextLine();

        System.out.println(text.length());

 */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a grade: ");
        int userGrade = input.nextInt();

        if (userGrade >= 90 && userGrade <= 100){
            System.out.println("You are an A student!");
        } else if (userGrade >= 80 && userGrade <= 90){
            System.out.println("You are an B student!");
        } else if (userGrade >= 70 && userGrade <= 80){
            System.out.println("You are an C student!");
        } else if (userGrade >= 60 && userGrade <= 70) {
            System.out.println("Come on you can do better!");
        } else {
            System.out.println("Invalid Grade - try again");
        }

    }
}

import java.util.*;

public class HomeworkFive {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        String myFullName = "Faridun Saidov";

        System.out.println("Enter your 1st class: ");
        String one = input.next();
        System.out.println("Enter your class grade: ");
        double grade1 = input.nextDouble();

        System.out.println("Enter your 2nd class: ");
        String two = input.next();
        System.out.println("Enter your class grade: ");
        double grade2 = input.nextDouble();

        System.out.println("Enter your 3rd class: ");
        String three = input.next();
        System.out.println("Enter your class grade: ");
        double grade3 = input.nextDouble();

        System.out.println("Enter your 4th class: ");
        String four = input.next();
        System.out.println("Enter your class grade: ");
        double grade4 = input.nextDouble();

        System.out.println(one + " - " + grade1 + ", " + two + " - " + grade2 + ", " + three + " - " + grade3 + ", " + four + " - " + grade4 + ".");

        double totalGrades = (grade1 + grade2 + grade3 + grade4) / 4;

        System.out.println("Your average score is: " + totalGrades);
        System.out.println("Thank You for using Grade Java Program from " + myFullName );
        System.out.println("Goodbye!");

    }
}

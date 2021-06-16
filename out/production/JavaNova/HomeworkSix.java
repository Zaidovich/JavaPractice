import java.util.Scanner;

public class HomeworkSix {

    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);

        System.out.println("Enter count for Senior citizens: ");
        int seniorCitizens = input.nextInt();
        ++ (seniorCitizens);

        System.out.println("Enter count for non Senior citizens: ");
        int nonSeniorCitizens = input.nextInt();
        ++ (nonSeniorCitizens);

        System.out.println("What is new citizens age? ");
        int userAge = input.nextInt();

        if (userAge >= 65){
            System.out.println("The new citizen is a Senior.");
            System.out.println("The new Senior Citizens count is: " + seniorCitizens);

        } else {
            System.out.println("The new citizen is a non-Senior Citizen.");
            System.out.println("The new non-Senior Citizen count is: " + nonSeniorCitizens);
        }

         */

        int seniorCitizens, nonSeniorCitizens, age;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter count for Senior citizens and non Senior Citizens: ");
        int countForCitizens = input.nextInt();

        System.out.println("What is new citizen's age?");
        int userAge = input.nextInt();

        if (userAge >= 65 ){
            System.out.println("Senior Citizen");
            ++ countForCitizens;
            System.out.println("New seniorCitizens count " + countForCitizens);
        } else {
            System.out.println("Non-Senior Citizen");
            ++ countForCitizens;
            System.out.println("New nonSeniorCitizens count " + countForCitizens);
        }

    }
}

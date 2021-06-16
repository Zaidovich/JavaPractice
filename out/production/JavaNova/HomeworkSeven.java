import java.util.Scanner;

public class HomeworkSeven {

    public static void main(String[] args) {
/*
                            // Task 1
        Scanner input = new Scanner(System.in);

        String monday = "Monday";
        String tuesday = "Tuesday";
        String wednesday = "Wednesday";
        String thursday = "Thursday";
        String friday = "Friday";
        String saturday = "Saturday";
        String sunday = "Sunday";

        System.out.println("Enter any day of the week: ");
        String textFromUser = input.nextLine();

        if (textFromUser.equals(monday)) {
            System.out.println("1");

        } else if (textFromUser.equals(tuesday)) {
            System.out.println("2");

        } else if (textFromUser.equals(wednesday)) {
            System.out.println("3");

        } else if (textFromUser.equals(thursday)) {
            System.out.println("4");

        } else if (textFromUser.equals(friday)) {
            System.out.println("5");

        } else if (textFromUser.equals(saturday)) {
            System.out.println("6");

        } else if (textFromUser.equals(sunday)) {
            System.out.println("7");

        }else {
            System.out.println("Wrong input");
        }

 */

                                //Task 2

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Status Code: ");
        int numberFromUser = input.nextInt();

        if (numberFromUser == 200) {
            System.out.println("OK");

        } else if (numberFromUser == 201) {
            System.out.println("Created");

        } else if (numberFromUser == 202) {
            System.out.println("Accepted");

        } else if (numberFromUser == 301) {
            System.out.println("Moved Permanently");

        } else if (numberFromUser == 303) {
            System.out.println("See Other");

        } else if (numberFromUser == 304) {
            System.out.println("Not Modified");

        } else if (numberFromUser == 307) {
            System.out.println("Temporary Redirect");

        } else if (numberFromUser == 400) {
            System.out.println("Bad Result");

        } else if (numberFromUser == 401) {
            System.out.println("Unauthorized");

        } else if (numberFromUser == 403) {
            System.out.println("Forbidden");

        } else if (numberFromUser == 404) {
            System.out.println("Not Found");

        } else if (numberFromUser == 410) {
            System.out.println("Gone");

        } else if (numberFromUser == 500) {
            System.out.println("Internal Server Revenue");

        } else if (numberFromUser == 503) {
            System.out.println("Service Unavailable");

        }else {
            System.out.println("Invalid Status Code");
        }



    }
}

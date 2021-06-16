import java.util.Scanner;

public class HomeworkEight {
                                    //Task 1
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter loan type:");
        String loanType = input.nextLine();

        System.out.println("Enter sub loan type:");
        String subLoan = input.nextLine();

        if (loanType.equals("Credit Cards")) {
            System.out.println("You chose Credit Cards loan!");
            if (subLoan.equals("Visa Platinum")) {
                System.out.println("You choose Visa Platinum!");
            } else if (subLoan.equals("Visa Platinum Rewards")) {
                System.out.println("You choose Visa Platinum Rewards!");
            } else if (subLoan.equals("Visa Signature")) {
                System.out.println("You choose Visa Signature!");
            } else {
                System.out.println("This sub load is invalid ");
            }
        } else if (loanType.equals("Vehicle Loans")) {
            System.out.println("You choose Vehicle Loans!");
            if (subLoan.equals("Auto Loans")) {
                System.out.println("You chose Auto Loans!");
            } else if (subLoan.equals("Car Buying Service")) {
                System.out.println("You chose Car Buying Service!");
            } else if (subLoan.equals("Vehicle Service Program")) {
                System.out.println("You chose Vehicle Service Program!");
            } else if (subLoan.equals("RV Loans")) {
                System.out.println("You chose RV Loans!");
            } else {
                System.out.println("This sub load is invalid ");
            }
        } else if (loanType.equals("Home Loans")) {
            System.out.println("You chose Home Loans!");
            if (subLoan.equals("Mortgages")) {
                System.out.println("You chose Mortgages!");
            } else if (subLoan.equals("Home Equity Line of Credit")) {
                System.out.println("You chose Home Equity Line of Credit!");
            } else {
                System.out.println("This sub load is invalid");
            }
        } else if (loanType.equals("Personal Loans")) {
            System.out.println("You chose Personal Loans!");
            if (subLoan.equals("Personal Loans")) {
                System.out.println("You chose Personal Loans!");
                System.out.println("You chose as a Subloan Personal Loans!");
            } else {
                System.out.println("This sub load is invalid");
            }
        } else if (loanType.equals("Commercial Real Estate")) {
            System.out.println("You Chose Commercial Real Estate!");
            System.out.println("You chose as a Subloan Type Commercial Real Estate!");
        } else {
            System.out.println("This sub load is invalid");
        }

/*
                                        //Task 2

        String userName = "Faridun";
        String password = "Saidov";

        System.out.println("Enter Username:");
        String userNameFromUser = input.nextLine();

        if (userNameFromUser.equals(userName)) {
            System.out.println("Enter Password:");
            String passwordFromUser = input.nextLine();
            if (passwordFromUser.equals(password)) {
                System.out.println("Log in successful!");
            } else {
                System.out.println("Invalid Password!");
            }
        }else {
            System.out.println("Invalid Username!");
        }

                                //Task 3

        System.out.println("Enter a number: ");
        int numberFromUser = input.nextInt();

        if (numberFromUser == 1) {
            System.out.println("January");

        } else if (numberFromUser == 2) {
            System.out.println("February");

        } else if (numberFromUser == 3) {
            System.out.println("March");

        } else if (numberFromUser == 4) {
            System.out.println("April");

        } else if (numberFromUser == 5) {
            System.out.println("May");

        } else if (numberFromUser == 6) {
            System.out.println("June");

        } else if (numberFromUser == 7) {
            System.out.println("July");

        } else if (numberFromUser == 8) {
            System.out.println("August");

        } else if (numberFromUser == 9) {
            System.out.println("September");

        } else if (numberFromUser == 10) {
            System.out.println("October");

        } else if (numberFromUser == 11) {
            System.out.println("November");

        } else if (numberFromUser == 12) {
            System.out.println("December");

        }else {
            System.out.println("Invalid month number!");
        }

 */

    }
}

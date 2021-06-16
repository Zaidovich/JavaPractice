import java.util.Scanner;

public class Tyr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter loan type");
        String loanType = input.nextLine();
        System.out.println("Enter sub loan type");
        String subLoan = input.nextLine();
        if (loanType.equals("Visa")) {
            System.out.println("You choose Visa loan");
            if (subLoan.equals("Visa Platinum")) {
                System.out.println("You choose Visa Platinum");
            } else if (subLoan.equals("Visa Platinum Rewards")) {
                System.out.println("You choose Visa Platinum Rewards");
            } else if (subLoan.equals("Visa Signature")) {
                System.out.println("You choose Visa Signature");
            } else {
                System.out.println("This sub load is invalid ");
            }
        } else if (loanType.equals("Auto")) {
            if (subLoan.equals("New Auto Loan")) {
                System.out.println("Sub loan type is New Auto Loan");
            } else if (subLoan.equals("RV")) {
                System.out.println("You chose RV loans");
            } else if (subLoan.equals("Buying Service")) {
                System.out.println("You chose Car Buying Service");
            } else if (subLoan.equals("Service Program")) {
                System.out.println("You chose Vehicle Service Program");
            } else {
                System.out.println(" This subloan is invalid");
            }
        }else if (loanType.equals("Home")){
            System.out.println("You chose Home Loans");
            if (subLoan.equals("Mortgages")){
                System.out.println("You chose Motgages from subloan");
            }else if(subLoan.equals("Home Equity Line")){
                System.out.println(" You chose Home Equity Line Credit");
            }else {
                System.out.println("This subloan is invalid");
            }
        }else if (loanType.equals("Personal")){
            System.out.println("You chose Personal Loans");
        }else if (loanType.equals("Commercial")){
            System.out.println("You chose Commericial Real Estate");
        }else {
            System.out.println("Invalid loan type");
        }
    }
}

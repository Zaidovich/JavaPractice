import java.util.*;

public class OperatorsDay1 {

    public static void main(String[] args) {
        

        Scanner inputDate = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String myName = inputDate.nextLine();
        System.out.println("My name is " + myName);

        System.out.print("Enter your age : ");
        int myAge = inputDate.nextInt();
        System.out.println("I am " + myAge);

        System.out.println("Enter a price : ");
        float myFloatNumber = inputDate.nextFloat();
        System.out.println("Float number is : " + myFloatNumber);

        System.out.println("Enter a double : ");
        double myDoubleNumber = inputDate.nextDouble();
        System.out.println("My double is : " + myDoubleNumber);

        System.out.println("Enter a long : ");
        long myLongNumber = inputDate.nextLong();
        System.out.println("My long is : " + myLongNumber);

        System.out.println("Enter a boolean : ");
        boolean myBooleanNumber = inputDate.nextBoolean();
        System.out.println("My Boolean is : " + myBooleanNumber);

        System.out.println("What is your char? : ");
        char c= inputDate.next().charAt(0);
        System.out.println("My Char is : " + c);

        inputDate.close();



    }
}

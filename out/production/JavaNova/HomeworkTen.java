import java.util.Scanner;

public class HomeworkTen {

    public static void main(String[] args) {
/*
        //Task 1
        for (int x = 1; x <= 10; x++) {
            System.out.print(x);
        }

        //Task2

        int x = 1;
        long tot = 1;

        while (x < 10) {
            x += 1;
            tot += x;
            System.out.println("Number : " + x + " sum = " + tot);
        }

 */

        //Task4
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int firstNum = input.nextInt();

        System.out.println("Enter your second number: ");
        int secondNum = input.nextInt();
        int i = 1;
        int total = firstNum + secondNum;
        do{
            System.out.println(firstNum + secondNum);
            i ++;

        }while(firstNum == secondNum);
    }
}

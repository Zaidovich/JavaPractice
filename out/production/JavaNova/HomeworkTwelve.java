import java.util.Scanner;

public class HomeworkTwelve {

    public static void main(String[] args) {
                                    // Task 1
          /*  int a, b, c, d;
            a = 10;
            b = 20;
            c = a;
            d = b;

            System.out.println("c is holding the value of " + c );
            System.out.println("d is holding the value of " + d );
            }

                                        //Task 2
            int number1 = 10;
            int number2 = 20;

            System.out.println("The actual valued stored for number1 is: " + number1);
            System.out.println("The actual valued stored for number2 is: " + number2);

            number1++;
            number2++;

            System.out.println("number1 swapped to: " + number1);
            System.out.println("number2 swapped to: " + number2);

                                    //Task 3

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a character : ");
            char fromUser = scanner.next().charAt(0);

            scanner.close();

            if (fromUser == 'a' || fromUser == 'e' || fromUser == 'i' || fromUser == 'o' || fromUser == 'u' || fromUser == 'A' || fromUser == 'E' || fromUser == 'I' || fromUser == 'O' || fromUser == 'U') {
                System.out.println(fromUser + " is vowel");
            } else if ((fromUser >= 'a' && fromUser <= 'z') || (fromUser >= 'A' && fromUser <= 'Z')) {
                System.out.println(fromUser + " is consonant");
            } else {
                System.out.println(fromUser + " is not an alphabet");
            }

                                //Task 4

            boolean isVowel = false;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a character : ");
            char fromUser = scanner.next().charAt(0);

            scanner.close();

            switch (fromUser) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    isVowel = true;
            }
            if (isVowel == true) {
                System.out.println(fromUser + " is  a Vowel");
            } else {
                if ((fromUser >= 'a' && fromUser <= 'z') || (fromUser >= 'A' && fromUser <= 'Z'))
                    System.out.println(fromUser + " is a Consonant");
                else
                    System.out.println(fromUser + " is not an alphabet");
            }

                            //Task5

            String str;
            int vowCount=0,consCount=0;
            Scanner scan=new Scanner(System.in);

            System.out.println("Enter the String for count vowel and consonant  ");
            str=scan.nextLine();
            int i=0;
            do{
                char ch=str.charAt(i);
                if(ch == 97|| ch == 101|| ch == 105|| ch == 111|| ch == 117
                        ||ch == 65|| ch == 69|| ch == 73|| ch == 79|| ch == 85 ){
                    vowCount++;
                }
                else if((ch >= 97 && ch <= 122 || ch >= 65 && ch <= 90 )){
                    consCount++;
                }
                i++;
            }while(i<str.length());
            System.out.println("The number of vowels: "+vowCount);
            System.out.println("The number of consonant: "+consCount);

                                //Task6

            int year = 1996;
            boolean leap = false;

            if (year % 4 == 0) {

                if (year % 100 == 0) {

                    if (year % 400 == 0)
                        leap = true;
                    else
                        leap = false;
                }

                else
                    leap = true;
            }

            else
                leap = false;

            if (leap)
                System.out.println(year + " is a leap year.");
            else
                System.out.println(year + " is not a leap year.");

                                        //Task 7

            String str, rev = "";
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a string:");
            str = sc.nextLine();

            int length = str.length();

            for ( int i = length - 1; i >= 0; i-- )
                rev = rev + str.charAt(i);

            if (str.equals(rev))
                System.out.println(str+" is a palindrome");
            else
                System.out.println(str+" is not a palindrome");*/
    }
}
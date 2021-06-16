import java.util.Random;
import java.util.Scanner;

public class HomeworkNine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
/*
                            //Task1
        System.out.println("Enter a word: ");
        var userWord = input.nextLine();

        if (userWord.length() <= 5 && userWord.length() > 1) {
            System.out.println("Your word is short!");
        } else if (userWord.length() <= 10 && userWord.length() >= 5) {
            System.out.println("Your word is medium!");
        } else if (userWord.length() <= 15 && userWord.length() >= 10) {
            System.out.println("Your word is long!");
        }  else if (userWord.length() > 15) {
            System.out.println("Your word is super long!");
        }  else if (userWord.length() <= 1) {
            System.out.println("This is a char!");
        } else {
            System.out.println("Invalid word");
        }

                            //Task2
        System.out.println("Enter a char: ");
        var userChar = input.nextLine().charAt(0);

        if (userChar >= 'A' && userChar <= 'Z') {
            System.out.println("Uppercase char!");
        } else if (userChar>= 'a' && userChar <= 'z'){
            System.out.println("Lowercase char!");
        }else {
            System.out.println("Its not a char letter!");
        }
*/
                            //Task3
        System.out.println("Enter a char: ");
        var vowelChar = input.nextLine().charAt(0);
        if ( (vowelChar == 'A' && vowelChar == 'Z') || (vowelChar == 'a' && vowelChar == 'z') ){
            if(vowelChar == 'A' || vowelChar == 'a'){
                System.out.println("This is a vowel!");
            }
        }
            switch (vowelChar) {
                case 'A':
                case 'a':
                    System.out.println(vowelChar + " is a vowel letter.");
                    break;
                case 'E':
                case 'e':
                    System.out.println(vowelChar + " is a vowel letter");
                    break;
                case 'I':
                case 'i':
                    System.out.println(vowelChar + " is a vowel letter.");
                    break;
                case 'O':
                case 'o':
                    System.out.println(vowelChar + " is a vowel letter.");
                    break;
                case 'U':
                case 'u':
                    System.out.println(vowelChar + " is a vowel letter.");
                    break;
                default:
                    System.out.println("This letter is not a vowel!");
                    break;
        }
        //if(vowelChar !='A' && vowelChar != 'a' && vowelChar != 'E' && vowelChar != 'e' && vowelChar != 'I' && vowelChar != 'i' && vowelChar != 'O' && vowelChar != 'o' && vowelChar != 'U' && vowelChar != 'u'){
            System.out.println("This is not a letter!");
        //}
/*
                                //Task 4
        Random number = new Random();

        int randomInt = number.nextInt(100);
        if (randomInt >= 0 && randomInt <= 5) {
            System.out.println(randomInt + " years old. You are a baby!");
        } else if (randomInt >= 6 && randomInt <= 12) {
            System.out.println(randomInt + " years old. You are a little child!");
        } else if (randomInt >= 13 && randomInt <= 19) {
            System.out.println(randomInt + " years old. You are a teenager!");
        } else if (randomInt >= 20 && randomInt <= 50) {
            System.out.println(randomInt + " years old. You are an adult!");
        } else if (randomInt >= 50 && randomInt <= 100) {
            System.out.println(randomInt + " years old. You are a Senior person!");
        }
 */
    }
}

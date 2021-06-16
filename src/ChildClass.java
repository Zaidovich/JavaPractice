import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;

public class ChildClass {

    public static void main(String[] args) {

       /* JavaMethods x = new JavaMethods();

        x.printFromTo(1, 10);
        x.vowel('a');
        x.printName("Faridun", "Saidov");
*/
/*

        Utils y = new Utils();

        int result = y.check2Nums(2,3);

        System.out.println(result);
*/


        JavaVarArgsClass x = new JavaVarArgsClass();

        String name = x.printNames("K", "N", "A", "B", " XDSDSDAFSF");

        int result = x.add3Nums(3,2,3,44,45,33);

        int a = x.addNums("Result: ", 2,2,10,4,33);

        int c = x.calculateNums('+', 1, 4);

        /*LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);*/
    }
}

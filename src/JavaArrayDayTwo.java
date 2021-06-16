import java.util.Arrays;
import java.util.Locale;

public class JavaArrayDayTwo {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        String newArr = Arrays.toString(nums);
        //  System.out.println(newArr);

        char[] charArr = {'a', 'b', 'c'};

        String charArrS = Arrays.toString(charArr);

        // System.out.println(charArrS.toUpperCase());


        int[] num = {2, 4, 5, 12, 44, 66};
        int maxNum = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > maxNum) {
                maxNum = num[i];
            }
        }
        //System.out.println("Max number is: " + maxNum);

        int[] numb = {5, 4, 3, 2, 1};

        Arrays.sort(num);

        //System.out.println(num[num.length-1]);

        for (int x : num) {
            //System.out.println(x + ", ");
        }

        char abc[] = {'v', 'q', 'd', 'z', 'f', 'e', 'm'};

        Arrays.sort(abc);
        String c = Arrays.toString(abc);
        //System.out.println(c.toUpperCase());

        // for (char p: abc){
        //System.out.print(p + ", ");
    //}


        int [] a = {10, 20, 30, 40};
        int [] b = {10, 20, 30, 40,1};

       //boolean res = Arrays.equals(a,b);

        //System.out.println(res);

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                System.out.println("Same Arr");
            } else {
                System.out.println("Not Same");
            }
        }









    }
}

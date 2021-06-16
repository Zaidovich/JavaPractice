

public class JavaArrayDay1 {

    public static void main(String[] args) {

        /*int [] x = new int [7];

        // index --> starts from 0...

        x[0] = 2;
        x[1] = 5;
        x[2] = 7;
        x[3] = 4;
        x[4] = x[1] + x[2];

        System.out.println(x [3] + " " + x[2]);
        System.out.println(x.length);
        System.out.println(x[6]);*/

        /*String [] str = new String [7];

        str[0] = "Monday";
        str[1] = "Tuesday";
        str[2] = "Wednesday";
        str[3] = "Thursday";
        str[4] = "Friday";
        str[5] = "Saturday";
        str[6] = "Sunday";

        System.out.println(str[4]);*/

        /*String [] days = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        System.out.println(days [3]);
*/
        /*String [] colors = {
                "Red",
                "Blue",
                "Orange",
                "Yellow",
                "Pink",
                "White",
                "Black",
                "Green",
                "Brown",
                "Neon",
        };

        System.out.println(colors [0]);
        System.out.println(colors [1]);
        System.out.println(colors [2]);
        System.out.println(colors [3]);
        System.out.println(colors [4]);
        System.out.println(colors [5]);
        System.out.println(colors [6]);
        System.out.println(colors [7]);
        System.out.println(colors [8]);
        System.out.println(colors [9]);

        String [] colors2 = new String [10];

        colors2[0] = "Red";
        colors2[1] = "Blue";
        colors2[2] =  "Orange";
        colors2[3] = "Yellow";
        colors2[4] = "Pink";
        colors2[5] = "White";
        colors2[6] = "Black";
        colors2[7] = "Green";
        colors2[8] = "Brown";
        colors2[9] = "Neon";

        System.out.println(colors2 [0]);
        System.out.println(colors2 [1]);
        System.out.println(colors2 [2]);
        System.out.println(colors2 [3]);
        System.out.println(colors2 [4]);
        System.out.println(colors2 [5]);
        System.out.println(colors2 [6]);
        System.out.println(colors2 [7]);
        System.out.println(colors2 [8]);
        System.out.println(colors2 [9]);*/

/*

        String [] colors = {
                "Red",
                "Blue",
                "Orange",
                "Yellow",
                "Pink",
                "White",
                "Black",
                "Green",
                "Brown",
                "Neon",
        };

        for( int i = 0; i < colors.length; i++){

          //  System.out.println(colors[i]);
        }

        for( int i = colors.length -1; i >= 0; i--){
           System.out.println(colors[i]);
        }

        for( String el : colors){
           // System.out.println(el);
        }

        //colors [0] = "Holiday";
        //System.out.println(colors[0]);
*/


        char [] c = new char[3];
        c[0] = 'a';
        c[1] = 'b';
        c[2] = 'c';

        for(int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }

        for(char d : c){
            System.out.println(d);
        }

        char[] c2 = {'a', 'b', 'c'};

        int j = 0;
        while (j < c2.length){
            System.out.println(c[j]);
            j++;
        }

        for(int i = 0; i < c2.length; i++){
            System.out.print(c2 [i]);
        }

        for (char w : c2) {
            System.out.print(w);
        }

        //reg for loop


    }
}




public class ForInnerLoop {

    public static void main(String[] args) {
/*
        //outer lopp
        for( int i = 1; i <= 5; i++) {

            //inner loop
            for (int j = 1; j <= 5; j++){
                System.out.println("Outer Loop " + i + " " + "Inner Loop " + j );

            }

        }

        int i = 1;

        while (i <= 3) {

            System.out.println(i + "Inner Loop");

            for (int j = 1; j <= 3; j++) {

                System.out.println(j + " Outer Loop");
            }

            i++;

        }



        for (int i = 1; i < 2; i ++){

            System.out.println("Week " + i);

            for (int j = 1; j <= 7; j++) {

                System.out.println(" Day: " + j);
            }

        }

        for(int i = 1; i <= 5; i++){

            for(int j = 5; j <= i; j++){

                System.out.println(" * ");
            }

            System.out.println("");
        }

        for(int i = 5; i >= 1; i--){

            for(int j = 1; j >= i; j++){

                System.out.println(j + " * ");
            }

            System.out.println("");
        }



        for(int i = 1; i <= 3; i++){

            System.out.println(i + " OUTER");

            for(int j = 1; j <= 3; j++){
                System.out.println(j + " INNER");
            }
        }

        */

  /*      char a;

        for(a = 'A'; a <= 'Z'; a++){
            System.out.print(a);
        }
    */
/*
        int num = 5;

        for(int i = 1; i <= 10; i++){

            System.out.println(num + " * " + i + " = " + num * i);

        }*/
       /* int i = 1;
        for (i = 1; i<= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
*/
       //break

      /* for(int i =1; i<= 10; i++){

           if(i == 5){
              // break;
               continue;
           }
           System.out.println(i);
       }*/
/*
       char a;
       for(a = 'A'; a <= 'F'; a++){
           if(a == 'D'){
               continue;
           }
           System.out.println(a);
       }*/

       String str = "ABCDEF";

       for(int i = 0; i <= str.length(); i++ ){

           if(str.charAt(i) == 'D') {
               continue;
           }
           System.out.println(str.charAt(i));
       }
    }
}
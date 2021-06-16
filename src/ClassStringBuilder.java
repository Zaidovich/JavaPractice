import java.util.Locale;

public class ClassStringBuilder {

    public static void main(String[] args) {

        //append(); method adds string values like +
        StringBuilder text = new StringBuilder("Hello");
       /* text.append(" World!");
        text.append(" Bye World!");
        text.append(" Loop World!");
        text.append(" Append World!");

        System.out.println(text);*/

        //deleteCharAt(); deletes a character from given index

       /* text.deleteCharAt(2);
        text.deleteCharAt(0).deleteCharAt(1);
        System.out.println(text);*/

        //Task 1

        StringBuilder name = new StringBuilder("Faridun");
        name.append(" Saidov.");
        /*

        name.deleteCharAt(0);
        name.deleteCharAt(7);

        System.out.println(name);*/

        //delete(); deletes from one index to the next

        /*name.delete(0,8);
        name.delete(0,4);
        name.insert(0, "Faridun Said");

        System.out.println(name);*/

        //reverse(); reverses value

  /*      StringBuilder str = new StringBuilder("Java");
        str.reverse();
        String strS = str.toString().toUpperCase();
        System.out.println(strS);*/

        //Task
        /*String abc = "ABC";
        StringBuilder letters = new StringBuilder(abc);

        System.out.println(abc);
        System.out.println(letters.reverse());*/

        //insert(); insert a string anywhere by entering index.
        StringBuilder myName = new StringBuilder("vodiaS");
        myName.reverse();
        myName.insert(0, "Faridun ");

        System.out.println(myName);





    }
}

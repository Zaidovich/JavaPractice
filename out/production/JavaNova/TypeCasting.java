

public class TypeCasting {


    public static void main(String[] args) {


        System.out.println("Hello");
        //byte variable
        byte myByteValue = 5;

        //converting into int
        int myIntValue = myByteValue;

        int myIntValue1 = 10;

        double myDoubleValue = myIntValue1;

        short myShortValue = 30;
        float myFloatValue = myShortValue;

        byte myByteValue1 = 2;
        float myFloatValue2 = myByteValue1;

        //large into small type

        int myNumber = 5;
        short myShortNumber = (short) myNumber;

        float myFloatNumber = 9.99f;
        int myIntNumber = (int) myFloatNumber;

        double myDoubleNumber = 355.25d;
        byte myByteNumber2 = (byte) myDoubleNumber;


        System.out.println(myByteNumber2);



    }

}

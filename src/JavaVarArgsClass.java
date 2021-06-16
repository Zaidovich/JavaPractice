public class JavaVarArgsClass {

    public static int addNums(int a , int b){
        return a + b;
    }
    public static int add3Nums(int a, int b, int c){
        return a+b+c;
    }
    public static String printName(String a, String b){
        return a + " " + b;
    }
    public static String printNames(String ... args){
        String result2 = "";
        for(int i=0; i<args.length; i++){
            result2 += args[i];
        }
        return result2;
    }
    public static int add3Nums(int ... args) {
        int result = 0;
        for(int i=0; i<args.length; i++){
            result += args[i];
        }
        return result;
    }
    public static int addNums(String a, int ... args){
        int result = 0;
        for(int i=0; i<args.length; i++){
            result += args[i];
        }
        return result;
    }
    //varargs
    public static int addNumbers(int ... args){
        int result = 0;
        for (int z : args ){
            result += z;
        }
        return result;
    }

    public static int calculateNums(char x, int ... args){

        int result = 0;
        switch(x){
            case '+':
                for(int i=0; i<args.length; i++){
                    result += args[i];
                }
                return result;

            case '-':
                for(int i = 0; i< args.length; i++){
                    result -= args[i];
                }
                return result;

            case '*':
                for(int i = 0; i< args.length; i++){
                    result *= args[i];
                }
                return result;

        }
        return result;


    }
}
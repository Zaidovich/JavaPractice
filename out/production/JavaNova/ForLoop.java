

public class ForLoop {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            System.out.println(i+ " Hello");
        }
        //Task
        for(int i = 15; i >= 1; i--) {
            System.out.print(i);
        }
        //Task
        for (int i =2; i<= 10; i += 2){
            System.out.println(i);
        }
        //Task
        for (int i = 0; i <= 10; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
        //Task
        String x = "Hello";
        for(int i = 0; i <= x.length(); i++){
            if(x.charAt(i) == 'l'){
                System.out.println(x);
            }
            System.out.println(x);
        }
                    //Task
        for (int i = 10; i <= 100; i+=10){
            System.out.print(i);
        }
        //Task
        for (int i = 200; i >= 150; i-=5){
            System.out.println(i);
        }

    }
}
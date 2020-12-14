package co.com.daleb.functional.firstlambdas;

/*public class LambdaExample1 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t = new Thread(runnable);
        t.start();
    }
}*/

/*
 public class LambdaExample1 {
     public static void main(String[] args) {
         Thread t = new Thread(new Runnable() {
             @Override
             public void run() {
                 System.out.println("Thread executed by anonymous class");
             }
         });
         t.start();
     }
 }
*/

/*Lambdas in interfaces can only used when the interface has only one abstract method*/
public class LambdaExample1 {
    public static void main(String[] args) {
        Thread t = new Thread( () -> System.out.println("Thread executed by anonymous class") );
           t.start();
    }
}

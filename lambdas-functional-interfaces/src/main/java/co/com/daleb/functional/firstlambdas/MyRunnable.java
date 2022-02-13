package co.com.daleb.functional.firstlambdas;

/*This is the way before java 8*/
public class MyRunnable implements Runnable {

  @Override
  public void run() {
    System.out.println("Thread executed");
  }
}

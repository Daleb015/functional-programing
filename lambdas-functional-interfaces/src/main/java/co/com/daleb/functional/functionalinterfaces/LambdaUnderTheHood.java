package co.com.daleb.functional.functionalinterfaces;

public class LambdaUnderTheHood {

  public static void main(String[] args) {
    /*                MyFunctionalInterface myFunctionalInterface = new MyFunctionalInterface() {
                    @Override
                    public void myMethod() {
                        System.out.println("Implementacion 1");
                    }
                };

                MyFunctionalInterface myFunctionalInterface1 = new MyFunctionalInterface() {
                    @Override
                    public void myMethod() {
                        System.out.println("Implementacion 2");
                    }
                };*/

    MyFunctionalInterface myFunctionalInterface = () -> System.out.println("Implementacion 3");

    myFunctionalInterface.myMethod();
  }
}

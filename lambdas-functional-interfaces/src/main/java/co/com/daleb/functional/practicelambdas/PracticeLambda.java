package co.com.daleb.functional.practicelambdas;

public class PracticeLambda {

  public static void main(String[] args) {
    /*Just one argument, a one line body*/
    IName iName = () -> System.out.println("Hola ");

    iName.myName();

    /*Two arguments, one line body*/
    IMathOperation sume = (a, b) -> System.out.println(a + b);

    sume.operate(3, 5);

    IMathOperation multiply = (a, b) -> System.out.println(a * b);

    multiply.operate(5, 3);

    IMathOperation minus = (a, b) -> System.out.println(a - b);

    minus.operate(12, 3);

    /*One argument and a return*/
    LengthOfString lengthOfString = w -> w.length();

    System.out.println(lengthOfString.lenght("Prueba Palabra"));

    /*Multiple statement body declarations*/
    LengthOfString lengthOfString2 = w -> {
      int length = w.length();
      System.out.println(length);
      return length;
    };

    lengthOfString2.lenght("La otra palabra");
  }
}

package co.com.daleb.functional.FunctionaTheory;

public class PureFunction {

  public static void main(String[] args) {}

  // This is a pure function, does not modify any state outside the function,
  // it will return the same result for the same arguments always.
  int sum(int a, int b) {
    return a + b;
  }
}

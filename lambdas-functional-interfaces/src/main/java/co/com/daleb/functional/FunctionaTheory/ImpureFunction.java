package co.com.daleb.functional.FunctionaTheory;

public class ImpureFunction {

  private int value = 0;

  // This isn´t a pure function, because it can return different result because depends on the private field,
  // also this change the state of the class modifying the attribute
  public int add(int nextValue) {
    this.value += nextValue;
    return this.value;
  }
}

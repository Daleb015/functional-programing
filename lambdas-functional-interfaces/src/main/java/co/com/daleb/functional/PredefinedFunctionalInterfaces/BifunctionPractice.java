package co.com.daleb.functional.PredefinedFunctionalInterfaces;

import java.util.function.BiFunction;

public class BifunctionPractice {

  public static void main(String[] args) {
    BiFunction<String, String, String> biFunc = (a, b) -> a + b;
    System.out.println(biFunc.apply("Daniel", " Lineros"));
    BiFunction<String, String, Integer> biFunc2 = (a, b) -> (a + b).length();
  }
}

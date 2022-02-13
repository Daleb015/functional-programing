package co.com.daleb.functional.functionaltechniques;

import java.util.function.Function;

public class Currying {

  public static void main(String[] args) {
    Function<Integer, Function<Integer, Integer>> fun1 = u -> v -> u + v;

    //Integer sum = fun1.apply(1).apply(2);

    Function<Integer, Integer> fun2 = fun1.apply(1);

    Integer sum = fun2.apply(2);
    Integer sum2 = fun2.apply(3);
    Integer sum3 = fun2.apply(4);

    System.out.println(sum);
    System.out.println(sum2);
    System.out.println(sum3);
  }
}

package co.com.daleb.functional.PredefinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOpPractice {

  public static void main(String[] args) {
    List<Integer> list = List.of(10, 20, 30, 40, 80);
    UnaryOperator<Integer> operator = i -> i * 100;

    List<Integer> newList = mapper(list, operator);

    System.out.println(newList);
  }

  private static <T> List<T> mapper(List<T> list, UnaryOperator<T> operator) {
    List<T> newList = new ArrayList<>();

    for (T t : list) {
      newList.add(operator.apply(t));
    }

    return newList;
  }
}

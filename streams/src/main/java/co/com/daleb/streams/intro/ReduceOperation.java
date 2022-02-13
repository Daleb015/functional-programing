package co.com.daleb.streams.intro;

import java.util.stream.Stream;

public class ReduceOperation {

  public static void main(String[] args) {
    Integer sum = Stream.of(1, 2, 34, 56, 76, 87, 89, 90).reduce(0, (a, b) -> a + b);

    //The first argument of the reduce is called identity and has to be a value that do not modify
    //the values if added
    // for sum use the zero 0
    // for multiply use one 1

    System.out.println(sum);
  }
}

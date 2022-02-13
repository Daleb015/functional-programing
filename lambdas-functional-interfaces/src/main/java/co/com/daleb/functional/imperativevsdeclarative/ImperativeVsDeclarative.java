package co.com.daleb.functional.imperativevsdeclarative;

import java.util.Optional;
import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

  public static void main(String[] args) {
    Integer id = 15;
    Optional.of(id).ifPresent(System.out::println);

    // Imperative

    int sumEvents = 0;

    for (int i = 0; i <= 100; i++) {
      if (i % 2 == 0) {
        sumEvents = sumEvents + i;
      }
    }
    /* Declarative */

    IntStream
      .rangeClosed(0, 100)
      .filter(x -> x % 2 == 0)
      .reduce(Integer::sum)
      .ifPresent(x -> System.out.printf("%d%n", x));
  }
}

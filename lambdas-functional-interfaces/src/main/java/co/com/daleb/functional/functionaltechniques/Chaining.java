package co.com.daleb.functional.functionaltechniques;

import java.util.function.Function;

public class Chaining {

  public static void main(String[] args) {
    Consumer<String> consumer = s -> System.out.println(s);

    Consumer<String> consumer2 = s -> System.out.println(s);

    consumer.accept("Hello");
    consumer2.accept("Hello");

    Consumer<String> consumer3 = s -> {
      consumer.accept(s);
      consumer2.accept(s);
    };

    consumer3.accept("Hello");

    // At this point we are no using chaining operation.

    Consumer<String> c4 = consumer.thenAccept(consumer2);
    c4.accept("Basic Strong");

    // The function interface has his own default chaining method

    Function<Integer, Integer> f1 = s -> s + 2;
    Function<Integer, Integer> f2 = s -> s * 2;
    Function<Integer, Integer> f3 = f1.andThen(f2);
    System.out.println(f3.apply(10));
  }
}

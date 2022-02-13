package co.com.daleb.streams.intro;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Calculations {

  public static void main(String[] args) {
    // IntStream
    // DoubleStream
    // LongStream

    // Sum

    int sum = IntStream.of(1, 2, 3).sum();

    System.out.println(sum);

    // Max Optional : primitive

    OptionalInt maxOptiuonal = IntStream.of(1, 2, 3).max();

    System.out.println(maxOptiuonal.orElseGet(() -> 0));

    // Min Optional : primitive

    OptionalInt minOptional = IntStream.of(1, 2, 3).min();

    System.out.println(minOptional.getAsInt());

    // Average() Optional Primitive

    OptionalDouble average = IntStream.of(1, 2, 3, 4).average();

    System.out.println(average.getAsDouble());

    // SumaryStatistics()

    IntSummaryStatistics intSummaryStatistics = IntStream.of(1, 2, 3, 4).summaryStatistics();

    System.out.println(intSummaryStatistics);
  }
}

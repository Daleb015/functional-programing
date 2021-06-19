package co.com.daleb.streams.intro;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NumericStreams {
    public static void main(String[] args) {

        List<Book> list = new ArrayList<>();
        list.add(new Book("The alchemist","Paulo Cohelo","Adventure",4.408789));
        list.add(new Book("The Notebook","Nicholas Sparks","Romance",4.10));
        list.add(new Book("Horror Cocktail","Robert Bloch","Horror",2.67));
        list.add(new Book("House of lives","Mark z, Danielewski","Horror",4.10908908));

        OptionalDouble average = list.stream()
                .map(book -> book.getRating())
                .mapToDouble(rating -> rating)
                .average();

        System.out.println(average.getAsDouble());

        // map is used with object, make boxing to generate stream of object, like Integer
        // mapToDouble is used with primitives, to improve performance, like double

        IntStream intS = IntStream.of(1,3,5,8);
        DoubleStream doubleS = DoubleStream.of(1,3,5,8);
        LongStream longS = LongStream.of(1L,3L,5L,8L);

        // Take a primitive stream and converts it in a Object stream of Integer
        Stream<Integer> boxedInt = intS.boxed();

        // This is another way to do the same of the last point
        Stream<Double> doubleStream = doubleS.mapToObj(val -> val);



    }
}

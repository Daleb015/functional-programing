package co.com.daleb.streams.intro;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoundedStreams {
    public static void main(String[] args) {

        // 1 Stream on a collection
        // Immutable list
        List<Integer> list = List.of(1, 4, 7, 9, 4);
        Stream<Integer> integerStream = list.stream();

        // Immutable map
        Map<Integer,String> map = Map.of(1,"one",2,"two",3,"three",4,"four");
        // Stream of the entries in the map
        Stream<Entry<Integer,String>> entries = map.entrySet().stream();

        // Stream of values
        Stream<String> values = map.values().stream();
        // Stream of the keys in the map
        Stream<Integer> keys = map.keySet().stream();

        // 2 of() Stream class
        // Static method
        Stream<String> streamString = Stream.of("Hey", "Happy", "Thanksgiving");

        // 3 stream() of Arrays class
        // From array
        Integer[] integerArray = {3,5,89,9};
        Stream<Integer> stream = Arrays.stream(integerArray);
        int[] intArray = {3,5,7,89,9};
        IntStream intStream = Arrays.stream(intArray);

        // 4 Builder patter of stream
        Stream.Builder<Integer> builder = Stream.builder();
        builder.add(1);
        //code
        // conditions
        builder.add(4);
        Stream<Integer> build = builder.build();



    }
}

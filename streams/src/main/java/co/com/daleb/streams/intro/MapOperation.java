package co.com.daleb.streams.intro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapOperation {
    public static void main(String[] args) {

        List<Integer> collect = Stream.of(1,2,3,4,5,6,7,8,9,10)
                .map(x -> x*25)
                .collect(Collectors.toList());

        collect.forEach(e -> System.out.println(e));

        List<Book> books = new ArrayList<>();
        books.add(new Book("The alchemist","Paulo Cohelo","Adventure",4.408789));
        books.add(new Book("The Notebook","Nicholas Sparks","Romance",4.10));
        books.add(new Book("Horror Cocktail","Robert Bloch","Horror",2.67));
        books.add(new Book("House of lives","Mark z, Danielewski","Horror",4.10908908));

        books.stream().parallel()
                .filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
                .filter(book -> book.getRating() > 3)
                .map(book -> book.getName())
                .forEach(System.out::println);

    }
}

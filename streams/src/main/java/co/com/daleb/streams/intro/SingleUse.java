package co.com.daleb.streams.intro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SingleUse {

  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();

    books.add(new Book("The alchemist", "Paulo Cohelo", "Adventure", 4.408789));
    books.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10));
    books.add(new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.67));
    books.add(new Book("House of lives", "Mark z, Danielewski", "Horror", 4.10908908));

    Stream<Book> stream = books.stream();

    List<Book> popularHorrorBooks = stream
      .filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
      .filter(book -> book.getRating() > 3)
      .collect(Collectors.toList());

    popularHorrorBooks.forEach(System.out::println);

    List<Book> popularRomanticBooks = stream
      .filter(book -> book.getGenre().equalsIgnoreCase("Romance"))
      .filter(book -> book.getRating() > 3)
      .collect(Collectors.toList());

    popularRomanticBooks.forEach(System.out::println);
  }
}

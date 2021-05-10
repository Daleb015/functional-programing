package co.com.daleb.streams.intro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntroStreams {
        public static void main(String[] args) {

            List<Book> books = new ArrayList<>();

            List<Book> popularHorrorBooksOld = new ArrayList<>();

            for (Book book : books) {
                if (book.getGenre().equalsIgnoreCase("Horror") && book.getRating() > 3) {
                    popularHorrorBooksOld.add(book);
                }
            }

            System.out.println(popularHorrorBooksOld);

            // After java 8
            final List<Book> popularHorrorBooks = books.stream().parallel()
                    .filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
                    .filter(book -> book.getRating() > 3)
                    .collect(Collectors.toList());

            System.out.println(popularHorrorBooks);

            // 1.
            Stream<Book> stream = books.stream();

            // 2.
            Stream<Book> horrorBooks = stream.filter(book -> book.getGenre().equalsIgnoreCase("Horror"));

            // 3.
            Stream<Book> pHorrorBooks = horrorBooks.filter(book -> book.getRating() > 3);

            // 4.
            List<Book> collectedBooks = pHorrorBooks.collect(Collectors.toList());

            System.out.println(collectedBooks);


        }
}

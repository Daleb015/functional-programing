package co.com.daleb.streams.intro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ReadingObjectsFromFile {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\daleb\\Programacion\\Workspaces\\intellij\\functional-programing\\streams\\src\\main\\java\\co\\com\\daleb\\streams\\intro\\Libros.txt");
        try (Stream<String> lines = Files.lines(path);){

            Spliterator<String> baseSpliterator = lines.spliterator();

            Spliterator<Book> spliterator = new BookSpliterator(baseSpliterator);

            Stream<Book> stream = StreamSupport.stream(spliterator, false);
            stream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

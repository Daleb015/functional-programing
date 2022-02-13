package co.com.daleb.streams.intro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapOperation {

  public static void main(String[] args) {
    Stream<String> a = Stream.of("Hello ", "There! ");
    Stream<String> b = Stream.of("Learning ", "Java? ");

    // Stream of strings
    Stream<Stream<String>> c = Stream.of(a, b);

    Stream<String> flatMap = Stream.of(a, b).flatMap(e -> e);

    // example

    Path p = Paths.get(
      "C:\\Users\\daleb\\Programacion\\Workspaces\\intellij\\functional-programing\\streams\\src\\main\\java\\co\\com\\daleb\\streams\\intro\\Cuento.txt"
    );
    try (final Stream<String> notebook = Files.lines(p);) {
      List<String> collect = notebook
        .flatMap(line -> Arrays.stream(line.split(" ")))
        .collect(Collectors.toList());

      collect.forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

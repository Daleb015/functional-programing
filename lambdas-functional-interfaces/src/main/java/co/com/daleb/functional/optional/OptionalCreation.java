package co.com.daleb.functional.optional;

import java.util.Optional;
import javax.swing.text.html.Option;

public class OptionalCreation {

  public static void main(String[] args) {
    String val = "a string";
    Optional<String> optional = Optional.of(val);

    // Empty optional
    Optional<Integer> empty = Optional.empty();

    // nullable if not sure there is a value

    Optional<String> nullable = Optional.ofNullable(val);

    Optional<String> emptyOptional = Optional.ofNullable(null);
    // Optional are inmutable, use  bytes for the wrap.

  }
}

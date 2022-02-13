package co.com.daleb.functional.optional;

import java.util.Optional;

public class OptionalOperations {

  public static void main(String[] args) {
    Optional<String> optional = Optional.of("value");
    //Optional<String> optional = Optional.empty();
    // map when a value is present transforms the objecto to another object

    String s = optional.map(val -> "Replaced").orElseGet(() -> "Empty optional");
    System.out.println(s);

    // filter, take the value if is present and evaluate a condition with it, if the condicion is true return a optional of the value

    Optional<String> filtered = optional.filter(val -> val.equalsIgnoreCase("Value"));

    System.out.println(filtered.orElse("Esta vacio aqui"));

    // flatMap if an OPTIONAL has value, return the value of that OPTIONAL.

    Optional<String> replaced_by_flatmap = optional.flatMap(val ->
      Optional.of("replaced by flatmap")
    );
    System.out.println(replaced_by_flatmap.orElse("Valor inicial vacio"));
  }
}

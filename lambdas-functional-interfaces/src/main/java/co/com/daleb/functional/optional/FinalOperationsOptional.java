package co.com.daleb.functional.optional;

import java.util.Optional;

public class FinalOperationsOptional {
    public static void main(String[] args) {
        // if present, if a value is present consumes

        Optional<String> optional = Optional.of("Value");

        optional.ifPresent(val -> System.out.println(val));

        // ifPresentOrElse, execute another action if the present is absent

        optional
                .ifPresentOrElse(System.out :: println, () -> System.out.println("The value is absent"));

        // Stream, let to converto a optional to a stream of a single optional

        optional
                .stream()
                .forEach(System.out::println);
        Optional.empty()
                .stream()
                .forEach(System.out::println);

        // or, lets you to return another optional if the value is absent

        optional.or(() -> Optional.of("New value"))
                .ifPresent(System.out::println);
        //Optional.empty().or(() -> Optional.of("New value")).ifPresent(System.out::println);

        // equals, checks if the value of an optional is equals to other optional value, withut unwrap
        //either both are empty
        //or if the values in optional are equals to each other via equals method

        boolean value = optional.equals(Optional.of("Value"));

        System.out.println("Both are equals "+value);

        //hashcode

        System.out.println(optional.hashCode());


    }
}

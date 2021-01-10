package co.com.daleb.functional.predefinedfunctionalinterfaces;

import java.util.Optional;

public class Prueba {
    public static void main(String[] args) {
        var nombre = Optional.ofNullable("Daniel")
                .map(String::toUpperCase)
                .filter(x -> x.startsWith("D"))
                .or(() -> Optional.of("No paso el filtro"));

        nombre.ifPresent(System.out::println);

    }
}

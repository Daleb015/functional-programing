package co.com.daleb.functional;

import java.net.StandardSocketOptions;
import java.util.Objects;
import java.util.Optional;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Optional.ofNullable(7)
        .map(Integer::doubleValue)
        .filter(Objects::nonNull)
        .filter(v -> v>10)
                .or(() -> Optional.of(118.0))
        .ifPresentOrElse(v -> System.out.println(v.toString()),() -> System.out.println("El valor no es mayor de 10"));

    }


}

package co.com.daleb.functional.imperativevsdeclarative;

import java.util.logging.Logger;
import java.util.stream.IntStream;

import static java.lang.String.*;

public class ImperativeVsDeclarative {
    public static void main(String[] args) {
        // Imperative

        int sumEvents = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                sumEvents = sumEvents+i;
            }
        }

        Logger logger = Logger.getLogger("Prueba", "Prueba");
        logger.info(format("%d", sumEvents));

        /* Declarative */

        IntStream.rangeClosed(0,100)
                .filter(x ->  x % 2 == 0)
                .reduce(Integer::sum)
                .ifPresent(x -> logger.info(format("%d",x)));


    }
}

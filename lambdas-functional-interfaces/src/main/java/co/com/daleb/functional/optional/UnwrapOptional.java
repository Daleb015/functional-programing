package co.com.daleb.functional.optional;

import java.util.Optional;

public class UnwrapOptional {
    public static void main(String[] args) {
        Integer a =10;
        Optional<Integer> optional = Optional.of(a);
        Integer integerVal = optional.get();
        System.out.println(
                integerVal
        );

        Optional<Integer> emptyOptional = Optional.empty();

        // emptyOptional.get();

        //Is present, see is the optional has the value present

        Integer val = optional.isPresent()?optional.get():0;

        System.out.println(val);

        Integer val2 = emptyOptional.isPresent()?emptyOptional.get():0;

        System.out.println(val2);

        // using optional at the previous way has no sense, it will be more boilerplate

        // orElse, orElseGet

        // orElse

        // in this case the computation of orelse is realized no matters that the optional has value.
        Integer integer = emptyOptional.orElse(0);
        System.out.println(integer);

        // orElseGet
        // in tis case the supplier is only executed when the optional is empty
        Integer integer1 = emptyOptional.orElseGet(() -> 0);
        System.out.println(integer1);

        // orElseThrow,  lets you to throw a particular exception

        Integer integer2 = emptyOptional.orElseThrow(() -> new IllegalArgumentException());
        System.out.println(integer2);

        // orElseThrow(), as the previous but whithin arguments, since java 10

        Integer integer3 = emptyOptional.orElseThrow();



    }
}

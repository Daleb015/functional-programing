package co.com.daleb.functional.PredefinedFunctionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {
    public static void main(String[] args) {

        List<Integer> list = List.of(34,67,8,89);

        Consumer<Integer> consumer = integer -> System.out.println(integer);

        consumer.accept(56);

        printElementos(list, consumer);

    }

    private static <T> void printElementos(List<T> list, Consumer<T> consumer) {
        for (T t: list) {
            consumer.accept(t);
        }
    }
}

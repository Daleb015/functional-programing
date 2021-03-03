package co.com.daleb.functional.PredefinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionPractice {
    public static void main(String[] args) {

        List<String> list = List.of("Daniel","Lineros","Bermudez");

        Function<String, Integer> func = e -> e.length();

        List<Integer>  newList = map(list, func);

        System.out.println(newList);

    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> func) {

        List<R> newList = new ArrayList<>();

        for (T t: list
             ) {
            newList.add(func.apply(t));
        }

        return newList;


    }
}

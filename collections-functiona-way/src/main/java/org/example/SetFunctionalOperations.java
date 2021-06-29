package org.example;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetFunctionalOperations {
    public static void main(String[] args) {

        Set<Integer> set = Set.of(3,56,7,82,39);

        // traversal

        set.forEach(System.out::println);

        System.out.println("--------------------");

        // filter

        set.stream()
                .filter(e -> e%2==0)
                .forEach(System.out::println);

        System.out.println("--------------------");

        // Sorting

        set.stream()
                .sorted()
                .forEach(System.out::println);

        TreeSet<Integer> sortedset = set.stream()
                .collect(Collectors.toCollection(TreeSet::new));

        sortedset.forEach(System.out::println);

        System.out.println("--------------------");

        // Map

        Set<Double> hashset = set.stream()
                .map(e -> Double.valueOf(e))
                .collect(Collectors.toSet());

        hashset.forEach(System.out::println);
        System.out.println("--------------------");

        // reduce

        int sum = set.stream()
                .mapToInt(e -> e)
                .sum();

        System.out.println(sum);

    }
}

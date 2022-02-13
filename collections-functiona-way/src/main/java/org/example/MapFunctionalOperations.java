package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapFunctionalOperations {

  public static void main(String[] args) {
    Map<String, String> contacts = new HashMap<>();
    contacts.put("1234654987", "Jhon");
    contacts.put("1237009020", "John");
    contacts.put("7890291111", "Neal");
    contacts.put("2647210290", "Raju");
    contacts.put("9999999999", "Peter");
    contacts.put("9081234567", "Neha");

    // Traversal
    //before java 8
    for (Map.Entry<String, String> entry : contacts.entrySet()) {
      System.out.println(entry.getKey() + " - " + entry.getValue());
    }
    System.out.println("----------------------------------------");

    contacts.forEach((k, v) -> System.out.println(k + " - " + v));
    System.out.println("----------------------------------------");

    // Filter

    contacts
      .entrySet()
      .stream()
      .filter(contact -> "John".equalsIgnoreCase(contact.getValue()))
      .forEach(System.out::println);
    System.out.println("----------------------------------------");

    Map<String, String> collect = contacts
      .entrySet()
      .stream()
      .filter(contact -> "John".equalsIgnoreCase(contact.getValue()))
      .collect(Collectors.toMap(c -> c.getKey(), c -> c.getValue()));
    System.out.println("----------------------------------------");

    // Map

    String collect1 = contacts
      .entrySet()
      .stream()
      .distinct()
      .map(c -> c.getValue())
      .collect(Collectors.joining(" , "));

    System.out.println(collect1);
    System.out.println("----------------------------------------");

    // Sorting

    LinkedHashMap<String, String> sortedMap = contacts
      .entrySet()
      .stream()
      .sorted(Map.Entry.comparingByValue())
      .collect(
        Collectors.toMap(c -> c.getKey(), c -> c.getValue(), (v1, v2) -> v1, LinkedHashMap::new)
      );

    sortedMap.forEach((k, v) -> System.out.println(k + " - " + v));

    // Reduce

    Map<String, Double> marks = new HashMap<>();
    marks.put("Science", 66.0);
    marks.put("Maths", 78.0);
    marks.put("English", 90.0);

    OptionalDouble average = marks.values().stream().mapToDouble(m -> m).average();

    System.out.println(average.getAsDouble());
  }
}

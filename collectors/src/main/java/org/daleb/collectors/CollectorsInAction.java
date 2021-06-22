package org.daleb.collectors;

import org.daleb.Employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CollectorsInAction {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\daleb\\Programacion\\Workspaces\\intellij\\functional-programing\\collectors\\src\\main\\java\\org\\daleb\\EmployeeData.txt");

        try (Stream<String> lines = Files.lines(path);){

            Stream<String> words = lines.flatMap(line -> Arrays.stream(line.split(",")));

            Spliterator<String> wordsSpliterator = words.spliterator();

            Spliterator<Employee> employeeSpliterator = new EmployeeSpliterator(wordsSpliterator);

            Stream<Employee> employees = StreamSupport.stream(employeeSpliterator, false);

            List<Employee> employeeList = employees.collect(Collectors.toList());

            //List
            final List<String> names = employeeList.stream()
                    .map(employee -> employee.getName())
                    .collect(Collectors.toList());
            // Set
            final Set<String> designations = employeeList.stream()
                    .map(employee -> employee.getDesignation())
                    .collect(Collectors.toSet());
            // Immutable list
            final List<String> unmodifiableList = employeeList.stream()
                    .map(employee -> employee.getName())
                    .collect(Collectors.toUnmodifiableList());

            // TreeSet
            final TreeSet<Employee> employeesSorted = employeeList.stream()
                    .collect(Collectors.toCollection(TreeSet::new));

            // Map
            final Map<Integer, String> employeesMap = employeeList.stream()
                    .collect(Collectors.toMap(e -> e.getId(), e -> e.getName()));

            unmodifiableList.forEach(System.out::println);
            designations.forEach(System.out::println);
            names.forEach(System.out::println);
            employeesSorted.forEach(System.out::println);
            employeesMap.forEach((id,name)-> System.out.println("id: "+id+" name: "+name));

            // divide in two collectors
            final Map<Boolean, List<Employee>> partitionedData = employeeList.stream()
                    .collect(Collectors.partitioningBy(e -> e.getGender() == 'M'));

            System.out.println(partitionedData);

            List<Employee> maleEmployees = partitionedData.get(true);
            List<Employee> femaleEmployees = partitionedData.get(false);

            // divide by a value
            Map<String, List<Employee>> partitionedDesignationEmployees = employeeList.stream()
                    .collect(
                            Collectors.groupingBy(e -> e.getDesignation())
                    );

            System.out.println(partitionedDesignationEmployees);

            // joining values
            String joiningNames = employeeList.stream()
                    .map(e -> e.getName())
                    .collect(Collectors.joining(","));

            System.out.println(joiningNames);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

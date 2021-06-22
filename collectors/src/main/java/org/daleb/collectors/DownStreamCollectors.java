package org.daleb.collectors;

import org.daleb.Employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class DownStreamCollectors {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/java/org/daleb/EmployeeData.txt");
        try(Stream<String> lines = Files.lines(path);) {

            Spliterator<String> wordSpliterator = lines.flatMap(line -> Arrays.stream(line.split(",")))
                    .spliterator();

            Spliterator<Employee> employeeSpliterator = new EmployeeSpliterator(wordSpliterator);

            List<Employee> employeeList = StreamSupport.stream(employeeSpliterator,false)
                    .collect(Collectors.toList());

            // downstream
            Map<String, Long> getByDesignation = employeeList.stream()
                    .collect(
                            Collectors.groupingBy(
                                    e -> e.getDesignation(),
                                    Collectors.counting()
                            )
                    );

            System.out.println(getByDesignation);

            // Summing with a downstream collector
            Map<String, Double> fundDistribution = employeeList.stream()
                    .collect(
                            Collectors.groupingBy
                                    (e -> e.getDesignation(),
                    Collectors.summingDouble(e -> e.getSalary())
                                    )
                    );

            System.out.println(fundDistribution);

            // looking for max value with downstream
            Map<String, Optional<Employee>> maxSalaryEmployees = employeeList.stream()
                    .collect(
                            Collectors.groupingBy
                                    (e -> e.getDesignation(),
                                            Collectors.maxBy(Comparator.comparing(e -> e.getSalary()))
                                    )
                    );

            System.out.println(maxSalaryEmployees);

            // looking for max value with downstream
            Map<String, Optional<Double>> maxSalarys = employeeList.stream()
                    .collect(
                            Collectors.groupingBy
                                    (e -> e.getDesignation(),
                                            Collectors.mapping(e -> e.getSalary(), Collectors.maxBy(Comparator.comparing(Function.identity())))
                                    )
                    );

            System.out.println(maxSalarys);


        }catch (IOException e){
            System.out.println(e);
        }
    }
}

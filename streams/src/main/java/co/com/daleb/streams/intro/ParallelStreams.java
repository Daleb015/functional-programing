package co.com.daleb.streams.intro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreams {

  public static void main(String[] args) {
    List<Employee> list = new ArrayList<>();

    long starTime = System.currentTimeMillis();
    long finishTime = System.currentTimeMillis();

    for (int i = 0; i < 100; i++) {
      list.add(new Employee("Jhon", 20000));
      list.add(new Employee("Rhon", 3000));
      list.add(new Employee("Tom", 15000));
      list.add(new Employee("Bhemm", 8000));
      list.add(new Employee("Shiva", 200));
      list.add(new Employee("Khrishna", 50000));
    }

    starTime = System.currentTimeMillis();
    System.out.println(
      "Performing sequentially :" + list.stream().filter(e -> e.getSalary() > 100).count()
    );
    finishTime = System.currentTimeMillis();

    System.out.println("Time taken sequentially :" + (finishTime - starTime));

    starTime = System.currentTimeMillis();
    System.out.println(
      "Performing parallelism :" + list.parallelStream().filter(e -> e.getSalary() > 100).count()
    );
    finishTime = System.currentTimeMillis();

    System.out.println("Time taken parallelism :" + (finishTime - starTime));
  }
}

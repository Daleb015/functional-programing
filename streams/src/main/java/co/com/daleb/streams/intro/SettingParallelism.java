package co.com.daleb.streams.intro;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class SettingParallelism {

  public static void main(String[] args) {
    System.out.println(Runtime.getRuntime().availableProcessors());
    System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "6");
    System.out.println(ForkJoinPool.getCommonPoolParallelism());
    ForkJoinPool pool = new ForkJoinPool(2);

    List<Employee> list = new ArrayList<>();

    for (int i = 0; i < 100; i++) {
      list.add(new Employee("Jhon", 20000));
      list.add(new Employee("Rhon", 3000));
      list.add(new Employee("Tom", 15000));
      list.add(new Employee("Bhemm", 8000));
      list.add(new Employee("Shiva", 200));
      list.add(new Employee("Khrishna", 50000));
    }

    try {
      Long aLong = pool
        .submit(() -> list.parallelStream().filter(e -> e.getSalary() > 100).count())
        .get();
      System.out.println(aLong);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
    // Computational Intensive
    // number of threads <= number of cores

    // Io Intensive
    // Number of threads > number of cores

  }
}

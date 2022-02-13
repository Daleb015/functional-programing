package co.com.daleb.functional.MethodConstructorReference;

import java.util.function.Function;

public class ConstructorReference {

  public static void main(String[] args) {
    // without constructor reference
    Function<Runnable, Thread> threadGenerator = r -> new Thread(r);

    // With constructor reference
    Function<Runnable, Thread> threadGenerator2 = Thread::new;

    Runnable task1 = () -> System.out.println("Task1 executed");

    Runnable task2 = () -> System.out.println("task 2 executed");

    Thread thread1 = threadGenerator2.apply(task1);

    Thread thread2 = threadGenerator2.apply(task2);

    thread1.start();
    thread2.start();

    threadGenerator2.apply(() -> System.out.println("Task 3 executed")).start();
  }
}

package co.com.daleb.functional.MethodConstructorReference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceDemo {

  public static void main(String[] args) {
    // Object instance method
    // Method reference from an instance, System at this case
    Consumer<String> funConsumer = System.out::println;

    funConsumer.accept("Daniel Lineros");

    // Class static method
    // Method reference of an static method
    Supplier<Double> funSupplier = Math::random;

    System.out.println(funSupplier.get());

    // Instance method (func = x -> x.length())
    Function<String, Integer> func = String::length;

    System.out.println(func.apply("Daniel Lineros"));
  }
}

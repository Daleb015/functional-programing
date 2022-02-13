package co.com.daleb.functional.PredefinedFunctionalInterfaces;

@FunctionalInterface
public interface FunctionalGenerics<T, R> {
  R execute(T t);
}

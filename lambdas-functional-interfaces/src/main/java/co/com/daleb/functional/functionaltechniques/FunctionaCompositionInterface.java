package co.com.daleb.functional.functionaltechniques;

@FunctionalInterface
public interface FunctionaCompositionInterface<T, R> {
  R apply(T t);

  default <V> FunctionaCompositionInterface<V, R> compose(
    FunctionaCompositionInterface<V, T> before
  ) {
    return (V v) -> apply(before.apply(v));
  }
}

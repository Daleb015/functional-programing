package co.com.daleb.functional.FunctionaTheory;

@FunctionalInterface
public interface IConfiguratorHighOrders<T, R> {
    R configure(T t);
}

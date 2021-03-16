package co.com.daleb.functional.FunctionaTheory;

public class HighOrderFunctions {
    public static void main(String[] args) {

        IFactoryHighOrders<Integer> createFactory = createFactory(() -> Math.random()*100, r -> r.intValue());
        Integer product = createFactory.create();
        System.out.println(product);
    }

    public static <T,R> IFactoryHighOrders<R> createFactory(IProducrHighOrders<T> producer, IConfiguratorHighOrders<T,R> configurator){
        return () -> {
            T product = producer.produce();
            return configurator.configure(product);
        };
    }
}

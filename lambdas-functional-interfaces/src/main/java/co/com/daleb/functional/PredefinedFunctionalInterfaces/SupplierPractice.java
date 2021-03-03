package co.com.daleb.functional.PredefinedFunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierPractice {

    public static void main(String[] args) {

        Supplier<String> stringSupplier = () -> new String("A String");

        System.out.println(stringSupplier.get());

        Supplier<Double> randonNumber = () -> Math.random();

        System.out.println(randonNumber.get());
    }
}

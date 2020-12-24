package co.com.daleb.functional.functionalinterfaces;

import java.util.Optional;

public class FunctionaInterfaceDemo {
    public static void main(String[] args) {

        // here we are pass the lambda as the parameter
        MyFunctionalInterface fun = () -> System.out.println("hello");
        fun.myMethod();

        // Something like
        Integer number = 10;

        onTheFly(() -> System.out.println("hello inside lambda"));

    }

    public static void onTheFly(MyFunctionalInterface fun){
        fun.myMethod();
    }
}

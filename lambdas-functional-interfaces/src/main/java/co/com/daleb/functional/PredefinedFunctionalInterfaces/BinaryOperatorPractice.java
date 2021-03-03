package co.com.daleb.functional.PredefinedFunctionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorPractice {
    public static void main(String[] args) {
        BinaryOperator<String> binaryFunc = (a,b) -> a+"."+b;

        System.out.println(binaryFunc.apply("Daniel","Lineros"));
    }
}

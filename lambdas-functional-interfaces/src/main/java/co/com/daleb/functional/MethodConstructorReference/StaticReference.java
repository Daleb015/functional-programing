package co.com.daleb.functional.MethodConstructorReference;

import java.util.function.BiFunction;

public class StaticReference {

    public static void main(String[] args) {
        BiFunction<String, String, String>  funcBifunction = A_Static::staticMethod;
    }
}

class A_Static{
    static String staticMethod(String a, String b){
        return a+b;
    }
}

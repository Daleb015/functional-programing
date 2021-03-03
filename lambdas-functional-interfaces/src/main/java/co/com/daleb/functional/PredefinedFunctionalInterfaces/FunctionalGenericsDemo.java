package co.com.daleb.functional.PredefinedFunctionalInterfaces;

public class FunctionalGenericsDemo {

    public static void main(String[] args) {
        FunctionalGenerics<String, String> func = s -> s.substring(1,5);
        System.out.println(func.execute("Daniel Lineros"));

        FunctionalGenerics<String, Integer> func1 = s -> s.length();
        System.out.println(func1.execute("Daniel Lineros"));
    }

}

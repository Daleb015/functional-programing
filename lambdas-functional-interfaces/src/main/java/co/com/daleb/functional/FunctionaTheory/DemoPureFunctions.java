package co.com.daleb.functional.FunctionaTheory;

public class DemoPureFunctions {
    public static void main(String[] args) {

            // here exist two cases, we can use the methods and it will print logs, or change the value for the obtain and it will not print,
            // this means these are not pure functions
            int result = add(multiply(2,3),multiply(3,4));
            // in fact this should be the same retuurn because where are using the same parameters 6 and 12 for the add method,
            // but the result its differentn, no output on the second call.
            int result2 = add(6,12);

        System.out.println(result);
    }

    public static int add(int a, int b){
        return a+b;
    }

    // this isn´t a pure function, because has side effects and isn´t deterministic
    public static int multiply(int a, int b){
        log(String.format("Returning %s as the result of %s * %s",a*b,a,b));
        return a+b;
    }

    // this isn´t a pure function because take the parameter and returns anything, also
    // tis method print on the console, and that is a side effect
    public static void log(String m){
        System.out.println(m);
    }
}

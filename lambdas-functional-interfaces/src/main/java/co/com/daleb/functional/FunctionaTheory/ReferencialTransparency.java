package co.com.daleb.functional.FunctionaTheory;

public class ReferencialTransparency {
    public static void main(String[] args) {

        // we can see in this example, that we can change the parameters for
        // the functions or the value an this doesn´t change the result

        int result = add(2, 8);
        int result1 = add(2, multiply(2,multiply(2,2)));
        int result2 = add(2, multiply(2,4));
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }

    public static int add(int a , int b){
        return a+b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    // If we use this method there isn´t referential tranasparency, because use it means have a print on console
    // If we replace with another value change the print on console.
    public static int multiplyNoTransparent(int a, int b){
        System.out.println("Multiplying a and b:"+a+", "+b);
        return a*b;
    }
}

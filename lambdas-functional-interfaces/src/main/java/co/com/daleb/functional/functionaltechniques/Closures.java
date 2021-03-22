package co.com.daleb.functional.functionaltechniques;

public class Closures {
    public static void main(String[] args) {

        int value = 111;


        // if we change the value of the var value, the compiler will throw a error, because a variable used inside a lambda should be final or efectevely final
        //value = 112;


        // in this case this is a closure, which is using the free variable present in this lexical scope (value);
        Task lambda =  () -> {

            // no matters if we do this inside the lambda, this is because the scope.
            // value = 112;

            System.out.println(value);
            System.out.println("Task completed");
        };

        printValue(lambda);
    }

    // If you execute this methos, yo can see than the print value is 111, but the variable value is not defined inside the scope of print value,
    // so why we can execute if the variable doesn´t exist outside of the main?
    private static void printValue(Task lambda) {

        // So, once we call the lambda passed as parameter, it has the saved value of variable value because the closure.

        lambda.doTask();

    }
}


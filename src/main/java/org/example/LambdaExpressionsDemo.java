package org.example;
// Functional interface with a single abstract method
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaExpressionsDemo {
    public static void main(String[] args) {
        // Using lambda expression to implement the MathOperation interface
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                throw new IllegalArgumentException("Division by zero");
            }
        };

        // Perform operations using lambda expressions
        System.out.println("10 + 5 = " + operate(addition, 10, 5));
        System.out.println("10 - 5 = " + operate(subtraction, 10, 5));
        System.out.println("10 * 5 = " + operate(multiplication, 10, 5));
        System.out.println("10 / 5 = " + operate(division, 10, 5));

        // Example with custom functional interface
        StringOperation reverseString = str -> new StringBuilder(str).reverse().toString();
        System.out.println("Reverse of 'Hello' using lambda: " + reverseString.operate("Hello"));
    }

    public static int operate(MathOperation operation, int a, int b) {
        return operation.operate(a, b);
    }

    @FunctionalInterface
    interface StringOperation {
        String operate(String str);
    }
}

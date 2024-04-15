package org.example;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of Fibonacci numbers to generate:");
        int n = scan.nextInt();
        System.out.println("Fibonacci Series using recursion:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: if n is 0 or 1, return n
        } else {
            // Recursive case: Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

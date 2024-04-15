package org.example;

import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            int number = scanner.nextInt(); // Try to read an integer from user input
            int result = 10 / number; // Try to perform division
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Catch ArithmeticException if division by zero occurs
            e.printStackTrace();
            System.out.println("Error: Division by zero is not allowed"+e.getMessage());
        } catch (Exception e) {
            // Catch any other exception that may occur
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner in the finally block to ensure it's always closed
            scanner.close();
        }
    }
}


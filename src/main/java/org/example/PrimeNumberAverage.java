package org.example;

import java.util.Scanner;

public class PrimeNumberAverage {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the range of numbers to find prime numbers average");
        System.out.println("Enter Start Range:");
        int startRange = scan.nextInt();
        System.out.println("Enter End Range:");
        int endRange = scan.nextInt();
        double average = calculatePrimeNumberAverage(startRange, endRange);
        System.out.println("Average of prime numbers from " + startRange + " to " + endRange + ": " + average);
    }

        public static double calculatePrimeNumberAverage(int start, int end) {
        int count = 0;
        int sum = 0;

        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                count++;
                sum += num;
            }
        }

        // Calculate the average only if there are prime numbers in the range
        if (count > 0) {
            return (double) sum / count;
        } else {
            return 0; // Return 0 if no prime numbers are found in the range
        }
    }

        public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    }




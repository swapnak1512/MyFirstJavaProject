package org.example;



public class JavaPrograms {

    public static String reverseString(String input)
    {
        System.out.println("you have entered"+input);
        StringBuilder reversed = new StringBuilder();
        for(int i = input.length()-1;i>=0;i--)
        {
            reversed.append(input.charAt(i));
        }
                return reversed.toString();
    }

    public static int findLargestNumber(int[] arr)
    {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }

        int largest = arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static boolean isPalindrome(String str) {
        // Remove all non-alphanumeric characters and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false; // Characters at left and right positions don't match
            }
            left++;
            right--;
        }

        return true; // All characters matched, so it's a palindrome
    }
public static int factorial(int number)
    {
        int fact = 1;
        for(int i=1;i<=number;i++)
        {
            fact = fact*i;
        }

        return fact;
    }

    public static void printFibonacciSeries(int num)
    {
        int firstTerm = 0;
        int secondTerm = 1;
        for(int i=0;i<num;i++)
        {
            System.out.print(firstTerm+" ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static boolean isPrime(int num)
    {

        for(int i=2;i<num;i++)
        {
            if(num%i==0) {
                return false;
            }
        }
     return true;
    }
}





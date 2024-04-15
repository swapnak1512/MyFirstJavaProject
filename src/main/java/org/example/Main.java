package org.example;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)

    {
        //to get the repeated characters
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Any string or sentence to find the repeated characters:");
        String input = scan.nextLine();
        System.out.println("You have entered word:"+input);
        PrintOnlyRepeatedCharacters prc = new PrintOnlyRepeatedCharacters();

        String repeatedChars = prc.findRepeatedCharactersInOrder(input);
        if (repeatedChars.length() < 1)
        {
            System.out.println("There are no repeated characters in given string");
        }
        else {
            System.out.println("Repeated characters in alphabetical order: " + repeatedChars);
        }
        System.out.println("*************************************");
        //to reverse of the given string
        System.out.println("Enter Any string to get the reverse of string");
        String inputToReverse = scan.nextLine();
        System.out.println("You have entered word:"+inputToReverse);
        JavaPrograms jp=new JavaPrograms();
        String reversedString = jp.reverseString(inputToReverse);
        System.out.println("reversed string:"+reversedString);

        //to find the largest number in array
        System.out.println("*************************************");
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }

        System.out.println("you have entered numbers");
        for(int j=0;j<size;j++)
            System.out.println(numbers[j]);
        int largest = jp.findLargestNumber(numbers);
        System.out.println("The largest number in the array is: " + largest);

        //to check whether string is palindrome or not
        System.out.println("*************************************");
        System.out.print("Enter a string to check for palindrome: ");
        String inputToCheckPalindrome = scan.next();


        if (jp.isPalindrome(inputToCheckPalindrome)) {
            System.out.println("The string \"" + inputToCheckPalindrome + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + inputToCheckPalindrome + "\" is not a palindrome.");
        }

        //factorial of a number
        System.out.println("*************************************");
        System.out.print("Enter the number to find factorial: ");
        int num = scan.nextInt();
        int factResult = jp.factorial(num);
        System.out.println("factorial of "+num+" is "+factResult);

        //fibonacci series
        System.out.println("*************************************");
        System.out.println("Enter any number of terms for fibonacci series");
        int numTerms = scan.nextInt();
        System.out.println("Fibonacci series till "+numTerms+" are");
        jp.printFibonacciSeries(numTerms);

        //prime number
        System.out.println();
        System.out.println("*************************************");
        System.out.println("Enter any number to check if its prime or not");
        int numPrime = scan.nextInt();
        if (jp.isPrime(numPrime)) {
            System.out.println("The number " + numPrime + " is a prime.");
        } else {
            System.out.println("The number " + numPrime + " is not a prime.");
        }

        //Anagram
        System.out.println("*************************************");
        System.out.println("Enter 2 strings to check whether they are anagrams to each other");
        System.out.println("Enter 1st String");
        String str1 = scan.next();
        System.out.println("Enter 2nd String");
        String str2 = scan.next();
        if(jp.isAnagram(str1,str2))
            System.out.println("Both the strings \" "+str1+" \"and\" "+str2+" \"are Anagrams to each other");
        else
            System.out.println("Both the strings \""+str1+"\" and \""+str2+ " \"are not anagrams");

        //Array sorting - Bubble sort
        System.out.println("*************************************");
        System.out.print("Enter the size of the array for sorting: ");
        int size1 = scan.nextInt();

        int[] nums = new int[size1];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size1; i++) {
            nums[i] = scan.nextInt();
        }

        System.out.println("Original Array:");
        for(int j=0;j<size1;j++)
            System.out.print(nums[j]+" ");

        jp.bubbleSort(nums);
        System.out.println();
        System.out.println("sorted array by bubble sort:");
        for(int k=0;k<size1;k++)
            System.out.print(nums[k]+" ");

        //Array sorting - Merge sort
        System.out.println();
        System.out.println("sorted array by merge sort:");
        jp.mergeSort(nums,0,nums.length-1);
        for(int l=0;l<size1;l++)
            System.out.print(nums[l]+ " ");

        //Binary search
        System.out.println();
        System.out.println("*************************************");
        System.out.println("Enter number you want to search");
        int target = scan.nextInt();
        int index = jp.binarySearch(nums,target);
        if(index != -1)
        {
            System.out.println("Target "+target+" found at index "+index);
        }
        else
        {
            System.out.println("Target "+target+" not found in array");
        }

        //find and print duplicated in an array
        jp.findDuplicates(nums);

        //matrix addition , matrix multiplication and matrix transpose
        System.out.println("***************************");
        System.out.println("Matrix Operations");
        int[][] matrix1={ {0, 0, 0}, {0, 0, 0} };
        int[][] matrix2={ {0, 0, 0}, {0, 0, 0} };

        System.out.println("Enter the size of the matrix array: Enter number of rows");
        int rows = scan.nextInt();
        System.out.println("Enter the size of the matrix array: Enter number of columns");
        int cols = scan.nextInt();
        System.out.println("Enter the elements of matrix array");
        for (int i = 0; i < rows; i++)
        {
            {
                for (int j = 0; j < cols; j++)
                    matrix1[i][j] = scan.nextInt();
            }
        }

       System.out.println("Enter the elements of matrix 2 array");
        for (int i = 0; i < rows; i++)
        {
            {
                for (int j = 0; j < cols; j++)
                    matrix2[i][j] = scan.nextInt();
            }
        }
        System.out.println("Elements of the matrix 1 array are:");
        jp.printMatrix(matrix1);
        System.out.println("Elements of the matrix 2 array are:");

        jp.printMatrix(matrix2);
        int[][] sumMatrix = jp.addMatrices(matrix1, matrix2);
        System.out.println("Matrix Addition:");
        jp.printMatrix(sumMatrix);

        // Matrix multiplication
        int[][] productMatrix = jp.multiplyMatrices(matrix1, matrix2);
        System.out.println("\nMatrix Multiplication:");
        jp.printMatrix(productMatrix);

        // Matrix transpose
        int[][] transposedMatrix = jp.transposeMatrix(matrix1);
        System.out.println("\nMatrix Transpose:");
        jp.printMatrix(transposedMatrix);

    }
}
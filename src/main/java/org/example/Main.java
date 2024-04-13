package org.example;

import java.util.Scanner;
import java.util.Set;

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

        //to reverse of the given string
        System.out.println("Enter Any string to get the reverse of string");
        String inputToReverse = scan.nextLine();
        System.out.println("You have entered word:"+inputToReverse);
        JavaPrograms jp=new JavaPrograms();
        String reversedString = jp.reverseString(inputToReverse);
        System.out.println("reversed string:"+reversedString);

        //to find the largest number in array
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
        System.out.print("Enter a string to check for palindrome: ");
        String inputToCheckPalindrome = scan.next();


        if (jp.isPalindrome(inputToCheckPalindrome)) {
            System.out.println("The string \"" + inputToCheckPalindrome + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + inputToCheckPalindrome + "\" is not a palindrome.");
        }
    }
}
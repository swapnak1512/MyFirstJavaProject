package org.example;

import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)

    {
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
    }
}
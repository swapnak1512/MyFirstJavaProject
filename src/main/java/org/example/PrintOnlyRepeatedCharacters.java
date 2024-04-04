package org.example;

import java.util.*;

public class PrintOnlyRepeatedCharacters {

    public static String findRepeatedCharactersInOrder(String input) {
        // Create a TreeMap to store characters in alphabetical order
        TreeMap<Character,Integer> charCount = new TreeMap<>();
        String inputWithoutSpaces = input.replaceAll(" ","");
        String inputLowerCase = inputWithoutSpaces.toLowerCase();
        System.out.println(inputLowerCase);
        try
        {
            if(inputLowerCase != null)
            {
                // Count the occurrences of each character in the input string
                for ( char c : inputLowerCase.toCharArray()) {
                    charCount.put(c, charCount.getOrDefault(c, 0) + 1);

                }

            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }


        // Build the output string with repeated characters in alphabetical order
        StringBuilder repeatedCharsBuilder = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();

            if (count > 1) {
                System.out.println("character:"+c+":count:"+count);
                repeatedCharsBuilder.append(String.valueOf(c).repeat(count));
                // System.out.println(repeatedCharsBuilder);
            }
        }

        return repeatedCharsBuilder.toString();
    }
}




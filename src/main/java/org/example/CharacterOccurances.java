package org.example;

import java.util.HashMap;

public class CharacterOccurances {
    public static void main(String args[])
    {
        String str ="Prathima";
        HashMap<Character,Integer> charCountMap = new HashMap<>();

        str= str.replaceAll("\\s+","");
        for(char c: str.toCharArray())
        {
            if(charCountMap.containsKey(c))
            {
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                charCountMap.put(c,1);

            }
        }
        System.out.println("Character Occurances:");
        for (char c : charCountMap.keySet())
        {
            int count = charCountMap.get(c);
            System.out.println(c+":"+count);

        }
    }
}

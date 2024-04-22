package org.example;

import java.util.HashMap;

public class WordOccurances {
    public static void main(String args[])
    {
        String str = "I am a java developer I am proud of it";
        String[] words = str.split("\\s+");
        HashMap<String,Integer> wordCountMap = new HashMap<>();
        for(String word: words)
        {
            word = word.toLowerCase();
            if(wordCountMap.containsKey(word))
            {
                wordCountMap.put(word, wordCountMap.get(word)+1);
            }
            else
            {
                wordCountMap.put(word,1);
            }
        }
        System.out.println("Word Occurances");
        for(String word: wordCountMap.keySet())
        {
            int count = wordCountMap.get(word);
            System.out.println(word+":"+ count);
        }
    }
}

package org.example;

import java.util.Arrays;

public class SecondLargestSmallest {
    public static void main(String args[])
    {
        int[] numbers = {5, 3, 9, 1, 7, 2, 8, 4, 6};

        Arrays.sort(numbers);

        int secondSmallest = numbers[1];
        int secondLargest = numbers[numbers.length-2];
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(" "+numbers[i]);
        }

        System.out.println("second smallest:"+secondSmallest);
        System.out.println("second Largest:"+secondLargest);
    }
}

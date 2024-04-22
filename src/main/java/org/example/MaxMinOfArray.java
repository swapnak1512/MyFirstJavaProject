package org.example;
import java.util.Arrays;

public class MaxMinOfArray
{
    public static void main(String args[])
    {
        int[] numbers = {56,12,10,89,2,3};
        Arrays.sort(numbers);

        System.out.println("Minimum number:"+numbers[0]);
        System.out.println("Maximum number:"+numbers[numbers.length-1]);

        //method2
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int number: numbers)
        {
            if(number > max)
            {
                max = number;
            }
            if(number < min)
            {
                min = number;
            }
        }


        System.out.println("Maximun number:"+max);
        System.out.println("Minimum number:"+ min);

    }
}

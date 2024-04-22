package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FindCommonElements {
    public static void main(String args[])
    {


    Integer[] a1 = {1,2,3,2,1};
    Integer[] a2 = {1,2,3};
    Integer[] a3 = {1,2,3,4};

    // Convert arrays to lists for easier manipulation
        List<Integer> list1 = Arrays.asList(a1);
        List<Integer> list2 = Arrays.asList(a2);
        List<Integer> list3 = Arrays.asList(a2);


    List<Integer> commonElements = new ArrayList<>();

    for(Integer element: list1){
        if(list2.contains(element) && (list3.contains(element)) && !commonElements.contains(element)) {
            commonElements.add(element);
        }
    }

    Integer[] commonElementsArray = commonElements.toArray(new Integer[0]);
         // Convert list to array if needed
        System.out.println("Common elements: " + Arrays.toString(commonElementsArray));
    }

}

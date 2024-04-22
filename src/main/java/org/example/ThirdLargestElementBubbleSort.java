package org.example;

public class ThirdLargestElementBubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 10, 3, 1, 9};

        // Perform bubble sort to arrange the array in ascending order
        bubbleSort(numbers);

        // The 3rd largest element is at index length - 3
        int thirdLargest = numbers[numbers.length - 3];
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]+ " ");
        }
        System.out.println("The 3rd largest element is: " + thirdLargest);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


    }
}

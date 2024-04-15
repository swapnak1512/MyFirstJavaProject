package org.example;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JavaPrograms {

    public static String reverseString(String input)
    {
        StringBuilder reversed = new StringBuilder();
        for(int i = input.length()-1;i>=0;i--)
        {
            reversed.append(input.charAt(i));
        }
                return reversed.toString();
    }

    public static int findLargestNumber(int[] arr)
    {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }

        int largest = arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static boolean isPalindrome(String str) {
        // Remove all non-alphanumeric characters and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false; // Characters at left and right positions don't match
            }
            left++;
            right--;
        }

        return true; // All characters matched, so it's a palindrome
    }
public static int factorial(int number)
    {
        int fact = 1;
        for(int i=1;i<=number;i++)
        {
            fact = fact*i;
        }

        return fact;
    }

    public static void printFibonacciSeries(int num)
    {
        int firstTerm = 0;
        int secondTerm = 1;
        for(int i=0;i<num;i++)
        {
            System.out.print(firstTerm+" ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static boolean isPrime(int num)
    {

        for(int i=2;i<num;i++)
        {
            if(num%i==0) {
                return false;
            }
        }
     return true;
    }

    public static boolean isAnagram(String str1, String str2)
    {
        str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z]","").toLowerCase();
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);
    }

    public static void bubbleSort(int[] arr)
    {
       int n = arr.length;
       boolean swapped;
       for(int i=0;i<n;i++)
       {
           swapped = false;
           for(int j=0;j<n-1;j++)
           {
               if(arr[j] > arr[j+1])
               {
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   swapped = true;
               }
           }
           if(!swapped)
           {
               break;
           }
       }
    }
     public static void mergeSort(int[] arr, int left, int right)
     {
         if(left < right)
         {
             //find the middle point to divide array into 2 halves
             int mid = left + (right-left) / 2;
             // Recursive calls to mergeSort for each half
             mergeSort(arr, left, mid);
             mergeSort(arr, mid + 1, right);

             // Merge the two sorted halves
             merge(arr, left, mid, right);
         }

     }

    public static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of the two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays to hold the elements of the two subarrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // Merge the two sorted arrays back into arr
        int i = 0, j = 0;
        int k = left; // Initial index of merged subarray

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray, if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray, if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static int binarySearch(int[] arr,int target)
    {
        int low = 0;
        int high = arr.length-1;
        while(low<high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid] == target)
            {
                return mid;
            } else if(arr[mid] < target)
            {
                low = mid+1;
            } else
            {
                high = mid-1;
            }

        }
        return -1;
    }


    public static void findDuplicates(int[] arr)
    {
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();

        for (int num : arr) {
            if (!uniqueElements.add(num)) {
                // If the element is already present in uniqueElements set, it's a duplicate
                duplicateElements.add(num);
            }
        }
        System.out.println("Duplicate elements in the array: " + duplicateElements);
        System.out.println("Unique elements in the array:"+uniqueElements);
    }
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }


}





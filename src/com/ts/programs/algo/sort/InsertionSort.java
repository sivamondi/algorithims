package com.ts.programs.algo.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int inputArray[] = {5,2,4,6,1,3,8,10,7};

        // print before sorting
        System.out.println("Unsorted Values..:"+Arrays.toString(inputArray));


        // sort array
        doInsertionSort(inputArray);

        // print after sorting
        System.out.println("Sorted Values....:"+Arrays.toString(inputArray));


    }

    public static void doInsertionSort(final int[] inputArray) {

        // Start with second element
        for (int i = 1; i < inputArray.length; i++) {

            int tempValue = inputArray[i]; // Store the value into temp variable

            int j = i-1;


            while (j >= 0 && inputArray[j] > tempValue) {
                // if before the value of 'i' is bigger, switch values
                inputArray[j + 1] = inputArray[j];
                inputArray[j] = tempValue;
                j = j - 1;
            }

        }

    }
}

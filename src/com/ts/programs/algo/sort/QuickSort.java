package com.ts.programs.algo.sort;

import java.util.Arrays;

public class QuickSort {



    public static void main(String[] args) {
        int n = 2;

    }

   // public void xMethod()

    public static void doQuickSort(final int[] inputArray) {

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

    private static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
}

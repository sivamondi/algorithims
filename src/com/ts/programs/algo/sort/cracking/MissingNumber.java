package com.ts.programs.algo.sort.cracking;

/**
 * Missing Number: Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 */
public class MissingNumber {

    public static void main(String[] args) {

        int[] array = {0,1,2,3};

        int missedNum = missingNumber(array);

        System.out.println(missedNum);
    }

    public static int missingNumber(int[] array) {

        int arraySum = 0;
        int expectedSum = 0;
        for(int i = 0; i<array.length; i++) {
            arraySum = arraySum +  array[i];
            expectedSum = expectedSum + (i+1);
        }

        return expectedSum - arraySum;
    }
}

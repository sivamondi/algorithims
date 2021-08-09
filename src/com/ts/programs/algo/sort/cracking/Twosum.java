package com.ts.programs.algo.sort.cracking;

import java.util.Arrays;

public class Twosum {
    public static void main(String[] args) {


    }

    public static int[] twoSums(int[] array, int target) {
        int[] result = new int[2];



        for (int i = 0; i < array.length; i++) {


            for(int j = i+1; j< array.length; j++) {

                if( (array[i] + array[j]) == target) {

                    result[0] = i;
                    result[1] = j;
                    return result;
                }

            }

        }

        return null;

    }
}

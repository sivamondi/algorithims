package com.ts.programs.algo.sort.cracking;

import java.util.HashMap;
import java.util.Map;

public class TwoSumNotSorted1 {

    /*
    Given an array of integers and a target integer, return the INDICES of the two numbers that add up to the target. Exactly
one solution exists. You cannot use the same element twice.
Input: nums=[2,7,11,15], target=9 Output: [0,1]
nums[0]+nums[1] = 2+7 = 9 ✓
Input: nums=[3,2,4], target=6 Output: [1,2]
Input: nums=[3,3], target=6 Output: [0,1]
Input: nums=[1,2,3], target=10 Output: no solution (guaranteed one exists)
     */
    public static void main(String[] args) {

        int[] array = {2, 7, 11,15};
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i< array.length; i++) {
           int complement = target- array[i];
           if (map.containsKey(complement)) {
               System.out.println(i);
               System.out.println(map.get(complement));
               return;
           }else {
               map.put(array[i], i);
           }
        }

        System.out.println("No Solution");
    }
}

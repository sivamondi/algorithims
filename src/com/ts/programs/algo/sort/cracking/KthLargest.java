package com.ts.programs.algo.sort.cracking;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Kath Largest
 */
public class KthLargest {

    public static void main(String[] args) {
        int arr[] = {3,3,3,1,2,4,5,5,6};
        // 1, 2, 3, 4, 5, 6
        int result = kThLargest(arr, 4);

        System.out.println(result);

    }

    public static int kThLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

       // PriorityQueue<Integer> minHeap = new PriorityQueue<>(10, Collections.reverseOrder());


        for(int i=0; i< nums.length; i++){
            minHeap.add(nums[i]);

            if(minHeap.size() > k) {
                minHeap.remove();
            }

        }

        return minHeap.remove();
    }
}


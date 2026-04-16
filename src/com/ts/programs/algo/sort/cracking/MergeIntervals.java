package com.ts.programs.algo.sort.cracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of intervals [start, end], merge all overlapping intervals
 * and return the non-overlapping result covering all
 * input intervals.
 * Input: [[1,3],[2,6],[8,10],[15,18]] Output: [[1,6],[8,10],[15,18]]
 * [1,3] and [2,6] overlap → merge to [1,6]
 * Input: [[1,4],[4,5]] Output: [[1,5]]
 * Touching at 4 counts as overlapping
 * Input: [[1,4],[0,4]] Output: [[0,4]]
 * Unsorted input — must sort by start first
 * Input: [[1,4]] Output: [[1,4]]
 */
public class MergeIntervals {

    public static void main(String[] args) {
        int[][] intervals = { {2,6}, {1,3}, {8,10}, {15,18} };

        int[][] result = merge(intervals);

        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }

    public static void printIntervals(int[][] intervals) {
        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        // Sort by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));



        printIntervals(intervals);

        List<int[]> merged = new ArrayList<>();

        int[] current = intervals[0];
        merged.add(current);
        // [1,3]


        for (int[] next : intervals) {
            // If overlapping or touching
            if (current[1] >= next[0]) {
                current[1] = Math.max(current[1], next[1]);
            } else {
                current = next;
                merged.add(current);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}

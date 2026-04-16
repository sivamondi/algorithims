package com.ts.programs.algo.sort.cracking;
import java.util.*;
/*
Extends Two Sum to three elements. Tests multi-pointer technique and careful duplicate handling.
STEP-BY-STEP APPROACH:
1 Sort the array first.
2 Loop i from 0 to n-3. Skip duplicates: if nums[i] == nums[i-1], continue.
3 For each i, use two pointers: left = i+1, right = n-1.
4 If sum == 0 → add triplet, left++, right--. Skip duplicates on both sides.
5 If sum < 0 → left++ (need bigger). If sum > 0 → right-- (need smaller).
6 Continue until left >= right.
EDGE CASES — call these out loud:
• Array shorter than 3 → return empty
• All same numbers → only one triplet possible
• Skip duplicates carefully on i, left, AND right
 */
public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
        System.out.println(threeSum(new int[]{0,1,1}));
        System.out.println(threeSum(new int[]{0,0,0}));
        System.out.println(threeSum(new int[]{-2,0,0,2,2}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        if (nums == null || nums.length < 3) return res;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // skip duplicate fixed element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // skip duplicates for left
                    while (left < right && nums[left] == nums[left - 1]) left++;

                    // skip duplicates for right
                    while (left < right && nums[right] == nums[right + 1]) right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return res;
    }
}

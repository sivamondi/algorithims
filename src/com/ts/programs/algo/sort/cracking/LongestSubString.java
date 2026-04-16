package com.ts.programs.algo.sort.cracking;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, find the length of the longest substring without repeating characters. A substring is a contiguous
 * sequence of characters.
 * Input: 'abcabcbb' Output: 3 (substring 'abc')
 * Input: 'bbbbb' Output: 1 (substring 'b')
 * Input: 'pwwkew' Output: 3 (substring 'wke', not 'pwke')
 * Input: '' Output: 0 (empty string)
 * Input: 'a' Output: 1
 */
public class LongestSubString {
    // Sliding window Technique

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // 3
        System.out.println(lengthOfLongestSubstring(""));         // 0
        System.out.println(lengthOfLongestSubstring("a"));        // 1
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            // If duplicate found, shrink window from left
            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(current);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}

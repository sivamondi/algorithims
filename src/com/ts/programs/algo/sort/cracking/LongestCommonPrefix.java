package com.ts.programs.algo.sort.cracking;

/*
Longest common prefix: Write a function to find the longest common prefix string amongst an array of strings.

 */
public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"kaabcd", "abcde", "abcdef"};

        String prefix = getLongestCommonPrefix(strs);

        System.out.println(prefix);

    }

    public static String getLongestCommonPrefix(String[] strs) {

        String longestCommonPrefix = "";

        if (strs == null || strs.length == 0) {
            return longestCommonPrefix;
        }

        for (int index = 0; index<strs[0].length(); index ++) {

            char c = strs[0].charAt(index);

            for (int j = 1; j < strs.length; j++) {

                if (index >= strs[j].length() || c != strs[j].charAt(index)) {
                    return longestCommonPrefix;
                }

            }

            longestCommonPrefix = longestCommonPrefix + c;



        }

        return longestCommonPrefix;
    }
}

package com.ts.programs.algo.sort.cracking;

import java.util.*;
/*
Problem statement (clean version)

Given a string containing shuffled characters, where those characters are formed by concatenating the English words of digits (e.g., "zero", "one", ..., "nine"), reconstruct the original digits and return them in sorted order.

Example
Input: "owoztneoer"
Explanation: can be rearranged into "one" + "two" + "zero"
Output: "012"
 */
public class ReconstructOrginalDigits {

    public static void main(String[] args) {



        String s = "reuonnoinfe";

        String s1 = jumbled(s);

        System.out.println(s1);


    }



    public static String jumbled(String s) {
        s = s.toLowerCase();
        int[] count = new int[26];

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        int[] digitCount = new int[10];

        // Step 1: Identify digits using unique characters
        digitCount[0] = count['z' - 'a']; // zero
        digitCount[2] = count['w' - 'a']; // two
        digitCount[4] = count['u' - 'a']; // four
        digitCount[6] = count['x' - 'a']; // six
        digitCount[8] = count['g' - 'a']; // eight

        // Step 2: Deduct counts and find remaining digits
        digitCount[3] = count['h' - 'a'] - digitCount[8]; // three
        digitCount[5] = count['f' - 'a'] - digitCount[4]; // five
        digitCount[7] = count['s' - 'a'] - digitCount[6]; // seven

        digitCount[1] = count['o' - 'a'] - digitCount[0] - digitCount[2] - digitCount[4]; // one
        digitCount[9] = count['i' - 'a'] - digitCount[5] - digitCount[6] - digitCount[8]; // nine

        // Step 3: Build result in sorted order
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < digitCount[i]; j++) {
                result.append(i);
            }
        }

        return result.toString();
    }




}
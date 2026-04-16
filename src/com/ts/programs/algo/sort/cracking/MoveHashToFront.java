package com.ts.programs.algo.sort.cracking;
/*
Write a function that accepts a string containing '#' characters mixed with other characters. Move all '#' characters to the
front of the string. All other characters must maintain their relative order. Return the modified string.
Input: 'ab#cd#ef' Output: '##abcdef'
Input: '###abc' Output: '###abc' (already at front)
Input: 'abc' Output: 'abc' (no hashes)
Input: '#' Output: '#'
Input: '' Output: '' (empty string)
Input: '####' Output: '####' (all hashes)
Input: 'a#b#c#' Output: '###abc'
 */
public class MoveHashToFront {
    public static void main(String[] args) {
        System.out.println(moveHashes("ab#cd#ef")); // ##abcdef
        System.out.println(moveHashes("###abc"));    // ###abc
        System.out.println(moveHashes("abc"));       // abc
        System.out.println(moveHashes("#"));         // #
        System.out.println(moveHashes(""));          // ""
        System.out.println(moveHashes("####"));      // ####
        System.out.println(moveHashes("a#b#c#"));    // ###abc
    }

    public static String moveHashes(String s) {
        if (s == null || s.isEmpty()) return s;

        StringBuilder nonHashes = new StringBuilder();
        int hashCount = 0;

        for (char c : s.toCharArray()) {
            if (c == '#') {
                hashCount++;
            } else {
                nonHashes.append(c);
            }
        }

        StringBuilder result = new StringBuilder(s.length());

        for (int i = 0; i < hashCount; i++) {
            result.append('#');
        }

        result.append(nonHashes);

        return result.toString();
    }
}

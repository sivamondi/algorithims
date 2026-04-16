package com.ts.programs.algo.sort.cracking;

/*
Rahul copies from his neighbour and rearranges the letters to avoid detection.
Given two words, return 1 if Rahul copied
(words are anagrams of each other) or 0 if not. Comparison is case-insensitive.
Input: word1='CAR', word2='Acr' Output: 1 (same letters, case ignored)
Input: word1='CAR', word2='Cat' Output: 0 (different letters)
Input: word1='listen', word2='silent' Output: 1
Input: word1='abc', word2='ab' Output: 0 (different lengths → always 0)
Input: word1='aab', word2='bba' Output: 0 (different frequency: a≠b count)
 */
public class CopyCat {

    public static void main(String[] args) {
        System.out.println(isCopied("CAR", "Acr"));     // 1
        System.out.println(isCopied("CAR", "Cat"));     // 0
        System.out.println(isCopied("listen", "silent"));// 1
        System.out.println(isCopied("abc", "ab"));       // 0
        System.out.println(isCopied("aab", "bba"));      // 0
    }

    public static int isCopied(String word1, String word2) {
        if (word1 == null || word2 == null) return 0;

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        if (word1.length() != word2.length()) return 0;

        int[] freq = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            freq[word1.charAt(i) - 'a']++;
            freq[word2.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) return 0;
        }

        return 1;
    }
}

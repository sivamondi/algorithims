package com.ts.programs.algo.sort.cracking;

/*
Valid Palindrome: Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 */
public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("abc"));
    }

    public static boolean isPalindrome(String s) {
        int lo = 0;
        int hi = s.length() - 1;

        while (lo < hi) {
            while (lo < hi && !Character.isLetterOrDigit(s.charAt(lo))) {
                lo++;
            }

            while (lo < hi && !Character.isLetterOrDigit(s.charAt(hi))) {
                hi--;
            }

            if (lo < hi && Character.toLowerCase(s.charAt(lo++)) != Character.toLowerCase(s.charAt(hi--))) {
                return  false;
            }
        }

        return  true;

    }
}

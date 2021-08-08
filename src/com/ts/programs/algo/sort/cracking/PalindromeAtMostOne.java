package com.ts.programs.algo.sort.cracking;

/*
Valid Palindrome: Given a string s, determine if it is a palindrome, You may delete atmost one character and judge

 */
public class PalindromeAtMostOne {

    public static void main(String[] args) {

        System.out.println(validPalindrome("abddfc"));
    }

    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            if (i < j && s.charAt(i++) != Character.toLowerCase(s.charAt(j--))) {
                return  isPalindrome(s, i+1, j) || isPalindrome(s, i, j--);
            }
        }
        return  true;
    }

    public static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if(s.charAt(i++) != s.charAt(j--)) {
                return  false;
            }
        }
        return true;
    }
}

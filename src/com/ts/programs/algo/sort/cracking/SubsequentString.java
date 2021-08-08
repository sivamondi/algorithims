package com.ts.programs.algo.sort.cracking;

/*
Subsequence String: Given two strings s and t, return true if s is a subsequence of  t, or false otherwise.

Optimization: if any one charcter not matching in t string, break the loop
 */
public class SubsequentString {

    public static void main(String[] args) {

        String t = "abcde";
        String s = "abc";
        System.out.println(isSubsequent(t,s));
    }

    public static boolean isSubsequent(String t, String s) {


        int index = 0;
        for (int i = 0; i < s.length(); i++){

           if(t.charAt(index) == s.charAt(i)) {
               index++;
           }

           if(index >= s.length()) {
               return true;
           }

        }

        return false;
    }
}

package com.ts.programs.algo.sort.cracking;

/*
Subsequence String: Given two strings s and t, return true if s is a subsequence of  t, or false otherwise.

 */
public class SubsequentString {

    public static void main(String[] args) {

        String t = "abcde";
        String s = "abcf";
        System.out.println(isSubsequent(t,s));
    }

    public static boolean isSubsequent(String t, String s) {


        int index = 0;
        for (int i = 0; i < t.length(); i++){

           if(t.charAt(i) == s.charAt(index)) {
               index++;
           }

           if(index >= s.length()) {
               return true;
           }

        }

        return false;
    }
}

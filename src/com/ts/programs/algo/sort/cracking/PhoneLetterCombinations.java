package com.ts.programs.algo.sort.cracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 * Return the answer in any order.
 *
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 */
public class PhoneLetterCombinations {

    public static void main(String[] args) {
        String digits = "234";

        List<String> results = letterCombinations(digits);

        for(int i=0;i<results.size();i++) {
            System.out.println(results.get(i));
        }
    }

    public static List<String> letterCombinations(String s) {

        List<String> results = new ArrayList<>();
        if(s == null || s.isEmpty()) {
            return results;
        }


        Map<String, String> digitToLetter = new HashMap<>();
        digitToLetter.put("0","");
        digitToLetter.put("1","");
        digitToLetter.put("2","abc");
        digitToLetter.put("3","def");
        digitToLetter.put("4","ghi");
        digitToLetter.put("5","jkl");
        digitToLetter.put("6","mno");
        digitToLetter.put("7","pqrs");
        digitToLetter.put("8","tuv");
        digitToLetter.put("9","wxyz");

        letterCombRecursive(results,s, "", 0, digitToLetter);

        return results;

    }

    public static void letterCombRecursive(List<String> results, String digits, String current,int index, Map<String,String> mappings ) {
        if(index == digits.length()) {
            results.add(current);
            return;
        }


        String letters = mappings.get(""+digits.charAt(index));
        for (int i =0; i < letters.length() ; i++) {
            letterCombRecursive(results, digits, current + letters.charAt(i), index + 1, mappings);
        }

    }
}

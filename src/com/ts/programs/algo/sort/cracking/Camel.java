package com.ts.programs.algo.sort.cracking;

import java.util.*;

public class Camel {

    public static void main(String[] args) {



        String s = "reuonnoinfe";

        String s1 = jumbled(s);

        System.out.println(s1);


    }



    public static String jumbled(String s) {

        StringBuilder sb = new StringBuilder(s);

        Map<String,Integer>  map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("ten", 10);

        String result = "";

        while(sb.length() != 0) {


            for(String numWord: map.keySet()) {
               boolean matchFound = isMatchFound(numWord, sb);

               if(matchFound) {
                   result += map.get(numWord);
               }

            }

        }

        char[] chars = result.toCharArray();

        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;

    }

    private static boolean isMatchFound(String word, StringBuilder input){
        boolean matchFound = true;
        String original = input.toString();
        for(int i=0;i<word.length();i++) {
            if(input.indexOf(""+ word.charAt(i)) < 0) {
                matchFound = false;
                break;
            }
        }

        if(matchFound) {
            for(int i=0;i<word.length();i++) {
                input = input.deleteCharAt(input.indexOf(""+word.charAt(i)));
            }
        }

        return matchFound;
    }


}
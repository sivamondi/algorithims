package com.ts.programs.algo.sort.cracking;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {

        String s = "MCMXCIV";

        int result = romanToInt(s);

        System.out.println(result);
    }

    public static int romanToInt(String s) {

        if(s == null || s.isEmpty()) {
            return 0;
        }

        Map<Character,Integer> mappings = new HashMap<>();
        mappings.put('I', 1);
        mappings.put('V', 5);
        mappings.put('X', 10);
        mappings.put('L', 50);
        mappings.put('C', 100);
        mappings.put('D', 500);
        mappings.put('M', 1000);

        int result = 0;

        // check the first char

        for(int i=0; i < s.length(); i++) {

            if(s.length() > i+1 && s.charAt(i) == 'I' && (s.charAt(i+1) == 'V' ||
                    s.charAt(i+1) == 'X')) {
                result += (mappings.get(s.charAt(i+1)) - mappings.get(s.charAt(i)));
                i++;
            } else if(s.length() > i+1 && s.charAt(i) == 'X' && (s.charAt(i+1) == 'L' ||
                    s.charAt(i+1) == 'C')) {
                result += (mappings.get(s.charAt(i+1)) - mappings.get(s.charAt(i)));
                i++;
            } else if(s.length() > i+1 && s.charAt(i) == 'C' && (s.charAt(i+1) == 'D' ||
                    s.charAt(i+1) == 'M')) {
                result += (mappings.get(s.charAt(i+1)) - mappings.get(s.charAt(i)));
                i++;
            }else {

                result += mappings.get(s.charAt(i));
            }
        }

        return result;
    }
}

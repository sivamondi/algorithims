package com.ts.programs.algo.sort.cracking;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**

 *  Optimizing
 *
 */
public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String a = "Abbac";
        int index = uniqueCharIndex(a);

        System.out.println("match="+index);
    }

    public static int uniqueCharIndex(String s) {
        Map<Character, Integer> charFreq = new HashMap<>();

        for(int i=0;i<s.length();i++) {
            if(!charFreq.containsKey(s.charAt(i))) {
                charFreq.put(s.charAt(i), i);
            }else {
                charFreq.put(s.charAt(i), s.length()+1);
            }
        }

        int minIndex = Integer.MAX_VALUE;

        for(int i: charFreq.values()) {
            minIndex = Math.min(minIndex, i);
        }


        return minIndex > s.length() ? -1 : minIndex;

    }
}

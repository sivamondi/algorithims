package com.ts.programs.algo.sort.cracking;

import java.util.AbstractCollection;

/**
 * A message containing letters from A-Z can be encoded into numbers using the following mapping:
 * 'A' -> "1"
 * 'B' -> "2"
 * ...
 * 'Z' -> "26"
 *
 * // Optimize:
 *
 */
public class DecodeAMessage {
    public static void main(String[] args) {

        String s = "123";



        int ways = waysToDecode(s);

        System.out.println(ways);
    }

    public static int waysToDecode(String s) {

        int[] dpArray = new int[s.length() + 1];
        dpArray[0] = 1;
        dpArray[1] = s.charAt(0) == '0' ? 0: 1;

        for(int i = 2; i <= s.length(); i++) {
            int oneDigit = Integer.valueOf(s.substring(i-1, i));
            int twoDigits = Integer.valueOf(s.substring(i-2, i));

            if(oneDigit >= 1) {
                dpArray[i] += dpArray[i-1];
            }

            if(twoDigits >= 10 && twoDigits <= 26) {
                dpArray[i] += dpArray[i-2];
            }

        }

        return dpArray[s.length()];
    }
}

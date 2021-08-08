package com.ts.programs.algo.sort.cracking;

public class Capitalize {
    public static void main(String[] args) {
        String a = "hello world    I am a       Man ";
        String upper = capitalize(a);

        System.out.println("upper="+upper+":");
    }

    public static String capitalize(String s) {
        if(s == null || s.isEmpty()) {
            return s;
        }

        String[] subStrings = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<subStrings.length;i++) {

            String word = subStrings[i];

            if(subStrings[i].length() > 0) {
                word = "" + Character.toUpperCase(subStrings[i].charAt(0));
            }

            if (subStrings[i].length() > 1) {
                word += subStrings[i].substring(1);
            }

            sb.append(word);

            if(i+1 < subStrings.length) {
                sb.append(" ");
            }
        }

        return  sb.toString();

    }
}

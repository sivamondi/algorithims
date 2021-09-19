package com.ts.programs.algo.sort.cracking;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ReadLine1 {
    public static void main(String[] args) throws IOException  {

        String input = "776 a+bcd";

        System.out.println(patternCount(input));





    }


    public static String patternCount(String input) {


        String words[] = input.split(" ");

        String digit = words[0];
        String pattern = words[1];

        System.out.println(digit);
        System.out.println(pattern);

        String[] patternWords  = new String[2];

        String operation = "";

        if(pattern.contains("+")) {
            String[] tmp = pattern.split("\\+");
            patternWords[0] = tmp[0];
            patternWords[1] = tmp[1];
            operation = "ADD";
        }else if(pattern.contains("-")) {
            String[] tmp = pattern.split("-");

            patternWords[0] = tmp[0];
            patternWords[1] = tmp[1];

            operation = "SUB";


        }




        String firstDigit = digit.substring(0,patternWords[0].length());
        String secondDigit = digit.substring(patternWords[0].length());

        System.out.println(firstDigit);
        System.out.println(secondDigit);

        long  l1 = Long.parseLong(firstDigit);
        long  l2 = Long.parseLong(secondDigit);

        long result = 0;

        if("ADD".equals(operation)) {
            result = l1+l2;
        } else if("SUB".equals(operation)) {
            result = l1-l2;
        }



        return String.valueOf(result);

    }



}

package com.ts.programs.algo.sort.cracking;

public class StringMultiply {
    public static void main(String[] args) {


        String result = multiply("498828660196","840477629533");

        System.out.println(result);
    }

    public static String multiply(String num1, String num2) {
        long n1 = 0, factor = 1;
        for (int i = num1.length()-1; i >= 0; i--) {
            n1 += (num1.charAt(i) - '0') * factor;
            factor *= 10;
        }

        long n2 = 0;
        factor = 1;
        for (int i = num2.length()-1; i >= 0; i--) {
            n2 += (num2.charAt(i) - '0') * factor;
            factor *= 10;
        }

        long result = n1 * n2;

        return ""+result;
    }
}

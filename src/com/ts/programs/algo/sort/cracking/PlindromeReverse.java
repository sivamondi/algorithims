package com.ts.programs.algo.sort.cracking;

/**
 * Given an integer, add it with the reverse of the value, and check if it’s a palindrome.
 * If it isn’t a palindrome, repeat the process until the sum is a palindrome. Print out the number of iterations and the value of the final palindrome
 *
 */
public class PlindromeReverse {

    public static void main(String[] args) {
            reverseAndPalindrome(543889987);
    }


    public static void reverseAndPalindrome(long num) {

        int noOfIterations = 0;
        while (noOfIterations < 1000) {

            noOfIterations++;

            long reversedNumber = reverseNum(num);
            num = num + reversedNumber;

            if(num == reverseNum(num)) {
                System.out.println(noOfIterations+" "+num);
                break;
            }else if (num > 4294967295l)
            {
                System.out.println("No palindrome exist");
                break;
            }

        }
    }

    public static long reverseNum(long n) {
        long reverseNumber = 0;
        while (n > 0) {
            reverseNumber = reverseNumber *10 + n%10;
            n = n/10;
        }
        return reverseNumber;
    }
}

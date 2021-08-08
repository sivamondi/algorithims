package com.ts.programs.algo.sort.cracking;

import java.util.HashSet;
import java.util.Set;

/*

2.)Happy Number: Write an algorithm to determine if a number n is happy.
A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Improvement: 82 and 28 resulting a same answer so no need to compute
 */
public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappyNumber(19));
    }

    public static boolean isHappyNumber(int number) {

        Set<Integer> checkedSet = new HashSet<>();
        boolean isHappy = false;

        while (true) {

            // Number doesn't exist in checked set
            int current = number;
            int sum = 0;

            while (current != 0) {
                sum = sum + (current % 10) * (current % 10);
                current = current / 10;
            }

            if (sum == 1) {
                isHappy = true;
                break;
            }

            if (checkedSet.contains(sum)) {
                isHappy = false;
                break;
            }

            number = sum;
            checkedSet.add(sum);

        }

        return  isHappy;
    }

}


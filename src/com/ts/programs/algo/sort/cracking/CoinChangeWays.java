package com.ts.programs.algo.sort.cracking;

import java.util.Arrays;

public class CoinChangeWays {

    /*
    Given an infinite number of quarters (25 cents), dimes (1O cents), nickels (5 cents), and pennies (1 cent),
    write code to calculate the number of ways of representing n cents.

    Optmize:

     */

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};
        int amount = 1;

        System.out.println(numberOfWays(coins, amount));


    }
    public static int numberOfWays(int coins[], int amount) {

        int [] dpArray = new int[amount+1];

        dpArray[0] = 1;

        for (int i=0; i<coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                int previousDp = dpArray[j - coins[i]];
                dpArray[j] = dpArray[j] + previousDp;
            }
        }

        return dpArray[amount];
    }
}

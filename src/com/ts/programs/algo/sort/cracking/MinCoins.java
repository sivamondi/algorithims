package com.ts.programs.algo.sort.cracking;

public class MinCoins {

    /*
   Coin Match:You are given an integer array of coins representing coins of different denominations and an integer amount representing a total amount of money.
Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
You may assume that you have an infinite number of each kind of coin.

     */

    public static void main(String[] args) {

        int[] coins = {1, 2, 10, 25};

        int fewCoins = fewestNumberOfCoins(4, coins);

        System.out.println("few coins..." + fewCoins);

    }

    public static int fewestNumberOfCoins(int amount, int[] coins) {

        int[] dpArray = new int[amount + 1];

        // fill array with default values, larger than amount
        for (int i = 0; i < dpArray.length; i++) {
            dpArray[i] = Integer.MAX_VALUE;
        }

        // minimum coins required to fill zero coins are zero
        dpArray[0] = 0;


        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j <= amount; j++) {
                if (coins[i] <= j) {
                    dpArray[j] = Math.min(dpArray[j], 1 + dpArray[j - coins[i]]);
                }
            }
        }

        return dpArray[amount] == Integer.MAX_VALUE ? -1 : dpArray[amount];
    }
}

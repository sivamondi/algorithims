package com.ts.programs.algo.sort.cracking;

public class CoinChangeWays {

    /*
    Given an infinite number of quarters (25 cents), dimes (1O cents), nickels (5 cents), and pennies (1 cent),
    write code to calculate the number of ways of representing n cents.
     */

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};
        int amount = 5;

        int[][] map = new int[amount+ 1][coins.length];

        int ways =  numberOfWays(amount, coins);

        System.out.println("ways..."+ways);

    }

    public static int numberOfWays(int amount, int[] coins) {

        int[][] dpArray = new int[amount + 1][1];

        // fill array with default values, larger than amount
        for (int i = 0; i < dpArray.length; i++) {
            dpArray[i][0] = -1;
        }

        // minimum coins required to fill zero coins are zero
        dpArray[0][0] = 0;


        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j <= amount; j++) {
                if (coins[i] <= j) {

                    int ways = Math.max(dpArray[j][0], dpArray[j - coins[i]][0]);

                    dpArray[j][0] = ways;
                }
            }
        }

        return dpArray[amount][0] == Integer.MAX_VALUE ? -1 : dpArray[amount][0];
    }
}

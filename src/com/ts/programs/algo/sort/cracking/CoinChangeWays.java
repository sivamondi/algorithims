package com.ts.programs.algo.sort.cracking;

public class CoinChangeWays {

    /*
    Given an infinite number of quarters (25 cents), dimes (1O cents), nickels (5 cents), and pennies (1 cent),
    write code to calculate the number of ways of representing n cents.
     */

    public static void main(String[] args) {

        int[] coins = {25, 10, 5, 1};

        int ways =  getWaysOfChange(5, coins, 0);

        System.out.println("ways..."+ways);

    }

    public static int getWaysOfChange(int amount, int[] coins, int index) {
        if (index >= coins.length - 1) {
            return 1;
        }

        int denomination = coins[index];
        int ways = 0;

        for (int i= 0; i * denomination <= amount; i++) {
            int amountRemaining = amount - i * denomination;
            ways += getWaysOfChange(amountRemaining, coins, index + 1);
        }
        return ways;
    }
}

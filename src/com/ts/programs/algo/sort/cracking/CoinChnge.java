package com.ts.programs.algo.sort.cracking;
/*
Given coin denominations and an amount, return the FEWEST coins needed to make that amount. Return -1 if
impossible. You have unlimited supply of each coin.
        Input: coins=[1,5,10,25], amount=36 Output: 3 (25+10+1)
Input: coins=[1,2,5], amount=11 Output: 3 (5+5+1)
Input: coins=[2], amount=3 Output: -1 (impossible)
Input: coins=[1], amount=0 Output: 0 (no coins needed)
Input: coins=[186,419,83,408], amount=6249 Output: 20
*
 */
public class CoinChnge {

    public static void main(String[] args) {
        System.out.println(change(new int[]{1, 5, 10, 25}, 36)); // 3
        System.out.println(change(new int[]{1, 2, 5}, 11));       // 3
        System.out.println(change(new int[]{2}, 3));              // -1
        System.out.println(change(new int[]{1}, 0));              // 0
        System.out.println(change(new int[]{186,419,83,408}, 6249));
    }

    public static int change(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        // initialize with "infinity"
        for (int i = 0; i <= amount; i++) {
            dp[i] = amount + 1; // safe upper bound
        }

        dp[0] = 0;

        // build dp table
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];


    }
}

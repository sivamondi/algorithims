package com.ts.programs.algo.sort.cracking;

import java.util.ArrayList;
import java.util.List;

/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 */
public class Paranthesis {

    public static void main(String[] args) {

        int i = 10;

        List<String> s = generateParenthesis(i);

        for(String s1: s ) {
            System.out.println(s1);
        }
    }

    public static  List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        dfs(result, "", n, n);
        return result;
    }

    /*
left and right represents the remaining number of ( and ) that need to be added.
When left > right, there are more ")" placed than "(". Such cases are wrong and the method stops.
*/
    public static void dfs(List<String> result, String s, int left, int right){
        if(left > right)
            return;

        if(left==0&&right==0){
            result.add(s);
            return;
        }

        if(left>0){
            dfs(result, s+"(", left-1, right);
        }

        if(right>0){
            dfs(result, s+")", left, right-1);
        }
    }
}

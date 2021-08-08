package com.ts.programs.algo.sort.cracking;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {

    /*
     Valid Parentheses: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     An input string is valid if:
        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
     */
    public static void main(String[] args) {

        String s = "{{}}";

        boolean valid =  isValid(s);

        System.out.println("valid?..."+valid);

    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character > paranthesisPairs = new HashMap<>();
        paranthesisPairs.put('(',')');
        paranthesisPairs.put('{','}');
        paranthesisPairs.put('[',']');


        for(char c: s.toCharArray()) {

            if(paranthesisPairs.containsKey(c)) {
                stack.push(c);
            }else if(paranthesisPairs.containsValue(c) && !stack.isEmpty() && c == paranthesisPairs.get(stack.peek()) ) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();

    }
}

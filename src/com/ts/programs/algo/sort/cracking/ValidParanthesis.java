package com.ts.programs.algo.sort.cracking;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 Given a string containing only '(', ')', '{', '}', '[', ']', determine if the string is valid.
 Valid means every opening bracket has a
 matching closing bracket in the correct order.
 Input: '()' Output: true
 Input: '()[]{}' Output: true
 Input: '(]' Output: false
 Input: '([)]' Output: false
 Input: '{[]}' Output: true
 Input: '' Output: true (empty is valid)
 Input: '(' Output: false (unclosed)
 Input: ']' Output: false (no opener)
 */
public class ValidParanthesis {

    public static void main(String[] args) {
        String s1 = "(";
        char[] c = s1.toCharArray();
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> closedParMap = new HashMap<>();
        closedParMap.put(')','(');
        closedParMap.put('}','{');
        closedParMap.put(']','[');


        for (int i=0; i<c.length; i++) {

            if (closedParMap.containsKey(c[i])) {
                if (stack.empty() ||  stack.pop() != closedParMap.get(c[i])) {
                    System.out.println("invalid");
                    return;
                }
            }else {
                stack.push(c[i]);
            }
        }

        if (stack.empty()) {
            System.out.println("valid");
        }else {
            System.out.println("in valid");

        }
    }
}

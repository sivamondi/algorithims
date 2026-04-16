package com.ts.programs.algo.sort.cracking;

import java.util.Stack;

public class Paranthesis {

    public static void main(String[] args) {
        String s = "()[]{}";
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (char c: chars) {
            if(c == '(' || c == '[' || c == '{' ) {
                stack.push(c);
                continue;
            }

            if (c== ')') {
                if(stack.empty() || stack.pop() != '(') {
                    System.out.println(false);
                    return;
                }
            }

            if (c== '}') {
                if(stack.empty() || stack.pop() != '{') {
                    System.out.println(false);
                    return;
                }
            }

            if (c== ']') {
                if(stack.empty() || stack.pop() != '[') {
                    System.out.println(false);
                    return;
                }
            }


        }

        System.out.println(true);

    }
}

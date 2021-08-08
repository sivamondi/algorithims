package com.ts.programs.algo.sort.cracking;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 */

public class LargestNumber {
    public static void main(String[] args) {
        int[] a = {23, 34, 54, 62};

        String s = largestNumber(a);

        System.out.println(s);

    }

    public static String largestNumber(int[] nums) {

        if(nums.length == 0) {
            return "";
        }

        String[] sa = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            sa[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(sa, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String o1 = a + b;
                String o2 = b + a;
                return o2.compareTo(o1);
            }
        });

        if(sa[0].equals("0")) {
            return "0";
        }

        StringBuffer sb = new StringBuffer();
        for(String s: sa) {
            sb.append(s);
        }
        return sb.toString();

    }
}

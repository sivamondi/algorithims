package com.ts.programs.algo.sort.cracking;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ReadLine {
    public static void main(String[] args) throws IOException  {

        int [] a = new int[1000000];
        for(int i=0; i<10000; i++) {
            a[i] = 67;
        }

        long l1 = System.currentTimeMillis();

       System.out.println(broken(a));
        long l2 = System.currentTimeMillis();

        System.out.print("time.."+(l2-l1));


    }


    public static long broken(int[] a) {

        long pairs = 0;
        Map<Integer, Integer> map = new HashMap<>();

        long l1 = System.currentTimeMillis();
        for(int i =0; i< a.length ; i++) {

            int num = a[i];
            int ones = getNumberOfOnes(num);

            a[i] = ones;

        }
        long l2 = System.currentTimeMillis();

        System.out.println("no of 1="+(l2-l1));


        // count pairs
        HashSet<Integer> checkdOnes = new HashSet<>();

        for(int i=0; i< a.length; i++ ){
            int k1Ones = a[i];
            checkdOnes.add(i);
            for(int j=i;j<a.length; j++) {
                int k2Ones = a[j];
                if(!checkdOnes.contains(j) && k1Ones == k2Ones) {
                    pairs ++;
                }
            }
        }


        return pairs;


    }


    public static int getNumberOfOnes(int num) {

        int total=0;
        for (total = 0; num > 0; ++total) {
            num &= num - 1;
        }

        return total;
    }


}

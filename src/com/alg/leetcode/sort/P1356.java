package com.alg.leetcode.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P1356 {

    class Solution {
        public int[] sortByBits(int[] arr) {

            Integer[] sz = new Integer[arr.length];
            for (int i = 0; i < arr.length; i++) {
                sz[i] = new Integer(arr[i]);
            }

            List<Integer> list = Arrays.asList(sz);

            Collections.sort(list, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    Integer i1 = (Integer) o1;
                    Integer i2 = (Integer) o2;
                    int bit1 = Integer.bitCount(i1);
                    int bit2 = Integer.bitCount(i2);

                    if (bit1 == bit2) return i1.compareTo(i2);
                    return bit1 - bit2;
                }
            });

            for (int i = 0; i < sz.length; i++) {
                arr[i] = sz[i].intValue();
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        int n = Integer.bitCount(7);
        System.out.println(n);
    }
}

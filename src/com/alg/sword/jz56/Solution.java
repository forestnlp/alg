package com.alg.sword.jz56;

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param array int整型一维数组
     * @return int整型一维数组
     */
    public int[] FindNumsAppearOnce(int[] array) {
        // write code here

        int[] two = new int[2];

        //取出异或
        int mn = 0;
        for (int n : array) {
            mn ^= n;
        }

        int mask = 1;
        while ((mn & mask) == 0) {
            mask <<= 1;
        }

        int a = 0, b = 0;
        //取出分别与mask与
        for (int n : array) {
            if ((n & mask) == 0) {
                a ^= n;
            } else {
                b ^= n;
            }
        }

        two[0] = Math.min(a, b);
        two[1] = Math.max(a, b);
        return two;
    }

    public static void main(String[] args) {
        int[] two =new Solution().FindNumsAppearOnce(new int[]{1,2,3,2,3,5});
        System.out.println(Arrays.asList(two));
    }
}
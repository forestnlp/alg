package com.alg.sword.jz14;

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param n int整型
     * @return int整型
     */
    public int cutRope(int n) {
        // write code here
        int[] maxn = new int[n+1];

        for (int i = 1; i <= 4; i++) {
            maxn[i] = i;
        }

        int m = 5;
        while (m<=n){
            int max = 0;
            for(int i=m;i>1;i--){
                max = Math.max(i*maxn[m-i],max);
            }
            maxn[m] = max;
            m++;
        }
        return maxn[n];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().cutRope(8));
    }
}
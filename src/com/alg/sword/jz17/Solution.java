package com.alg.sword.jz17;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param n int整型 最大位数
     * @return int整型一维数组
     */
    public int[] printNumbers (int n) {
        // write code here
        int m = (int) Math.pow(10,n);
        int [] rtn = new int[m-1];
        for(int i=1;i<m;i++) {
            rtn[i-1] = i;
        }
        return rtn;
    }
}
package com.alg.sword.jz03;

public class Solution2 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param numbers int整型一维数组
     * @return int整型
     */
    public int duplicate(int[] numbers) {
        // write code here
        if(numbers == null || numbers.length == 0){
            return -1;
        }
        int[] containers = new int[numbers.length];
        for(int n:numbers){
            containers[n] += 1;
            if(containers[n]>1) return n;
        }
        return -1;
    }
}
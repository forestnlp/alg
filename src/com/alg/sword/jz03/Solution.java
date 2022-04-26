package com.alg.sword.jz03;

import java.util.HashSet;

public class Solution {
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
        HashSet<Integer> container = new HashSet<>();
        for (int n : numbers) {
            if (container.contains(n)) return n;
            container.add(n);
        }
        return -1;
    }

    public static void main(String[] args) {
        new Solution().duplicate(new int[]{1,2,3,4,5,63,3,3,4});
    }
}
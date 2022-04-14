package com.alg.sword.jz42;

public class Solution42 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for(int i=0;i<array.length;i++){
            cur +=array[i];
            max = Math.max(cur,max);
            if(cur<0) cur=0;
        }
        return max;
    }

    public static void main(String[] args) {
        Solution42 solution = new Solution42();
        int ans = solution.FindGreatestSumOfSubArray(new int[]{1, -2, 3, 10, -4, 7, 2, -5});
        System.out.println(ans);
    }
}
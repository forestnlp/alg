package com.alg.sword.jz81;

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param array int整型一维数组
     * @return int整型一维数组
     */
    public int[] reOrderArrayTwo(int[] array) {
        // write code here
        if (array == null || array.length == 0) return new int[0];
        int left = 0, right = array.length - 1;
        while (left<right){
            while (right>=0&&(array[right]&1)==0) {
                right--;
            }
            while (left<=array.length-1&&(array[left]&1)==1) {
                left++;
            }
            if(left<right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] res = solution.reOrderArrayTwo(new int[]{1,3,5});
        for(int r :res) {
            System.out.println(r);
        }
    }
}
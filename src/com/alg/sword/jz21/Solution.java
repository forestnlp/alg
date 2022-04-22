package com.alg.sword.jz21;

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param array int整型一维数组 
     * @return int整型一维数组
     */
    public int[] reOrderArray (int[] array) {
        // write code here
        int slow = 0,fast = 0;
        while (fast<array.length){
            if((array[fast]&1)!=0){
                int temp = array[fast];
                for(int k=fast-1;k>=slow;k--){
                    array[k+1]=array[k];
                }
                array[slow++]=temp;
            }
            fast++;
        }
        return array;
    }

    public static void main(String[] args) {
        new Solution().reOrderArray(new int[]{1});
    }
}
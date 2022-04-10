package com.alg.sword.jz03;

public class Solution3 {
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
        for (int i = 0; i < numbers.length; i++) {
            int a = numbers[i];
            if(a!=i) {
                if(numbers[a]==a) return a;
                swap(a,i,numbers);
            }
        }
        return -1;
    }

    public void swap(int a,int i,int[] numbers) {
        int temp  = numbers[a];
        numbers[a] = numbers[i];
        numbers[i] = temp;
    }
}
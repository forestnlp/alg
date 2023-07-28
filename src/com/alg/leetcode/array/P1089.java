package com.alg.leetcode.array;

public class P1089 {
    class Solution {
        public void duplicateZeros(int[] arr) {
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == 0){
                    int j = arr.length-1;
                    while(j > i){
                        arr[j] = arr[j-1];
                        j--;
                    }
                    //核心在这里，注意要跳一位
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new P1089().new Solution();
        int [] arr = {1, 0, 1, 2, 3, 4};
        solution.duplicateZeros(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }
}

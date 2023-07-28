package com.alg.leetcode.array;

public class P283 {
    class Solution {
        public void moveZeroes(int[] nums) {
            int fast=0,slow=0;
            for(fast=0;fast<nums.length;fast++){
                if (nums[fast]!=0){
                    nums[slow++]=nums[fast];
                }
            }
            for(int i=slow;i<nums.length;i++) {
                nums[i]=0;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new P283().new Solution();
        int[] array = new int[]{0,1,0,3,12};
        solution.moveZeroes(array);
        for(int a:array)
            System.out.printf("%d\t",a);
    }
}

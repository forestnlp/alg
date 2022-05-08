package com.alg.dog.arraylist.twopointer.leetcode283;

public class Solution {
    public void moveZeroes(int[] nums) {
        int fast = 0,slow=0;
        while (fast<nums.length){
            if(nums[fast]!=0){
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        for (int i = slow; i < nums.length; i++) {
            nums[i]=0;
        }
    }
}
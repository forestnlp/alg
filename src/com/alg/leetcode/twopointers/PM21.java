package com.alg.leetcode.twopointers;

public class PM21 {
    static class Solution {
        public int[] exchange(int[] nums) {
            int l = 0, r = nums.length-1;
            while (l<r){
                while (l<nums.length&&(nums[l]&1)==1) l++;
                while (r>0&&(nums[r]&1)==0) r--;
                if(l<r){
                    int temp = nums[l];
                    nums[l] = nums[r];
                    nums[r]= temp;
                }
            }
            return nums;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] res = solution.exchange(new int[]{1,3,5});
        for(int r:res)
            System.out.println(r);
    }
}

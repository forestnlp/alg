package com.alg.offer.dp.jumpgame1;

public class Leetcode55 {

    class Solution {
        public boolean canJump(int[] nums) {
            boolean[] dp = new boolean[nums.length];
            dp[nums.length-1] = true;
            int lastBoat = nums.length-1;
            for (int i = nums.length-2 ; i >=0 ; i--) {
                int step = nums[i];
                if(i+step>=lastBoat){
                    dp[i]=true;
                    lastBoat = i;
                }
                System.out.println("dp["+i+"]="+dp[i]);
            }
            return dp[0];
        }
    }

    public static void main(String[] args) {
        boolean b = new Leetcode55().new Solution().canJump(new int[]{2, 3, 1, 1, 4});
        System.out.println(b);
    }
}

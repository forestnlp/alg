package com.alg.sword.jz46;

import java.util.*;


public class Solution {
    /**
     * 解码
     * @param nums string字符串 数字串
     * @return int整型
     */
    public int solve (String nums) {
        // write code here
        int [] dp = new int[nums.length()];
        dp[0] = 1;
        for (int i = 1; i < nums.length(); i++) {
            char a = nums.charAt(i);
            String ba = String.valueOf(new char[]{nums.charAt(i-1),a});
            if(a!='0'){
                dp[i]=dp[i-1];
            }
            if(ba.compareTo("26")<=0&&ba.compareTo("10")>=0){
                if(i>=2) dp[i]+=dp[i-2];
                else dp[i]+=1;
            }
        }
        return dp[dp.length-1];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solve("12"));
    }
}
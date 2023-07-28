package com.alg.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class P228 {
    static class Solution {
        public List<String> summaryRanges(int[] nums) {
            List<String> ans = new ArrayList<>();
            int fast = 0, slow = 0;
            while (fast < nums.length) {
                StringBuilder sb = new StringBuilder();
                slow = fast;
                while (fast < nums.length - 1 && nums[fast] + 1 == nums[fast + 1]) fast++;
                if(fast==slow){
                    sb.append(nums[fast]);
                }
                else {
                    sb.append(nums[slow]).append("->").append(nums[fast]);
                }
                fast++;
                ans.add(sb.toString());
            }
            return ans;
        }

        public static void main(String[] args) {

            Solution solution = new Solution();
            List<String> ans = solution.summaryRanges(new int[]{-1});
            System.out.println(ans);
        }
    }
}

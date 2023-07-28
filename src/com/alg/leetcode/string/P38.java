package com.alg.leetcode.string;

public class P38 {
    class Solution {
        public String countAndSay(int n) {
            if(n==1) return "1";
            if(n==2) return "11";
            int times = 2;
            String ans = "11";
            while (++times<=n) {
                StringBuilder sb = new StringBuilder();
                char anchor = ans.charAt(0);
                int cnt=1;
                for(int i=1;i<ans.length();i++) {
                   if(ans.charAt(i)==anchor) cnt++;
                   else {
                       sb.append(cnt).append(anchor);
                       anchor = ans.charAt(i);
                       cnt=1;
                   }
                   if(i==ans.length()-1) {
                       sb.append(cnt).append(anchor);
                   }
                }
                ans = new String(sb);
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P38().new Solution();
        System.out.println(solution.countAndSay(10));
    }
}

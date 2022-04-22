package com.alg.sword.jz48;

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param s string字符串 
     * @return int整型
     */
    public int lengthOfLongestSubstring (String s) {
        // write code here
        HashSet<Character> set = new HashSet<>();
        int ans = Integer.MIN_VALUE;
        for(int i=0,j = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                set.clear();
                j=i-1;
                while (s.charAt(j)!=c) {
                    set.add(s.charAt(j));
                    j--;
                }
                j++;
            }
            set.add(c);
            ans = Math.max(i-j+1,ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("dvdf"));
    }
}
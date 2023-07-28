package com.alg.leetcode.map;

import java.util.HashMap;
import java.util.Map;

public class P1189 {
    class Solution {
        public int maxNumberOfBalloons(String text) {
            char[] carr = text.toCharArray();
            Map<Character,Integer> map = new HashMap<>();
            for(char c:carr) {
                map.put(c,map.getOrDefault(c,0)+1);
            }

            int ans = 0;
            char [] targets = "balloon".toCharArray();

            while (true) {
                boolean flag = false;
                for(char c:targets) {
                    if(map.getOrDefault(c,0)<1) {
                        flag=true;
                        break;
                    }
                    map.put(c,map.getOrDefault(c,0)-1);
                }
                if(flag) break;
                ans++;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        int ans = new P1189().new Solution().maxNumberOfBalloons("balloon");
        System.out.println(ans);
    }
}

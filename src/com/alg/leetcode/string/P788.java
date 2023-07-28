package com.alg.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class P788 {
    class Solution {
        public int rotatedDigits(int N) {
            Map<Character,Character> map = new HashMap<Character, Character>(){{
                put('0','0');
                put('1','1');
                put('2','5');
                put('5','2');
                put('6','9');
                put('8','8');
                put('9','6');
            }};

            int ans = 0;
            for(int i=1;i<=N;i++) {
                String str = String.valueOf(i);
                char[] chars = str.toCharArray();
                boolean good = true;
                StringBuilder sb = new StringBuilder();
                for(char c:chars) {
                    if(!map.containsKey(c)) {
                        good = false;
                        break;
                    }
                    sb.append(map.get(c));
                }
                if(good&&!(sb.toString()).equals(str)) {
                    System.out.println(sb+" "+str);
                    ans++;
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P788().new Solution();
        int a = solution.rotatedDigits(10);
        System.out.println(a);
    }
}

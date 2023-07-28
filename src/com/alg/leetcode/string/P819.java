package com.alg.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class P819 {
    class Solution {
        public String mostCommonWord(String paragraph, String[] banned) {

            for (char reg : "!?',;.".toCharArray())
                paragraph = paragraph.replace(String.valueOf(reg), " ");

            String[] strArrays = paragraph.split("\\s");
            Map<String, Integer> map = new HashMap<>();

            for (String str : strArrays) {
                str = str.toLowerCase();
                if(str.trim().equals("")) continue;
                boolean matched = false;
                for (String ban : banned) {
                    if (str.equals(ban)) matched = true;
                }
                if (!matched) {
                    map.put(str, map.getOrDefault(str, 0) + 1);
                }
            }
            int freq = 0;
            String ans = "";
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() > freq) {
                    freq = entry.getValue();
                    ans = entry.getKey();
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution   = new P819().new Solution();
        String ans = solution.mostCommonWord("a, a, a, a, b,b,b,c, c",new String[]{"a"});
        System.out.println(ans);
    }
}

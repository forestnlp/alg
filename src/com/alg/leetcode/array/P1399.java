package com.alg.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class P1399 {
    class Solution {
        public int countLargestGroup(int n) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int i=1;i<=n;i++) {
                int key = 0;
                int tmp = i;
                while (tmp!=0) {
                    key+=tmp%10;
                    tmp = tmp/10;
                }
                map.put(key,map.getOrDefault(key,0)+1);
            }
            int cnt=0;
            int max = Integer.MIN_VALUE;
            for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
                if(entry.getValue()>max) {
                    max = entry.getValue();
                    cnt=1;
                }
                else if(entry.getValue()==max) {
                    cnt++;
                }
            }

            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P1399().new Solution();
        System.out.println(solution.countLargestGroup(13));
    }
}

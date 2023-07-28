package com.alg.leetcode.greedy;

import java.util.Arrays;

public class P455 {
    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);

            int ans = 0;
            for(int i=0;i<s.length;i++) {
                for(int k=0;k<g.length;k++) {
                    if(s[i]>=g[k]&&g[k]>0) {
                        ans++;
                        g[k] = -1;
                        break;
                    }
                }
            }

            return ans;
        }
    }
}

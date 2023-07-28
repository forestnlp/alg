package com.alg.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class P1560 {
    class Solution {
        public List<Integer> mostVisited(int n, int[] rounds) {
            List<Integer> ans = new ArrayList<>();
            int[] roundPassed = new int[n + 1];
            for (int k=0;k<rounds.length-1;k++) {
                int curStop = rounds[k];
                int nextStop = rounds[k+1];
                if(curStop<nextStop) {
                    for(int i=curStop;i<nextStop;i++) {
                        roundPassed[i]++;
                    }
                }
                else{
                    for(int i=curStop;i<=n;i++) {
                        roundPassed[i]++;
                    }
                    for(int i=1;i<nextStop;i++) {
                        roundPassed[i]++;
                    }
                }
            }

            roundPassed[rounds[rounds.length-1]]++;

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < roundPassed.length; i++)
                max = Math.max(roundPassed[i],max);

            for (int i = 0; i < roundPassed.length; i++)
                if(roundPassed[i]==max)
                    ans.add(i);

            return ans;
        }
    }

    public static void main(String[] args) {
        System.out.println(new P1560().new Solution().mostVisited(4, new int[]{1, 3, 1, 2}));
    }
}

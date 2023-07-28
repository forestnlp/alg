package com.alg.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class P989 {
    class Solution {
        public List<Integer> addToArrayForm(int[] A, int K) {
            List<Integer> ans = new ArrayList<>();

            List<Integer> Klist = new ArrayList<>();
            while (K!=0) {
                Klist.add(K%10);
                K = K/10;
            }

            int carry = 0;
            int maxlen = Math.max(A.length,Klist.size());

            for(int i=0;i<maxlen+1;i++) {
                int x = i<A.length?A[A.length-1-i]:0;
                int y = i<Klist.size()?Klist.get(i):0;
                int a = (x+y+carry);
                ans.add(0,(x+y+carry)%10);
                carry = a/10;
            }
            return ans.get(0)==0?ans.subList(1,ans.size()):ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P989().new Solution();
        List<Integer> res = solution.addToArrayForm(new int[]{1,2,0,0},34);
        System.out.printf("res:"+res);
    }
}

package com.alg.leetcode.stack;

import java.util.Arrays;

public class PM0503 {

    static class Solution {

        public int reverseBits(int num) {
            String str = Integer.toBinaryString(num);
            String [] arrays = str.split("0");
            if(arrays.length==0) return 1;
            int prelen = arrays[0].length();
            int maxlen = prelen;
            for(int i=1;i<arrays.length;i++){
                System.out.println(arrays[i].length());
                if(arrays[i]==null||arrays[i].equals("")) {
                    maxlen = Math.max(maxlen,prelen+1);
                    prelen = 0;
                }
                else {
                    maxlen = Math.max(maxlen,prelen+1+arrays[i].length());
                    prelen = arrays[i].length();
                }
            }
            return maxlen;
        }

    }

    public static void main(String[] args) {
        int len = new Solution().reverseBits(15);
        System.out.println(len);
    }
}

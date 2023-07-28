package com.alg.leetcode.array;

import java.util.*;

public class P914 {
    class Solution {
        public boolean hasGroupsSizeX(int[] deck) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int n:deck){
                map.put(n,map.getOrDefault(n,0)+1);
            }

            int gcd=-1;

            for(int occur :map.values()){
                if(occur<2) return false;
                if(gcd==-1) gcd=occur;
                gcd = gcd(gcd,occur);
            }

            if(gcd<2) return false;

            return true;
        }

        public int gcd(int a,int b){
            if(a%b==0) return b;
            else return gcd(b,a%b);
        }
    }

    public static void main(String[] args) {
        Solution solution = new P914().new Solution();
        boolean b = solution.hasGroupsSizeX(new int[]{1,1,2,2,2,2});
        System.out.println(b);
    }
}

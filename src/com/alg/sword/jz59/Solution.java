package com.alg.sword.jz59;

import java.util.*;
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {

        ArrayList<Integer> ans = new ArrayList<>();

        int from =0,to= size-1;
        int max = Integer.MIN_VALUE;
        for(int i=from;i<=to;i++){
            max = Math.max(num[i],max);
        }
        ans.add(max);

        while (to<num.length-1){
            to++;
            if(num[to]>max) max = num[to];
            if(num[from]>=max){
                int max2 = Integer.MIN_VALUE;
                for(int i=from+1;i<=to;i++){
                    max2 = Math.max(num[i],max2);
                }
                max = max2;
            }
            from++;
            ans.add(max);
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxInWindows(new int[]{2,3,4,2,6,2,5,1},3));
    }
}
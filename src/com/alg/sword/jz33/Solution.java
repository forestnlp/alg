package com.alg.sword.jz33;

import java.util.Arrays;

public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence==null||sequence.length==0) return false;
        return helper(sequence,0,sequence.length-1);
    }

    public boolean helper(int[] sequence,int start,int end){
        if(start>=end) return true;
        int root = sequence[end];
        int index = start;
        boolean flag = false;
        for(int i=start;i<end;i++){
            int cur = sequence[i];
            if(cur>sequence[end]&&!flag) {
                flag = true;
                index = i;
            }
            if(flag) {
                if(cur<sequence[end]) return false;
            }
        }
        return helper(sequence,start,index-1)&&helper(sequence,index,end-1);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().VerifySquenceOfBST(new int[]{10,2,6}));;
    }
}
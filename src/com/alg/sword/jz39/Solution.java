package com.alg.sword.jz39;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array==null||array.length==0) return -1;
        int commons = array[0];
        int count = 1;
        for(int i=1;i<array.length;i++) {
            int v = array[i];
            if(v==commons){
                count++;
            }
            else {
                count--;
                if(count<=0) {
                    count=1;
                    commons = v;
                }
            }
        }
        return commons;
    }
}
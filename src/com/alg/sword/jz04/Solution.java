package com.alg.sword.jz04;

import java.util.HashSet;

public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array==null||array.length==0||array[0].length==0) return false;
        //前置判断
        int r = 0;
        int c = array[0].length-1;
        //核心是右上角哨兵
        while (r<array.length&&c>=0) {
            int curnum = array[r][c];
            if(target==curnum)
                return true;
            else if(curnum<target)
                r++;
            else
                c--;
        }
        return false;
    }
}
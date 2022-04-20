package com.alg.sword.jz49;

import java.util.ArrayList;

public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index==0) return 0;
        ArrayList<Integer> uglies = new ArrayList<>();
        int i2=0,i3=0,i5=0;
        int idx = 0;
        uglies.add(1);
        while (idx<index-1) {
            int c2 = uglies.get(i2)*2;
            int c3 = uglies.get(i3)*3;
            int c5 = uglies.get(i5)*5;
            int c = Math.min(Math.min(c2,c3),c5);
            if(c==c2) i2++;
            if(c==c3) i3++;
            if(c==c5) i5++;
            idx++;
            uglies.add(c);
            System.out.println(uglies);
        }
        return uglies.get(uglies.size()-1);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().GetUglyNumber_Solution(7));
    }
}
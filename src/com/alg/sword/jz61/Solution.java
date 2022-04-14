package com.alg.sword.jz61;

import java.util.Arrays;

public class Solution {
    public boolean IsContinuous(int [] numbers) {
        Arrays.sort(numbers);
        int zeros = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==0) zeros++;
        }
        for (int i = numbers.length-1; i >0 ; i--) {
            int cur = numbers[i];
            int next = numbers[i-1];
            if(next==0) return true;
            if(cur==next) return false;
            if(cur!=next+1) {
                zeros =zeros-(cur-next)+1;
                if(zeros<0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().IsContinuous(new int[]{6,0,2,0,4}));
    }
}
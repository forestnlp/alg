package com.alg.sword.jz61;

import java.util.Arrays;

public class Solution2 {
    public boolean IsContinuous(int[] numbers) {
        Arrays.sort(numbers);
        int max = numbers[4];
        int zeros = 0;
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]==0) zeros++;
            else if(numbers[i]==numbers[i+1]) return false;
        }
        int min = numbers[zeros];
        return max-min<5;
    }

    public static void main(String[] args) {
    }
}
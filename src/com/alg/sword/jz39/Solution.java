package com.alg.sword.jz39;

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {

        int votes = 0;
        int candidate = -1;
        for (int i = 0; i < array.length; i++) {
            if(votes==0){
                votes=1;
                candidate = array[i];
            }
            else {
                if(array[i]==candidate){
                    votes++;
                }
                else {
                    votes--;
                }
            }
        }
        return candidate;
    }
}
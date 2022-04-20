package com.alg.sword.jz57;

import java.util.*;

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int l=0,r=array.length-1;
        ArrayList<Integer> ans = new ArrayList<>();
        while (l<r){
            if(array[l]+array[r]==sum) {
                ans.add(array[l]);
                ans.add(array[r]);
                return ans;
            }
            else if(array[l]+array[r]<sum){
                l++;
            }
            else {
                r--;
            }
        }
        return ans;
    }
}
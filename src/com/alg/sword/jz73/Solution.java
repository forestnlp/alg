package com.alg.sword.jz73;

public class Solution {
    public String ReverseSentence(String str) {
        StringBuilder rev = new StringBuilder();
        String [] arr = str.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            rev.append(arr[i]);
            if(i>0) rev.append(" ");
        }
        return rev.toString();
    }
}
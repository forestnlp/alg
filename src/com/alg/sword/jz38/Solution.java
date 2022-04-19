package com.alg.sword.jz38;

import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
    public ArrayList<String> Permutation(String str) {
        HashSet<String> set = new HashSet<>();
        StringBuilder path = new StringBuilder();
        backtrace(set,path,str);
        return new ArrayList<>(set);
    }

    public void backtrace(HashSet<String> ans, StringBuilder path,String src) {
        if(src.length()==0) ans.add(path.toString());
        for(int i=0;i<src.length();i++){
            path.append(src.charAt(i));
            String newsrc = new StringBuilder(src).deleteCharAt(i).toString();
            backtrace(ans,path,newsrc);
            path.deleteCharAt(path.length()-1);
        }
    }
}
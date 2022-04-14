package com.alg.sword.jz50;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int FirstNotRepeatingChar(String str) {
        Map<Character,Integer> map = new HashMap<>();
        for (char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1) return i;
        }
        return -1;
    }
}
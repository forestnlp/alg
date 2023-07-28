package com.alg.leetcode.map;

import java.util.HashMap;
import java.util.Map;

public class P748 {
    class Solution {
        public String shortestCompletingWord(String licensePlate, String[] words) {
            licensePlate = licensePlate.toLowerCase();
            StringBuffer sb = new StringBuffer();
            for(int i=0;i<licensePlate.length();i++) {
                if(licensePlate.charAt(i)>='a'&&licensePlate.charAt(i)<='z')
                    sb.append(licensePlate.charAt(i));
            }

            String ans = "";
            int len = Integer.MAX_VALUE;
            for(String word:words){
                if(matched(sb.toString(),word)&&word.length()<len){
                    ans = word;
                    len = word.length();
                }
            }
            return ans;
        }

        private boolean matched(String licensePlate,String word){
            Map<Character,Integer> map = new HashMap<>();
            for(int i=0;i<word.length();i++) {
                map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
            }
            for(int i=0;i<licensePlate.length();i++){
                map.put(licensePlate.charAt(i),map.getOrDefault(licensePlate.charAt(i),0)-1);
                if(map.getOrDefault(licensePlate.charAt(i),0)<0)
                    return false;
            }
            return true;
        }
    }
}

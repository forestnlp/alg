package com.alg.leetcode.backtracing;

import java.util.ArrayList;
import java.util.List;

public class P17M {
    static class Solution {

        private String letterMap[] = {
                " ",    //0
                "",     //1
                "abc",  //2
                "def",  //3
                "ghi",  //4
                "jkl",  //5
                "mno",  //6
                "pqrs", //7
                "tuv",  //8
                "wxyz"  //9
        };

        List<String> ans;

        public List<String> letterCombinations(String digits) {
            ans = new ArrayList<>();
            if(digits.equals(""))
                return ans;
            backtracing(digits,new StringBuilder());
            return ans;
        }

        public void backtracing(String digits,StringBuilder track) {
            if(track.length()==digits.length()){
                ans.add(track.toString());
                return;
            }
            int k=track.length();
            char c = digits.charAt(k);
            String letters = letterMap[c-'0'];
            for(int i=0;i<letters.length();i++){
                backtracing(digits,track.append(letters.charAt(i)));
                track.deleteCharAt(track.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations("23"));
    }
}

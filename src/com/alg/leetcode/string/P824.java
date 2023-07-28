package com.alg.leetcode.string;

public class P824 {
    class Solution {
        public String toGoatLatin(String S) {
            String [] strArray = S.split("\\s");
            String dic = "aeiouAEIOU";
            StringBuffer sb = new StringBuffer();
            for(int k=0;k<strArray.length;k++) {
                StringBuffer str = new StringBuffer(strArray[k]);
                if(dic.indexOf(str.charAt(0))==-1) {
                    str.append(str.charAt(0));
                    str.deleteCharAt(0);
                }
                str.append("ma");
                for(int i=0;i<k+1;i++) {
                    str=str.append('a');
                }
                sb.append(str);
                if(k!=strArray.length-1) sb.append(" ");
            }
            return sb.toString();
        }
    }
}

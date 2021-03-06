package com.alg.sword.jz05;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param s string字符串 
     * @return string字符串
     */
    public String replaceSpace (String s) {
        // write code here
        StringBuilder sb = new StringBuilder();
        for (char c:s.toCharArray()){
            if(c==' ') sb.append("%20");
            else sb.append(c);
        }
        return sb.toString();
    }
}
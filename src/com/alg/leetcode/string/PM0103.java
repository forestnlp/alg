package com.alg.leetcode.string;

public class PM0103 {
    static class Solution {
        public String replaceSpaces(String S, int length) {
            char [] array = S.toCharArray();
            int j = S.length()-1;
            System.out.println(j);
            for(int i=length-1;i>=0;i--) {
                if(array[i]==' '){
                    array[j--]='0';
                    array[j--]='2';
                    array[j--]='%';
                }
                else {
                    array[j--] = array[i];
                }
            }
            System.out.println(j);
            return String.valueOf(array,j+1,S.length()-j-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().replaceSpaces("Mr John Smith    ",13));
    }
}

package com.alg.sword.jz12;

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param matrix char字符型二维数组 
     * @param word string字符串
     * @return bool布尔型
     */
    public boolean hasPath (char[][] matrix, String word) {
        // write code here
        if(matrix==null||matrix.length==0||matrix[0].length==0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i=0;i<m;i++) {
            for(int j=0;j<n;j++){
                if(dfs(matrix,word,0,i,j))
                    return true;
            }
        }
        return false;
    }

    public boolean dfs(char[][] matrix,String word,int pos,int i,int j) {

        int m = matrix.length;
        int n = matrix[0].length;

        if(i<0||i>=m||j<0||j>=n||matrix[i][j]!=word.charAt(pos)||matrix[i][j]=='.') return false;

        char cur = matrix[i][j];
        matrix[i][j] = '.';

        if(pos == word.length()-1) return true;

        boolean found = false;
        found |= dfs(matrix,word,pos+1,i+1,j);
        found |= dfs(matrix,word,pos+1,i-1,j);
        found |= dfs(matrix,word,pos+1,i,j+1);
        found |= dfs(matrix,word,pos+1,i,j-1);

        matrix[i][j] = cur;
        return found;
    }
}
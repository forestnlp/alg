package com.alg.sword.jz13;

public class Solution {


    public int movingCount(int threshold, int rows, int cols) {
        boolean[][] visited = new boolean[rows][cols];
        int ans = move(threshold,rows,cols,visited,0,0);
        return ans;
    }

    public int move(int threshold, int rows, int cols, boolean[][] visited , int r, int c){
        int add = getsum(r)+getsum(c);
        if(r<0||r>=rows||c<0||c>=cols||add>threshold||visited[r][c]) return 0;
        visited[r][c] = true;
        return 1+ move(threshold,rows,cols,visited,r+1,c)+ move(threshold,rows,cols,visited,r-1,c)+ move(threshold,rows,cols,visited,r,c+1)+ move(threshold,rows,cols,visited,r+1,c-1);
    }

    public int getsum(int n){
        int m = 0;
        while (n>0){
            m+=n%10;
            n /=10;
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().getsum(123));
    }
}
package com.alg.leetcode.dfs;

public class PM0810 {
    class Solution {
        private int originalColor;

        private int[] dx = {1,0,-1,0};
        private int[] dy = {0,1,0,-1};

        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            originalColor = image[sr][sc];
            if(newColor==originalColor) return image;
            dfs(image, sr, sc, newColor);
            return image;
        }

        public void dfs(int[][] image, int sr, int sc, int newColor) {
            if(sr<0||sr>image.length-1||sc<0||sc>image[0].length-1) return;
            if(image[sr][sc]==originalColor&&image[sr][sc]!=newColor){
                image[sr][sc] = newColor;

                for(int i=0;i<dx.length;i++){
                    int nsr = dx[i]+sr;
                    int nsc = dy[i]+sc;
                    dfs(image,nsr,nsc,newColor);
                }
            }
        }
    }
}

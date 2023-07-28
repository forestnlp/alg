package com.alg.leetcode.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PM0802M {
    class Solution {

        List<List<Integer>> ans;
        boolean[][] visited;

        public List<List<Integer>> pathWithObstacles(int[][] obstacleGrid) {
            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;
            visited = new boolean[m][n];
            ans = new ArrayList<>();
            dfs(obstacleGrid,0,0);
            return ans;
        }

        public boolean dfs(int[][] obstacleGrid,int x,int y){
            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;
            if(x>=m||y>=n||obstacleGrid[x][y]==1||visited[x][y]) return false;
            if(x==m-1&&y==n-1){
                ans.add(Arrays.asList(x,y));
                return true;
            }
            ans.add(Arrays.asList(x,y));

            visited[x][y]=true;
            if(dfs(obstacleGrid,x+1,y)) return true;
            if(dfs(obstacleGrid,x,y+1)) return true;
            ans.remove(ans.size()-1);
            return false;
        }
    }
}

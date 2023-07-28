package com.alg.leetcode.array;

public class P1232 {
    class Solution {
        public boolean checkStraightLine(int[][] coordinates) {
            if(coordinates==null||coordinates.length<2) return false;

            int x = coordinates[1][0]-coordinates[0][0];
            int y = coordinates[1][1]-coordinates[0][1];

            for(int i=1;i<coordinates.length;i++) {
                int ty = coordinates[i][1]-coordinates[i-1][1];
                int tx = coordinates[i][0]-coordinates[i-1][0];

                if(ty*x!=tx*y) return false;
            }

            return true;
        }
    }
}

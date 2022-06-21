package com.alg.dog.unionfind.offer116;

import com.alg.dog.unionfind.UF;

public class Solution {
    public int findCircleNum(int[][] isConnected) {
        if(isConnected==null||isConnected.length==0) return 0;
        int n = isConnected.length;
        UF uf = new UF(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(isConnected[i][j]==1){
                    uf.union(i,j);
                }
            }
        }
        return uf.count();
    }
}
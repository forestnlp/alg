package com.alg.leetcode.tree;

public class P96M {
    public int numTrees(int n) {
        /**
         动态规划，G(n)=f(1)+f(2)+f(3)+f(4)+...+f(n)
         f(i)=G(i−1)∗G(n−i)
         G(n)=G(0)∗G(n−1)+G(1)∗(n−2)+...+G(n−1)∗G(0)
         */

        int[] G = new int [n+1];

        G[0] = 1;
        G[1] = 1;

        for(int i=2;i<=n;i++) {
            //求G(2),G(3)...
            for(int j=1;j<=i;j++)
                G[i]+= G[i-j]*G[j-1];
        }

        return G[n];
    }
}

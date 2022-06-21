package com.alg.dog.unionfind;

/**
 * @Auther: 刘杰
 * @Date: 2022/6/21 - 06 - 21 - 14:53
 * @Description: com.alg.dog.unionfind
 * @version: 1.0
 */
public class UF {
    private int count;
    private int[] parent;

    public UF(int n) {
        this.count = n;
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) {
            return;
        }
        parent[rootQ] = rootP;
        count--;
    }

    public boolean connected(int p,int q){
        int rootP = find(p);
        int rootQ = find(q);
        return rootP==rootQ;
    }

    public int find(int x) {
        if(parent[x]!=x){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public int count(){
        return count;
    }
}

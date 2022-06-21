package com.alg.dog.unionfind.leetcode990;

import com.alg.dog.unionfind.UF;

public class Solution {
    public boolean equationsPossible(String[] equations) {
        UF uf = new UF(26);
        for (String equation:equations){
            int p = equation.charAt(0)-'a';
            int q = equation.charAt(3)-'a';
            if(equation.charAt(1)=='='){
                uf.union(p,q);
            }
        }

        for(String equation:equations){
            int p = equation.charAt(0)-'a';
            int q = equation.charAt(3)-'a';
            if(equation.charAt(1)=='!'){
                if(uf.connected(p,q))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] equations = new String[]{"a==b","b!=a"};
        Solution solution = new Solution();
        boolean b = solution.equationsPossible(equations);
        System.out.println(b);
    }
}
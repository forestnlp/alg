package com.alg.leetcode.tree;

import java.util.*;

public class P1339M {
    class Solution {
        long sum;
        List<Long> values;
        public int maxProduct(TreeNode root) {
            values = new ArrayList<>();
            sum = dfs(root);
            long max = 0;
            for(int i=values.size()/2;i<values.size();i++) {
                long product = values.get(i)*(sum-values.get(i));
                if(product>max) max = product;
            }
            return (int)(max % (int)(1e9 + 7));
        }

        public long dfs(TreeNode node) {
            if(node==null) return 0;
            long sum = dfs(node.left)+dfs(node.right)+node.val;
            values.add(sum);
            return sum;
        }
    }
    public static void main(String[] args) {
        P1339M plan = new P1339M();
        Solution solution = plan.new Solution();
        TreeNode node = TreeNode.getInstance(new Integer[]{1,null,2,3,4,null,null,5,6});
        long res = solution.maxProduct(node);
        System.out.println(res);
    }
}

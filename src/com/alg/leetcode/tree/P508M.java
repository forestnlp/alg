package com.alg.leetcode.tree;

import java.util.*;

public class P508M {
    class Solution {

        Map<Integer,Integer> occurMap = new HashMap<>();

        public int[] findFrequentTreeSum(TreeNode root) {
            if(root==null) return new int[]{};
            helper(root);
            int mostFrequency = Collections.max(occurMap.values());
            List<Integer> occurList = new ArrayList<>();
            for(Map.Entry<Integer,Integer> e:occurMap.entrySet()) {
                if(e.getValue()==mostFrequency)
                    occurList.add(e.getKey());
            }
            int [] rtn = new int[occurList.size()];
            for(int i=0;i<occurList.size();i++) {
                rtn[i] = occurList.get(i);
            }
            return rtn;
        }

        public int helper(TreeNode node) {
            if(node==null) return 0;
            int val = node.val + helper(node.left) + helper(node.right);
            occurMap.put(val,occurMap.get(val)==null?0:occurMap.get(val)+1);
            if(node.left==null&&node.right==null){
                return node.val;
            }
            return val;
        }
    }
}

package com.alg.leetcode.tree;

import java.util.*;

public class P652M {
    class Solution {
        Map<String,Integer> map = new HashMap<>();
        List<TreeNode> ans = new ArrayList<>();

        public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
            serialize(root);
            return ans;
        }

        public String serialize(TreeNode node) {
            if(node==null) return null;
            String key =  node.val+" "+serialize(node.left)+" "+serialize(node.right);
            map.put(key,map.getOrDefault(key,0)+1);
            if(map.get(key)==2)
                ans.add(node);
            return key;
        }
    }
}

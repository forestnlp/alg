package com.alg.leetcode.tree;

import java.util.*;

public class P863M {
    class Solution {

        Map<TreeNode, TreeNode> parents;
        List<Integer> ans;

        public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
            parents = new HashMap<>();
            ans = new ArrayList<>();
            dfs(root);
            findParents(parents.get(target),K-1);
            findSons(target,K);
            fincCosins(parents.get(target),target,K);
            return ans;
        }

        public void findParents(TreeNode node,int K) {
            if(node==null) return;
            if(K==0){
                ans.add(node.val);
                return;
            }
            findParents(parents.get(node),K-1);
        }

        public void findSons(TreeNode node,int K) {
            if(node==null) return;
            if(K<0) return;
            if(K==0) {
                ans.add(node.val);
                return;
            }
            findSons(node.left,K-1);
            findSons(node.right,K-1);
        }

        public void fincCosins(TreeNode parent,TreeNode node,int K) {
            if(parent==null) return;
            if(parent.left==node)
                findSons(parent.right,K-2);
            if(parent.right==node)
                findSons(parent.left,K-2);
            fincCosins(parents.get(parent),parent,K-1);
        }

        public void dfs(TreeNode node) {
            if (node == null) return;
            if (node.left != null)
                parents.put(node.left, node);
            if (node.right != null)
                parents.put(node.right, node);
            dfs(node.left);
            dfs(node.right);
        }
    }

}

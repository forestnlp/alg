package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class P1457M {
    class Solution {

        List<List<Integer>> paths;
        List<Integer> path;

        public int pseudoPalindromicPaths(TreeNode root) {
            paths  = new ArrayList<>();
            path = new ArrayList<>();
            dfs(root);
            int count = 0;
            for(List<Integer> path:paths){
                if(isPalindromic(path)){
                    System.out.println(path);
                    count++;
                }
            }
            return count;
        }

        public void dfs(TreeNode node) {
            if(node==null) return;
            path.add(node.val);
            if(node.left==null&&node.right==null) {
                paths.add(new ArrayList<>(path));
            }
            dfs(node.left);
            dfs(node.right);
            path.remove(path.size()-1);
        }

        public boolean isPalindromic(List<Integer> path) {
            int [] sz = new int[10];
            for(int i=0;i<path.size();i++) {
                sz[path.get(i)]++;
            }
            int flag= 0;
            for(int i=0;i<sz.length;i++) {
                if(sz[i]%2!=0) flag++;
            }
            if(flag>1) return false;
            return true;
        }
    }

    public static void main(String[] args) {
        P1457M plan = new P1457M();
        Solution solution = plan.new Solution();
        Integer[] array = {2,3,1,3,1,null,1};
        TreeNode node = TreeNode.getInstance(array);
        int count = solution.pseudoPalindromicPaths(node);
        System.out.println(count);
    }
}

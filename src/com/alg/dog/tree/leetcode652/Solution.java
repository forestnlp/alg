package com.alg.dog.tree.leetcode652;

import com.alg.dog.tree.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        helper(root);
        return res;
    }

    HashMap<String, Integer> map = new HashMap<>();
    LinkedList<TreeNode> res = new LinkedList<>();

    public String helper(TreeNode root){
        if(root==null) {
            return "#";
        }
        String left = helper(root.left);
        String right = helper(root.right);
        String tree = left+","+right+","+root.val;

        int freq = map.getOrDefault(tree,0);
        if(freq==1){
            res.add(root);
        }
        map.put(tree,freq+1);
        return tree;
    }
}
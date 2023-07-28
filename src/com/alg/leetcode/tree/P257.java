package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class P257 {

    class Solution {
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> paths = new ArrayList<>();
            helper(root,"",paths);
            return paths;
        }

        public void helper(TreeNode node,String path,List<String> paths) {
            if(node==null) return;
            if(node.right==null&&node.left==null) {
                path += node.val;
                paths.add(path);
            }
            else{
                helper(node.right,path+node.val+"->",paths);
                helper(node.left,path+node.val+"->",paths);
            }
        }
    }

}

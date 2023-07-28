package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class P894M {
    class Solution {

        public List<TreeNode> allPossibleFBT(int N) {
            List<TreeNode> ans = new ArrayList<>();
            if(N%2==0) return ans;
            if(N==1) {
                ans.add(new TreeNode(0));
                return ans;
            }

            for(int i=1;i<N;i=i+2) {
                List<TreeNode> leftList = allPossibleFBT(i);
                List<TreeNode> rightList = allPossibleFBT(N-i-1);
                for(TreeNode leftNode:leftList) {
                    for(TreeNode rightNode:rightList) {
                        TreeNode root = new TreeNode(0);
                        root.left = leftNode;
                        root.right = rightNode;
                        ans.add(root);
                    }
                }
            }
            return ans;
        }
    }
}

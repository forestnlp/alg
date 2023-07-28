package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class P1022 {

    class Solution {

        int sum = 0;

        public int sumRootToLeaf(TreeNode root) {
            preOrder(root,new StringBuffer());
            return sum;
        }

        public void preOrder(TreeNode node, StringBuffer sb) {
            if(node==null) return;

            sb.append(node.val);

            if(node.left==null&&node.right==null) {
                int num = Integer.parseInt(sb.toString(),2);
                System.out.println(sb);
                sum += num;
            }

            preOrder(node.left,sb);
            preOrder(node.right,sb);

            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        Integer [] array = {1,0,1,0,1,0,1};
        TreeNode node = TreeNode.getInstance(array);
        P1022 problem = new P1022();
        Solution solution = problem.new Solution();
        solution.sumRootToLeaf(node);
    }
}

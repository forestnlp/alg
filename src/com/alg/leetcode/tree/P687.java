package com.alg.leetcode.tree;

/**
 * 这套题厉害了。
 * 直接看代码和注释吧
 */
public class P687 {
        class Solution {

            int maxlen = 0;

            public int longestUnivaluePath(TreeNode root) {
                helper(root);
                return maxlen;
            }

            //函数返回的是链条长度
            public int helper(TreeNode node) {
                if(node==null) return 0;
                //取出其左右子树的链条长度
                int leftSon = helper(node.left);
                int rightSon = helper(node.right);
                //计算父节点node联通左右节点的长度

                int left=0,right=0;
                if(node.left!=null&&node.val==node.left.val)
                    left = leftSon+1;//考虑加上node，正好多一条边
                if(node.right!=null&&node.val==node.right.val)
                    right = rightSon+1;//考虑加上node，正好多一条边


                int len = Math.max(left,right);
                //打通左右
                if(node.left!=null&&node.right!=null&&node.left.val==node.right.val&&node.left.val==node.val)
                    len = left+right;

                if(len>maxlen) maxlen=len;

                return Math.max(left,right);
            }
        }
}

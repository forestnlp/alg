package com.alg.leetcode.tree;

public class P889M {
    class Solution {
        public TreeNode constructFromPrePost(int[] pre, int[] post) {
            return helper(pre,post,0,pre.length-1,0,post.length-1);
        }

        public TreeNode helper(int[] pre,int[] post,int preStart,int preEnd,int postStart,int postEnd) {
            if(preStart>preEnd) return null;
            //找到根节点
            TreeNode root = new TreeNode(pre[preStart]);
            if(preStart==preEnd) return root;
            //找到其左子树和右子树
            int leftRootVal = pre[preStart+1];
            int i;
            for(i=postStart;i<=postEnd;i++) {
                if(post[i]==leftRootVal)
                    break;
            }
            int leftlen = i - postStart + 1;
            int rightlen = postEnd-1-i;
            root.left = helper(pre,post,preStart+1,preStart+leftlen,postStart,i);
            root.right = helper(pre,post,preStart+leftlen+1,preEnd,i+1,postEnd-1);
            return root;
        }
    }


    public static void main(String[] args) {
        int[] pre = {1,2,4,5,3,6,7};
        int[] post = {4,5,2,6,7,3,1};
        P889M problem = new P889M();
        Solution solution = problem.new Solution();
        TreeNode root = solution.constructFromPrePost(pre,post);
        System.out.println(root.bfs());
    }
}

package com.alg.leetcode.tree;

public class P1367M {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            ListNode node = this;
            String str ="";
            while(node!=null) {
                str+=node.val+" ";
                node = node.next;
            }
            return str;
        }
    }

        class Solution {

            public boolean isSubPath(ListNode head, TreeNode root) {
                if(head==null) return true;
                if(root==null) return false;
                return isSameRoute(head,root)||isSubPath(head,root.left)||isSubPath(head,root.right);
            }

            public boolean isSameRoute(ListNode head,TreeNode root) {
                if(head==null) return true;
                if(root==null) return false;
                return head.val==root.val&&(isSameRoute(head.next,root.left)||isSameRoute(head.next,root.right));
            }
        }

    public static void main(String[] args) {
        P1367M plan = new P1367M();
        Solution solution = plan.new Solution();
        TreeNode root = TreeNode.getInstance(new Integer[]{1,null,1,10,1,9});
        ListNode head = plan.new ListNode(1);
        head.next = plan.new ListNode(10);
        boolean isSub = solution.isSubPath(head,root);
        System.out.println(isSub);
    }
}

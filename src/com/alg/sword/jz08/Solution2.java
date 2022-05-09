package com.alg.sword.jz08;

public class Solution2 {
    class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }


    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        //如果该节点有右子树,最左子树的叶子
        if (pNode.right != null) {
            TreeLinkNode target = pNode.right;
            while (target.left != null) {
                target = target.left;
            }
            return target;
        }

        //如果该节点没有右子树
        //那么分为两种情况，
        if (pNode.next != null) {
            //1，自己是父节点的左子树,返回父节点
            if (pNode.next.left == pNode) return pNode.next;
            //2.自己是父节点的右子树，则先找父节点，然后看父节点是左派还是右派。
            TreeLinkNode parent = pNode.next;
            //找到不是右子树的祖先
            while (parent.next != null) {
                if (parent == parent.next.right)
                    parent = parent.next;
                else
                    break;
            }
            //终于找到祖先不是右子树了。
            //返回祖先的父亲
            return parent.next;
        }
        return null;
    }
}
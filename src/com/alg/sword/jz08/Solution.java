package com.alg.sword.jz08;

import java.util.LinkedList;
import java.util.List;


public class Solution {
    class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;
        TreeLinkNode(int val) {
            this.val = val;
        }
    }
    public void intravel(TreeLinkNode node, List<TreeLinkNode> intravels) {
        if(node==null) return;

        intravel(node.left,intravels);
        intravels.add(node);
        intravel(node.right,intravels);
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        List<TreeLinkNode> intravels = new LinkedList<>();
        intravel(pNode,intravels);
        int pos = intravels.indexOf(pNode);
        if(pos==-1||pos==intravels.size()-1) return null;
        TreeLinkNode nextNode = intravels.get(pos+1);
        return nextNode;
    }
}
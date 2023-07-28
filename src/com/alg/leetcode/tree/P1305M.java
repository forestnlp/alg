package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1305M {
    class Solution {
        List<Integer> elements;

        public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            List<Integer> list1 = new ArrayList<>();
            dfs(root1,list1);
            List<Integer> list2 = new ArrayList<>();
            dfs(root2,list2);
            elements = new ArrayList<>(list1.size()+list2.size());
            merge(list1,list2,elements);
            return elements;
        }

        public void dfs(TreeNode node,List<Integer> list) {
            if(node==null) return;
            dfs(node.left,list);
            list.add(node.val);
            dfs(node.right,list);
        }

        public void merge(List<Integer> list1,List<Integer> list2,List<Integer> elements) {

            int i=0,j=0;

            while(i<list1.size()&&j<list2.size()) {
                if(list1.get(i)<list2.get(j)){
                    elements.add(list1.get(i));
                    i++;
                }
                else {
                    elements.add(list2.get(j));
                    j++;
                }
            }

            if(i==list1.size())
                elements.addAll(list2.subList(j,list2.size()));
            if(j==list2.size())
                elements.addAll(list1.subList(i,list1.size()));
        }
    }

    public static void main(String[] args) {
        P1305M plan = new P1305M();
        Solution solution = plan.new Solution();
        List<Integer> list1 = Arrays.asList(2,1,4);
        List<Integer> list2 = Arrays.asList(1,0,3);
        List<Integer> list3 = new ArrayList<>();
        solution.merge(list1,list2,list3);
        System.out.println(list3);
    }
}

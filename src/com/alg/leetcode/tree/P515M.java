package com.alg.leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P515M {

    class Solution {

        Map<Integer, Integer> largestMap = new HashMap<>();

        public List<Integer> largestValues(TreeNode root) {
            List<Integer> largestList = new ArrayList<>();
            dfs(root,1);
            for(int a:largestMap.values()) {
                largestList.add(a);
            }
            return largestList;
        }

        public void dfs(TreeNode node, int depth) {
            if (node == null) return;
            if (largestMap.get(depth)==null||node.val > largestMap.get(depth))
                largestMap.put(depth, node.val);
            dfs(node.left, depth + 1);
            dfs(node.right, depth + 1);
        }
    }
}

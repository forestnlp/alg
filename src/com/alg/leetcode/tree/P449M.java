package com.alg.leetcode.tree;

public class P449M {
    public class Codec {
        StringBuilder treeNodes;

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            treeNodes = new StringBuilder();
            if(root==null)
                return null;
            dfs(root);
            return treeNodes.deleteCharAt(treeNodes.length()-1).toString();
        }

        public void dfs(TreeNode node) {
            if(node==null) return;
            treeNodes.append(node.val);
            treeNodes.append(' ');
            dfs(node.left);
            dfs(node.right);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if(data==null) return null;
            String[] nodes_str = data.split(" ");
            if(nodes_str==null) return null;
            int [] nodes = new int[nodes_str.length];
            for(int i=0;i<nodes.length;i++)
                nodes[i] = Integer.parseInt(nodes_str[i]);

            return buildTree(nodes,0,nodes.length-1);
        }

        public TreeNode buildTree(int [] nodes,int low,int high) {
            if(low>high) return null;
            TreeNode root = new TreeNode(nodes[low]);
            int cutpoint=high+1;
            for(int i=low+1;i<=high;i++) {
                if(nodes[i]>root.val) {
                    cutpoint = i;
                    break;
                }
            }
            root.left = buildTree(nodes,low+1,cutpoint-1);
            root.right = buildTree(nodes,cutpoint,high);
            return root;
        }
    }

    public static void main(String[] args) {
        Integer [] array = {2,1,3};
        TreeNode node = TreeNode.getInstance(array);
        P449M problem = new P449M();
        Codec solution = problem.new Codec();
        String res = solution.serialize(node);
        System.out.println(res);

        TreeNode newNode = solution.deserialize(res);
        System.out.println(newNode);
        System.out.println(newNode.left);
        System.out.println(newNode.right);
    }
}

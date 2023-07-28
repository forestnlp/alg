package com.alg.leetcode.stack;

import java.util.Stack;

public class P71M {
    class Solution {
        public String simplifyPath(String path) {
            Stack<String> stack = new Stack<>();
            String[] paths = path.split("/");
            for (String dir : paths) {
                switch (dir) {
                    case ".":
                        break;
                    case "..":
                        if(!stack.isEmpty()) stack.pop();
                        break;
                    case "":
                        break;
                    default:
                        stack.push(dir);
                        break;
                }
            }

            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.insert(0, "/"+stack.pop());
            }
            return sb.length()==0?"/":sb.toString();
        }
    }

    public static void main(String[] args) {
        String paths = new P71M().new Solution().simplifyPath("/home/.././foo/");
        System.out.println(paths);
    }
}

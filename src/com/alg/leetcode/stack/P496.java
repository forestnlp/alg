package com.alg.leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class P496 {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            if(nums2==null||nums2.length==0) return new int[]{};
            //map存储最小de最大值
            Map<Integer,Integer> map = new HashMap<>(nums2.length);

            //单调栈，从栈中吸走其他元素。
            Stack<Integer> stack = new Stack<>();
            stack.push(nums2[0]);
            for(int i=1;i<nums2.length;i++) {
                int newElemnet = nums2[i];
                while (!stack.isEmpty()&&newElemnet>stack.peek()) {
                    map.put(stack.pop(),nums2[i]);
                }
                stack.push(newElemnet);
            }
            while (!stack.isEmpty()){
                map.put(stack.pop(),-1);
            }

            int[] ret = new int[nums1.length];
            for(int i=0;i<nums1.length;i++){
                ret[i] = map.get(nums1[i]);
            }
            return ret;
        }
    }
}

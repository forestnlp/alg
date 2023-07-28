package com.alg.leetcode.array;

public class P665 {
    class Solution {
        public boolean checkPossibility(int[] nums) {
            // 如果数组长度小于2直接返回True
            if (nums.length <= 2) {
                return true;
            }
            // 记录是否已经修改过
            boolean isChanged = false;
            for (int i = 0; i < nums.length - 1; i++) {
                // 前一个数大于后一个数时需要进行修改
                if (nums[i] > nums[i + 1]) {
                    if (!isChanged) {
                        // 实现修改数组的代码
                        if (i > 0 && nums[i + 1] < nums[i - 1]) {
                            nums[i + 1] = nums[i];
                        } else {
                            nums[i] = nums[i + 1];
                        }
                        // 改变是否已经修改过的状态
                        isChanged = true;
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }

    }
}

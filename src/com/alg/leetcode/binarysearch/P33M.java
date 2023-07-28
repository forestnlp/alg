package com.alg.leetcode.binarysearch;

public class P33M {
    //思路，mid落点后，总有半截有序
    class Solution {
        public int search(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) return mid;
                    //判断落点
                else if (nums[mid] >= nums[left]) {
                    if (target >= nums[left] && target < nums[mid])
                        right = mid - 1;
                    else
                        left = mid + 1;
                } else {
                    if (target > nums[mid] && target <= nums[right])
                        left = mid + 1;
                    else
                        right = mid -1 ;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 1};
        int target = 1;
        System.out.println(new P33M().new Solution().search(nums, target));
    }
}

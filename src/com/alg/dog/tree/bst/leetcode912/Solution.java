package com.alg.dog.tree.bst.leetcode912;

import java.util.Random;

public class Solution {
    public int[] sortArray(int[] nums) {
        QuickSort.sort(nums);
        return nums;
    }

    static class QuickSort {

        public static void sort(int[] nums) {
            shuffle(nums);
            sort(nums, 0, nums.length - 1);
        }

        public static void sort(int[] nums, int lo, int hi) {
            if (lo >= hi) return;
            int partition = partition(nums, lo, hi);
            sort(nums, lo, partition - 1);
            sort(nums, partition + 1, hi);
        }

        private static int partition(int[] nums, int lo, int hi) {
            int pivot = nums[lo];
            int i = lo + 1, j = hi;
            while (i <= j) {
                while (i < hi && nums[i] <= pivot) i++;
                while (j > lo && nums[j] >= pivot) j--;
                if (i >= j) break;
                swap(nums, i, j);
            }
            swap(nums, lo, j);
            return j;
        }

        static void shuffle(int[] nums) {
            Random random = new Random();
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                int r = i + random.nextInt(n - i);
                swap(nums, i, r);
            }
        }

        private static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

    }
}